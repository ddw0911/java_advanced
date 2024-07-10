package collectionex.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<>(); // Queue는 LinkedList로 인스턴스생성
    Queue<String> queue_string = new LinkedList<>();
    queue_int.add(1);
    queue_int.offer(2);
    queue_int.offer(3);
    System.out.println(queue_int);

    Integer result1 = queue_int.poll();
    System.out.println(result1); // 삭제된 값 확인
    System.out.println(queue_int); // FIFO에 의해 먼저 입력된 값부터 삭제

    boolean result2 = queue_int.remove(3); // object를 지정하여 삭제 + 삭제되었는지 여부 확인
    System.out.println(queue_int);
    System.out.println(result2);
  }

}
