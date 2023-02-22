package com.bst;
public class BinarySearchTree {
    Node root;
    public void PrintOrder() {
        Inorder(root);
    }
    public Node insertElements(Node root, int Data) {
        if (root == null) {
            Node newnode = new Node(Data);
            root = newnode;
            return root;
        }
        Node newnode = new Node(Data);
        if (newnode.compareTo(root) > 0) {
            root.RightNode = insertElements(root.RightNode, Data);
        } else if (newnode.compareTo(root) < 0) {
            root.LeftNode = insertElements(root.LeftNode, Data);
        }
        this.root = root;
        return root;
    }
    public static int Size(Node root) {
        if (root == null)
            return 0;
        return Size(root.LeftNode) + 1 + Size(root.RightNode);
    }
    public boolean SearchElements(Node Root, int Data) {
        if (Root == null)
            return false;
        if(Root.Data == Data)
            return true;
        else
            return SearchElements(Root.LeftNode, Data) || SearchElements(Root.RightNode, Data);
    }
    public void Search(int Data) {
        if(SearchElements(root, Data))
            System.out.println("The Element you were searching for = " +Data);
        else
            System.out.println("Invalid input,Not in the Tree");
    }
    public void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.LeftNode);
        System.out.println(node.Data);
        Inorder(node.RightNode);
    }
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = binarySearchTree.insertElements(null,56);
        Node secondnode = binarySearchTree.insertElements(root, 30);
        Node thirdnode = binarySearchTree.insertElements(root, 70);
        Node node4th = binarySearchTree.insertElements(root, 22);
        Node node5th = binarySearchTree.insertElements(root, 40);
        Node node6th = binarySearchTree.insertElements(root, 11);
        Node node7t = binarySearchTree.insertElements(root, 3);
        Node node8th = binarySearchTree.insertElements(root, 16);
        Node node9th = binarySearchTree.insertElements(root, 60);
        Node node10th = binarySearchTree.insertElements(root, 95);
        Node node11th = binarySearchTree.insertElements(root, 65);
        Node node12th = binarySearchTree.insertElements(root, 63);
        Node node13th = binarySearchTree.insertElements(root, 67);
        binarySearchTree.PrintOrder();
        binarySearchTree.Size(root);
        System.out.println("Tree size is = " + Size(root));
        binarySearchTree.Search(63);
    }
}

