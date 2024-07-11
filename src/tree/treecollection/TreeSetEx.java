package tree.treecollection;

import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {
    // 학생 점수를 저장하는 scores
    TreeSet<Integer> scores = new TreeSet<>();

    // 점수 저장 - 입력 즉시 이진 트리의 노드로 저장
    scores.add(75);
    scores.add(88);
    scores.add(62);
    scores.add(44);
    scores.add(17);
    scores.add(92);

    // 점수 출력 - 정렬(중위순회 왼쪽 - 노드 - 오른쪽)
    for (Integer score : scores) {
      System.out.println(score);
    }

    // 특정점수 출력
    System.out.println(scores.first()); // 최소 점수
    System.out.println(scores.last()); // 최대 점수
    System.out.println(scores.lower(90)); // 90보다 작은 점수
    System.out.println(scores.higher(90)); // 90보다 큰 점수
    System.out.println(scores.floor(88)); // 88과 같거나 작은 점수
    System.out.println(scores.ceiling(90));

    // 내림차순
    System.out.println(scores.descendingSet());

    // 범위검색
    System.out.println("62점 미만 : " + scores.headSet(62, false));
    System.out.println("70점 이상 : " + scores.tailSet(70, true));
    System.out.println("44점 초과 75점 이하: " + scores.subSet(44, false, 75, true));
  }
}
