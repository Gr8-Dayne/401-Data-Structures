package tree;

public class BinarySearchTree {

    Node root;
    Node next;

    // accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    public void add(Integer newNodeValue, Tree recipient){

        next = new Node(newNodeValue);

        while (root != null){
            if (root.nodeValue > newNodeValue && root.left.nodeValue != null){
                newNodeValue = root.left.nodeValue;

            }else if (root.nodeValue < newNodeValue){
                if (root.right.nodeValue != null) {
                    newNodeValue = root.right.nodeValue;
                }
            }
        }
        if (root == null){
            root.nodeValue = newNodeValue;
        }
    }

    // accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
    public boolean contains(Integer target){

        while (root != null){

        }

        return false;
    }

}

