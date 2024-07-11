package collectionex.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList와 LinkedList 객체 추가 성능 비교
public class DiffEx {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    // 시작시간과 종료시간을 저장할 변수선언
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list1.add(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","ArrayList 걸린 시간 : ", (endTime - startTime));

    System.out.println();

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list2.add( String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","LinkedList 걸린 시간 : ", (endTime - startTime));
    // ArrayList는 데이터 수정 시 인덱스 수정작업이 필요해서 작업시간이 더 오래걸린다
  }
}
