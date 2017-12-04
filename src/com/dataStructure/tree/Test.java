package com.dataStructure.tree;

class Test{
    public static void main(String[] args) {
        Tree t=new Tree();
//        Node left=new Node("b");
//        Node right=new Node("c");
        Node root=new Node("a");
        t.root=root;
//        t.root.left=left;
//        root.right=right;
//        left.left=new Node("d");
//        left.right=new Node("e");
//        right.left=new Node("f");
//        right.right=new Node("g");
        BinerySearchTree bs=new BinerySearchTree();
        bs.insert(t,"b");
        bs.insert(t,"c");
        bs.insert(t,"d");
        bs.insert(t,"e");
        bs.insert(t,"f");
        bs.insert(t,"g");

//        System.out.println("inOrder LEFT MYSELF RIGHT");
//        Traversal.inOrderTraversal(t.root);
//        System.out.println();
//
//        System.out.println("preOrder MYSELF LEFT RIGHT");
//        Traversal.preOrderTraversal(t.root);
//        System.out.println();
//
//        System.out.println("postOrder LEFT RIGHT MYSELF");
//        Traversal.postOrderTraversal(t.root);
//        System.out.println();

        System.out.println("BFS LEVELBYLEVEL");
        Traversal.bfsOrfer(t.root);


    }

}
