package lambda.day02.anonymous;

class Animal {

  public String eat() {
    return "냠냠";
  }
}

class Dog extends Animal {

  @Override
  public String eat() {
    return "맛있다멍";
  }
}

public class AnimalEx {

  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.eat();
  }
}
