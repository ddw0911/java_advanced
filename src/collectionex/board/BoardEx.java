package collectionex.board;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    List<Board> boardList = new ArrayList<>();

    boardList.add(new Board("배고프다","jjj","치킨"));
    boardList.add(new Board("배고프다","jjj","치킨"));
    boardList.add(new Board("배고프다","jjj","치킨"));
    boardList.add(new Board("배고프다","jjj","치킨"));
    boardList.add(new Board("배고프다","jjj","치킨"));

    int boardSize = boardList.size();
    System.out.println(boardSize);

    // 특정 인덱스의 객체 출력
    Board board = boardList.get(2);
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());
    System.out.println();

    // boardList의 모든 게시글 출력

    for (Board board1 : boardList) {
      System.out.println(
          board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }
  }
}
