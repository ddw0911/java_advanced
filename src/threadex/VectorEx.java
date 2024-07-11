package threadex;

import collectionex.board.Board;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    //Vector 생성
    List<Board> list = new Vector<>();
//    List<Board> list = new ArrayList<>(); // Collision 발생으로 일부 누락 - Vector는 1건씩만

    //작업 스레드 객체
    Thread threadA = new Thread(){
      @Override
      public void run() {
        // 글 1000개 추가
        for (int i = 1; i <= 1000; i++) {
          list.add(new Board("제목" + i, "ssg" + i, "내용" + i));
        }
        super.run();
      }
    };

    Thread threadB = new Thread(){
      @Override
      public void run() {
        // 글 추가
        for (int i = 1001; i <= 2000; i++) {
          list.add(new Board("제목" + i, "ssg" + i, "내용" + i));
        }
        super.run();
      }
    };

    // 스레드 실행
    threadA.start();
    threadB.start();

    try {
      threadA.join();
      threadB.join(); // A,B 작업이 모두 종료될 때까지 main 메서드가 기다림
    } catch (Exception e) {

    }
    int size = list.size();
    System.out.println(size);
    for (Board board : list) {
      System.out.println(board.getSubject());
    }
  }
}
