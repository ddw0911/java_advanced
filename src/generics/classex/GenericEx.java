package generics.classex;

public class GenericEx {

  public static void main(String[] args) {
//    Box<Doll> box = new Box();
//    box.content = new Doll(); // 업캐스팅
//    System.out.println((Doll) box.content);

    Box<String> box = new Box<>();
    box.content = "러브레터";
    String content = box.content;

    Box<Integer> box1 = new Box<>();
    box1.content = 3;
    int content1 = box1.content;

    // product
    Product<SmartPhone, String> p1 = new Product<>();
    p1.setKind(new SmartPhone());
    p1.setModel("Apple15Pro");

    SmartPhone applePhone = p1.getKind();
    String model = p1.getModel();
    System.out.println(applePhone + " " + model);

    Product<Car, String> p2 = new Product<>();
    p2.setKind(new Car());
    p2.setModel("HyundaiCasper");

    Car newCar = p2.getKind();
    model = p2.getModel();
    System.out.println(newCar + " " + model);
  }
}
