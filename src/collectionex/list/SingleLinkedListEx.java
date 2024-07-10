package collectionex.list;

public class SingleLinkedListEx {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);
    node1.next = node2;
    Node<Integer> head = node1;

    SingleLinkedList<Integer> myList = new SingleLinkedList<>();
    myList.addNode(1);
    myList.addNode(2);
    myList.addNode(3);
    System.out.println(myList.head.data);
    System.out.println(myList.head.next.data);
    myList.printAll();
    myList.search(3);
    myList.addNodeInside(4,1);
    myList.deleteNode(3);
  }
}
