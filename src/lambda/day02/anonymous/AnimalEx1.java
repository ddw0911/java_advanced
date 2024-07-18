package lambda.day02.anonymous;

class Animal1 {

  public String eat() {
    return "냠냠";
  }
}

public class AnimalEx1 {

  public static void main(String[] args) {
    // 익명 클래스
    Animal1 dog = new Animal1() {
      @Override
      public String eat() {
        return "맛있다멍";
      }
    };
    System.out.println(dog.eat());
  }
}
