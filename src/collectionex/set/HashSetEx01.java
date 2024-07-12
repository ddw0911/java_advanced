package collectionex.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("ssg");
    set.add("ssg"); // 중복된 데이터(동등 객체)이므로 저장되지 않음
    System.out.println(set.size());
    System.out.println("======================");

    Set<Member> memberList = new HashSet<>();
    memberList.add(new Member("ssg", 20));
//    memberList.add(new Member("ssg", 20)); // 동등객체 처리를 했기때문에 같은 객체로 판단하여 저장 안함
    memberList.add(new Member("dsg", 20));
    memberList.add(new Member("asg", 20));
    memberList.add(new Member("fsg", 20));

    System.out.println(memberList.size());

    // 회원 가져오기
    // 반복자를 통해 memberList 객체에 접근
    System.out.println("======================");
    Iterator<Member> iterator = memberList.iterator();
    while (iterator.hasNext()) { // 다음 객체가 있는지 확인
      Member member = iterator.next(); // 객체 하나 가져오기
      System.out.println(member.name + " " + member.age);
      if (member.name.equals("fsg")) iterator.remove(); // fsg라는 name을 가진 member를 검색하여 삭제
      if (member.name.equals("ssg")) iterator.remove(); // ssg라는 name을 가진 member를 검색하여 삭제
    }


    // for-each문 이용
    System.out.println("======================");
    for (Member member : memberList) {
      System.out.println(member.name + " " + member.age);
    }
  }

}
