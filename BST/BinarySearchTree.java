/*
 * Simple Implementation of Binary Search Tree - InOrder, PostOrder and PreOrder Traversal
 *
 */


public class BinarySearchTree {
  Node root;

  public void addNode(int key, String value) {

    Node newNode = new Node(key, value);

    if(root == null) {
      root = newNode;
    } else {
      Node current = root;
      Node parent;

      while(true) {
        parent = current;

        if(key < current.key) {
          current = current.leftChild;

          if(current == null) {
            parent.leftChild = newNode;
            return;
          }
        } else {
          current = current.rightChild;

          if(current == null) {
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public void preOrderTraversal(Node current) {
    if(current != null) {
      System.out.println(current.key + " -> " + current.value);
      preOrderTraversal(current.leftChild);
      preOrderTraversal(current.rightChild);
    }
  }

  public void postOrderTraversal(Node current) {
    if(current != null) {
      postOrderTraversal(current.leftChild);
      postOrderTraversal(current.rightChild);
      System.out.println(current.key + " -> " + current.value);
    }
  }

  public void inOrderTraversal(Node current) {
    if(current != null) {
      inOrderTraversal(current.leftChild);
      System.out.println(current.key + " -> " + current.value);
      inOrderTraversal(current.rightChild);
    }
  }

  public static void main(String[] args) {
    BinarySearchTree newTree = new BinarySearchTree();
    newTree.addNode(1, "Prashish");
    newTree.addNode(5, "Rashul");
    newTree.addNode(22, "Avin");
    newTree.addNode(46, "Sarina");
    newTree.addNode(2, "Sagun");
    newTree.addNode(18, "Deepan");

    newTree.postOrderTraversal(newTree.root);
  }
}

class Node {
  String value;
  int key;

  Node leftChild;
  Node rightChild;

  Node(int key, String value) {
    this.key = key;
    this.value = value;
  }
}
