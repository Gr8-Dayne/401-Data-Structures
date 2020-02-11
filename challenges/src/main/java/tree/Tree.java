package tree;


import java.util.LinkedList;


// Credit: https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-15/resources/Trees.html
public class Tree<E> {

    public Node<E> root;

    // Any exceptions or errors that come from your code should be semantic, capturable errors.
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

        LinkedList<Integer> answer = new LinkedList<Integer>();

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
}
