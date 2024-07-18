package lambda.day02;

public class ButtonEx {

  public static void main(String[] args) {
    Button btn = new Button();

    btn.setClickListener(
        () -> {
          System.out.println("버튼 클릭");
        }
    );
    btn.click();

    Button cancelBtn = new Button();

    cancelBtn.setClickListener(
        () -> {
          System.out.println("캔슬 클릭");
        }
    );
    cancelBtn.click();
  }

}
