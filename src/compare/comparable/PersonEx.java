package compare;

import java.util.TreeSet;

public class PersonEx {

  public static void main(String[] args) {
    TreeSet<Person> personSet = new TreeSet<>(new PersonComparator());

    personSet.add(new Person("홍맹구", 26));
    personSet.add(new Person("김유리", 30));
    personSet.add(new Person("박철수", 28));
    personSet.add(new Person("신짱구", 33));
    personSet.add(new Person("나훈이", 45));

    for (Person person : personSet) {
      System.out.println(person.getName() + " " + person.getAge());
    }
  }
}
