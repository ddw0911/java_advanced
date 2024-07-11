package tree.treecollection;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> tm = new TreeMap<>();

    tm.put("짜장",10000);
    tm.put("국밥",12000);
    tm.put("아구찜",20000);
    tm.put("피자",25000);
    tm.put("족발", 40000);

    // TreeMap을 EntrySet으로
    Set<Entry<String, Integer>> menu = tm.entrySet();
    for (Entry<String, Integer> food : menu) {
      System.out.println(food.getKey() + " " + food.getValue()); // 가나다 순 (key 기준 오름차순)
    }
    System.out.println();

    // 특정 엔트리
    System.out.println(tm.firstEntry());
    System.out.println(tm.lastEntry());
    System.out.println(tm.floorEntry("족발"));
    System.out.println(tm.ceilingEntry("짜장"));
    System.out.println();
    // 내림차순
    System.out.println(tm.descendingMap());
    System.out.println();
    // 특정 범위
    System.out.println(tm.headMap("아구찜"));
    System.out.println(tm.tailMap("족발", false));
    NavigableMap<String, Integer> subMenu = tm.subMap("국밥", false, "피자", false);
    for (Entry<String, Integer> subFood : subMenu.entrySet()) {
      System.out.println(subFood.getKey() + " "  + subFood.getValue());
    }
  }
}
