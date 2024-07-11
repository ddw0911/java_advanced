package mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "김영미");
    map.put(2, "박지성");
    map.put(3, "김연아");
    map.put(4, "박찬호");
    map.put(5, "정상수");
    System.out.println(map.size());

    // 키를 이용하여 값 가져오기
    Integer key = 1;
    String value = map.get(key);
    System.out.println(value);

    // 맵의 키를 셋으로
    Set<Integer> keySet = map.keySet();
    Iterator<Integer> iterator = keySet.iterator();

    while (iterator.hasNext()) {
      Integer key1 = iterator.next();
      String value1 = map.get(key1);
      System.out.println(key1 + " " + value1);
    }
    System.out.println();

    map.remove(5);
    map.remove(4, "박찬호");

    // 맵의 엔트리(키와 값)를 셋으로
    Set<Entry<Integer, String>> entrySet = map.entrySet();
    Iterator<Entry<Integer, String>> iterator2 = entrySet.iterator();
    while (iterator2.hasNext()) {
      Entry<Integer, String> entry= iterator2.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.println(key2 + " " + value2);
    }


  }
}
