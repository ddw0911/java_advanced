package tree;

public class NodeMgmt {

  Node head = null;

  public class Node {

    Node left;
    Node right;
    int value;

    public Node(int data) {
      this.value = data;
      this.left = null;
      this.right = null;
    }

  }

  public boolean insertNode(int data) {
    // Case1 : Node가 하나도 없을 때
    if (this.head == null) {
      this.head = new Node(data);
    } else {
      // Case2 : Node가 하나 이상 있을 때
      Node findNode = this.head;
      while (true) {
        //  Case2-1 : 현재 Node가 왼쪽으로 들어갈 때
        if (data < findNode.value) {
          if (findNode.left != null) {
            findNode = findNode.left;
          } else {
            findNode.left = new Node(data);
            break;
          }
          //  Case2-2 : 현재 Node가 오른쪽으로 들어갈 때
        } else {
          if (findNode.right != null) {
            findNode = findNode.right;
          } else {
            findNode.right = new Node(data);
            break;
          }
        }
      }
    }
    return true;
  }

  //search()

  //delete()
}
