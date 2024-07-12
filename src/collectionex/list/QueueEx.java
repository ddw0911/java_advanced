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

    System.out.println(queue_int.poll()); // poll() 삭제시키고 해당 값 리턴 - FIFO에 의해 먼저 입력된 값부터 삭제
    System.out.println(queue_int);

    boolean result2 = queue_int.remove(3); // remove() 삭제시키고 삭제되었는지 여부 반환 + 파라미터로 object를 특정하여 삭제
    System.out.println(result2);
    System.out.println(queue_int);

  }

}
