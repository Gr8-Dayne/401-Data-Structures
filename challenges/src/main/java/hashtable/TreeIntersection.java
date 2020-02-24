package hashtable;


import tree.*;
import java.util.LinkedList;


// Credit: https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
// Credit: https://stackoverflow.com/questions/5728821/intersection-of-2-binary-search-trees
public class TreeIntersection {

    public static HashMap treeIntersection(BinarySearchTree treeOne, BinarySearchTree treeTwo){
        HashMap treeOneHashMap = new HashMap();
        HashMap commonValuesHashMap = new HashMap();

        // These being yellow puzzles me
        Node<Integer> root1 = treeOne.root;
        Node<Integer> root2 = treeTwo.root;
        LinkedList<String> treeTwoList = new LinkedList<>();
        System.out.println("\n" + "treeOne: ");
        inOrderTransverse(root1, treeOneHashMap);
        System.out.println("\n" + "treeTwo: ");
        inOrderLinkedList(root2, treeTwoList);
        System.out.println();

        // Credit: https://stackoverflow.com/questions/20969211/comparing-two-hashmaps-for-equal-values-and-same-key-sets
        for(String value : treeTwoList){
            if(treeOneHashMap.contains(value)){
                commonValuesHashMap.add(value, null);
            }
        }
        return commonValuesHashMap;
    }

    // Credit: https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
    public static void inOrderTransverse(Node<Integer> root, HashMap theHashening){
        if(root != null) {
            theHashening.add((root.nodeValue.toString()), null);
            inOrderTransverse(root.left, theHashening);
            System.out.print(root.nodeValue + " ");
            inOrderTransverse(root.right, theHashening);
        }
    }

    // Credit: https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
    public static void inOrderLinkedList(Node<Integer> root, LinkedList<String> theListening){
        if(root != null) {
            theListening.add((root.nodeValue.toString()));
            inOrderLinkedList(root.left, theListening);
            System.out.print(root.nodeValue + " ");
            inOrderLinkedList(root.right, theListening);
        }
    }

    // Code from my "Tree" class for reference
//    public LinkedList<Integer> inOrder(Node<Integer> t){
//        LinkedList<Integer> answer = new LinkedList<>();
//        if (t != null) {
//            answer.addAll(inOrder(t.left));
//            answer.add(t.nodeValue);
//            answer.addAll(inOrder(t.right));
//        }
//        return answer;
//    }
}


