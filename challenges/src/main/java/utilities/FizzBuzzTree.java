package utilities;


import tree.Tree;
import tree.Node;


public class FizzBuzzTree {

    // Credit: https://howtodoinjava.com/puzzles/fizzbuzz-solution-java/
    private static String fizzBuzzActual(int value){
        if (value % 3 == 0 && value % 5 == 0){
            return  "FizzBuzz";

        }else if(value % 5 == 0){
            return "Buzz";

        }else if(value % 3 == 0){
            return  "Fizz";

        }else{
            return String.format("%d", value);
        }
    }

    public static Tree<String> fizzBuzzTree(Tree<Integer> inputTree){
        Tree<String> newTree = new Tree<>();
        newTree.root = fizzBuzzTreeRoot(inputTree.root);
        return newTree;
    }

    private static Node<String> fizzBuzzTreeRoot(Node<Integer> root){
        Node<String> newNode = new Node<>();
        if(root != null){

            Node<String> left = fizzBuzzTreeRoot(root.left);
            Node<String> right  = fizzBuzzTreeRoot(root.right);
            newNode.nodeValue = fizzBuzzActual(root.nodeValue);

            newNode.left = left;
            newNode.right = right;
        }
        return newNode;
    }
}


