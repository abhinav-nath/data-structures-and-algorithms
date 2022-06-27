package com.codecafe.ds.trees.binary;

public class BinaryTreePreOrderTraversal {

  public static void main(String[] args) {
    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    Node root = BinaryTree.build(nodes);
    System.out.println(root.data);
  }

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int idx = -1;

    private BinaryTree() {
    }

    public static Node build(int[] nodes) {
      idx++;

      if (nodes[idx] == -1)
        return null;

      Node newNode = new Node(nodes[idx]);
      newNode.left = build(nodes);
      newNode.right = build(nodes);

      return newNode;
    }
  }

}