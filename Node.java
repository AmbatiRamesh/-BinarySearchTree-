package com.bst;

public class Node implements Comparable<Node> {
        int Data;
        Node LeftNode;
        Node RightNode;
        public Node(int Data) {
            super();
            LeftNode=null;
            RightNode=null;
            this.Data=Data;
        }
        public int getData() {
            return Data;
        }
        public void setData(int data) {
            this.Data = data;
        }
        public Node getLeftNode() {
            return LeftNode;
        }
        public void setLeftNode(Node leftNode) {
            this.LeftNode = leftNode;
        }
        public Node getRightNode() {
            return RightNode;
        }
        public void setRightNode(Node rightNode) {
            this.RightNode = rightNode;
        }
        @Override
        public int compareTo(Node node) {
            return Data-node.Data;
        }
    }

