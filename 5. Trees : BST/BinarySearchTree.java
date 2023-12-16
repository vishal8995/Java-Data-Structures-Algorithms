public class BinarySearchTree {
    
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // Insert
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (value == temp.value) return false;
            if (value < temp.value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // Contains
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null){
            if(value < temp.value) temp = temp.left;
            else if (value > temp.value) temp = temp.right;
            else return true;
        }
        return false;
    }
}
