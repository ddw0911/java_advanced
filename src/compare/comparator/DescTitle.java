package compare.comparator;

import java.util.Comparator;

public class DescSubject implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    int result = o1.getTitle().compareTo(o2.getTitle())* -1;
    return result;
  }
}
