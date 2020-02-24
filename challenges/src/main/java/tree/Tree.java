package tree;


import stacksandqueues.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;


// Credit: https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-15/resources/Trees.html
public class Tree<E> {

    public Node<E> root;

    // Any exceptions or errors that come from your code should be semantic, capture-able errors.
    // For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

    // returns an List of the values, ordered appropriately.
    public LinkedList<Integer> preOrder(Node<Integer> t){

        LinkedList<Integer> answer = new LinkedList<Integer>();
        if (t != null) {
            answer.add(t.nodeValue);
            answer.addAll(preOrder(t.left));
            answer.addAll(preOrder(t.right));
        }
        return answer;
    }



    // Code from TA James
    public void prePrint(Node<E> curr){
        if(curr == null){
            return;
        }
        System.out.println(curr);
        prePrint(curr.left);
        prePrint(curr.right);
    }



    // returns an array of the values, ordered appropriately.
    public LinkedList<Integer> inOrder(Node<Integer> t){

        LinkedList<Integer> answer = new LinkedList<>();
        if (t != null) {
            answer.addAll(inOrder(t.left));
            answer.add(t.nodeValue);
            answer.addAll(inOrder(t.right));
        }
        return answer;
    }

    // returns an array of the values, ordered appropriately.
    public LinkedList<Integer> postOrder(Node<Integer> t){

        LinkedList<Integer> answer = new LinkedList<Integer>();
        if (t != null) {
            answer.addAll(postOrder(t.left));
            answer.addAll(postOrder(t.right));
            answer.add(t.nodeValue);
        }
        return answer;
    }

    //
    // Code Challenge 17
    //


    // Credit: https://www.geeksforgeeks.org/level-order-tree-traversal/
    public LinkedList<E> breadthWithQueue(){
        try {
            LinkedList<E> valList = new LinkedList<>();
            breadthWithQueue(this.root, valList);
            return valList;
        } catch (NullPointerException e) {
            if(this.root == null){
                System.out.println(" ");
                System.out.println("-----OPERATION ABORTED-----");
                throw new IllegalArgumentException("UNABLE TO ACCEPT ARGUMENT");
            }
        }
        return null;
    }

    // Credit: https://stackoverflow.com/questions/5262308/how-do-implement-a-breadth-first-traversal
    private void breadthWithQueue (Node<E> rootNode, LinkedList<E> valList){

        if (rootNode.nodeValue == null) {
            System.out.println(" ");
            System.out.println("-----OPERATION ABORTED-----");
            throw new IllegalArgumentException("UNABLE TO ACCEPT NULL ROOT NODE");
        }

        Queue<Node> queueForBreadth = new Queue<>();
        Node<E> nodethaniel = new Node<>();
        queueForBreadth.enqueue(rootNode);
        while(!queueForBreadth.isEmpty()){
            nodethaniel = queueForBreadth.dequeue();
            valList.add(nodethaniel.nodeValue);
            if(nodethaniel.left != null){
                queueForBreadth.enqueue(nodethaniel.left);
            }
            if(nodethaniel.right != null){
                queueForBreadth.enqueue(nodethaniel.right);
            }
        }
    }

    //
    // Code Challenge 18
    //

    // Credit: https://docs.oracle.com/javase/7/docs/api/java/util/NoSuchElementException.html
    public Integer findMaximumValue(){
        if (this.root == null){
            System.out.println(" ");
            System.out.println("-----OPERATION ABORTED-----");
            throw new NoSuchElementException("UNABLE TO ACCEPT NULL ROOT NODE");
        }
        return findMaximumValue(this.root);
    }

    // Credit: Daisy helped me with this Method
    private Integer findMaximumValue(Node<E> rootNode){
        Integer potentialTopGun = (Integer) rootNode.nodeValue;
        if (rootNode.left != null){
            potentialTopGun = Math.max(potentialTopGun, findMaximumValue(rootNode.left));
        }
        if (rootNode.right != null){
            potentialTopGun = Math.max(potentialTopGun, findMaximumValue(rootNode.right));
        }
        return potentialTopGun;
    }
}


