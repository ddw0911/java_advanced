package tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt myTree = new NodeMgmt();
    myTree.insertNode(2);
    myTree.insertNode(3);
    myTree.insertNode(2);
    myTree.insertNode(4);
    myTree.insertNode(5);

    System.out.println("head = " + myTree.head.value);
    System.out.println("head right = " + myTree.head.right.value);
    System.out.println("head right left= " + myTree.head.right.left.value);
    System.out.println("head right right= " + myTree.head.right.right.value);
  }
}
