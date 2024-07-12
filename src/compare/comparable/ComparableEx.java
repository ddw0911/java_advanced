package compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {

  public static void main(String[] args) {
    ArrayList<Book> bookList = new ArrayList<>();
    bookList.add(new Book("세이노의 가르침", "세이토", "화이트혁명", 1992));
    bookList.add(new Book("호모데우스", "유발 하라리", "민음사", 2003));
    bookList.add(new Book("불안", "알랭 드 보통", "은행나무",1449));
    bookList.add(new Book("코스모스", "칼세이건", "사이언스북",2014));
    bookList.add(new Book("코스모스", "칼세이건", "사이언스북",2023));
    bookList.add(new Book("동물농장", "조지오웰", "민음사", 1984));
    bookList.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리", 2008));
    bookList.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리", 2022));
    bookList.add(new Book("사피엔스", "유발 하라리", "김영사",1002));
    bookList.add(new Book("역사의 쓸모", "최태성", "다산북스", 2013));

    Collections.sort(bookList);
    for (Book book : bookList) {
      System.out.println(book.getTitle() + " " + book.getWriter() + " " + book.getPublisher() + " " + book.getYear());
    }
  }
}
