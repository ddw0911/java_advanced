package compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookComparatorEx {

  public static void main(String[] args) {
    ArrayList<Book2> bookList = new ArrayList<>();
    bookList.add(new Book2("세이노의 가르침", "세이토", "화이트혁명", 1992));
    bookList.add(new Book2("호모데우스", "유발 하라리", "민음사", 2003));
    bookList.add(new Book2("불안", "알랭 드 보통", "은행나무",1449));
    bookList.add(new Book2("코스모스", "칼세이건", "사이언스북",2013));
    bookList.add(new Book2("코스모스", "칼세이건", "사이언스북",2023));
    bookList.add(new Book2("동물농장", "조지오웰", "민음사", 1984));
    bookList.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2008));
    bookList.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2023));
    bookList.add(new Book2("사피엔스", "유발 하라리", "김영사",1002));
    bookList.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2013));

//    Collections.sort(bookList, new DescTitle());
    Collections.sort(bookList, new DescYear());
    for (Book2 book2 : bookList) {
      System.out.println(book2.getTitle() + " " + book2.getWriter() + " " + book2.getPublisher() + " " + book2.getYear());
    }

    System.out.println("===========================");
    Comparator<Book2> myComparator = new Comparator<>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        return (o1.getYear() - o2.getYear()) * -1;
      }
    };

    Collections.sort(bookList, myComparator);
    for (Book2 book2 : bookList) {
      System.out.println(book2.getTitle() + " " + book2.getWriter() + " " + book2.getPublisher() + " " + book2.getYear());
    }
    System.out.println("===========================");

    // 출판년도 최신순 , 출판년도 같으면 글자수로 내림차순, 둘다 같으면 제목 내림차순
    Collections.sort(bookList, new Comparator<Book2>(){
      @Override
      public int compare(Book2 o1, Book2 o2) {
        if (o1.getYear() == o2.getYear()) {
          if (o1.getTitle().length() == o2.getTitle().length()) {
            return o1.getTitle().compareTo(o2.getTitle()) * -1;
          }
          return (o1.getTitle().length() - o2.getTitle().length()) * -1;
        }
        return (o1.getYear() - o2.getYear()) * -1;
      }
    });

    for (Book2 book2 : bookList) {
      System.out.println(book2.getTitle() + " " + book2.getWriter() + " " + book2.getPublisher() + " " + book2.getYear());
    }
  }
}
