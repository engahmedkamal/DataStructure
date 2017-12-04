package com.dataStructure.tree;

public class BinerySearchTree {
    public void insert(Tree tree, String value) {
        insertHelper(tree.root, value);
    }

    private void insertHelper(Node node, String value) {
        if (node.value.compareTo(value) > 0) {
            if (node.left != null) {
                insertHelper(node.left,value);
            } else {
                node.left = new Node(value);
            }
        } else {
            if (node.right != null) {
                insertHelper(node.right,value);
            } else {
                node.right = new Node(value);
            }
        }
    }
}
