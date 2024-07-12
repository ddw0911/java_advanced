package compare;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Comparable {

  private String title;
  private String writer;
  private String publisher;
  private int year;

  //출판년도 순으로 정렬
//  @Override
//  public int compareTo(Object o) { // 현재 객체 > 파라미터로 넘어온 객체 : < 음수, > : 양수, 같으면 : 0
//    if (o instanceof Book book) {
//      if (this.year == book.year) {
//        return 0;
//      } else if (this.year > book.year) {
//        return 1;
//      }
//    }
//    return -1;
//  }

  // 책제목 순으로 정렬
//  @Override
//  public int compareTo(Object o) {
//    int result = 0;
//    if (o instanceof Book book) {
//      result = this.getTitle().compareTo(book.getTitle());
//      }
//    return result;
//
//  }

  // 책 제목순으로 정렬하되 같으면 출판년도 순으로
  @Override
  public int compareTo(Object o) {
    int result = 0;
    if (o instanceof Book book) {
      result = this.getTitle().compareTo(book.getTitle());
      if (result == 0) result = this.getYear() - book.getYear();
      }
    return result;
  }
}
