package collectionex.list;

public class SingleLinkedList<T> {

  public Node<T> head = null;

  public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
      this.data = data;
    }
  }

  public void addNode(T data) {
    if (head == null) { // head가 null이면
      head = new Node<T>(data); // 노드에 데이터 할당
    } else { // head가 null이 아니면
      Node<T> node = this.head; // head의 값을 노드에 할당
      while (node.next != null) { // 다음 노드가 null이 아니면 (데이터가 있으면) 다음 노드 검색
        node = node.next;
      } // 다음 노드가 null이면
      node.next = new Node<T>(data); // 새로운 노드 추가
    }
  }

  public void printAll() {
    if (head != null) {
      Node<T> node = this.head;
      System.out.println(node.data); // 헤드의 데이터 출력
      while (node.next != null) {
        node = node.next;
        System.out.println(node.data); // 다음 노드의 데이터 출력 (다음 노드가 null일때까지 (없을때까지))
      }
    }
  }

  public Node<T> search(T data) { // 특정 데이터 찾기 (원하는 노드 찾기)
    if (this.head == null) {
      return null;
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.data == data) { // 찾는 데이터가 해당노드의 데이터와 같으면 노드 반환
          return node;
        } else { // 아니면 다음 노드 검색
          node = node.next;
        }
      }
    }
    return null; // 마지막 노드까지 뒤졌으나 없음
  }

  public void addNodeInside(T data, T isData) { // 중간에 노드 끼워넣기
    Node<T> searchedNode = this.search(isData); // isData를 가진 찾아 해당 노드를 searchedNode로 선언

    if (searchedNode == null) { // isData를 가진 노드가 없으면 노드를 만들고 삽입하려는 데이터(data) 저장
      this.addNode(data);
    } else {
      Node<T> nextNode = searchedNode.next; // isData를 가진 노드를 찾았고 해당 다음 노드를 nextNode로 선언
      searchedNode.next = new Node<T>(data); // isData를 가진 노드(searchedNode) 다음에 삽입하려는 노드 추가 및 데이터 저장
      searchedNode.next.next = nextNode; // 원래 searchedNode 다음에 있던 노드를 뒤로 밀기 (중간에 삽입되었으므로)
    }
  }

  public boolean deleteNode(T isData) {
    if (this.head == null) {
      return false;
    } else {
      Node<T> node = this.head;
      if (node.data == isData) {
        this.head = this.head.next;
        return true;
      } else {
        while (node.next != null) {
          if (node.next.data == isData) {
            node.next = node.next.next;
            return true;
          }
          node = node.next;
        }
        return false;
      }
    }
  }
}
