package collectionex.list;

import java.util.ArrayList;

public class SingleLinkedListEx {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<Integer>(1); //node1은 1 저장
    Node<Integer> node2 = new Node<Integer>(2); //node2는 2 저장
    node1.next = node2; //node1 다음이 node2
    Node<Integer> head = node1; // head는 1

    SingleLinkedList<Integer> myList = new SingleLinkedList<>();
    myList.addNode(1);
    myList.addNode(2);
    myList.addNode(3);
    System.out.println(myList.head.data); // 1
    System.out.println(myList.head.next.data); // 2
    myList.printAll();
    myList.search(3);
    myList.addNodeInside(4,1);
    myList.deleteNode(3);
  }
}
