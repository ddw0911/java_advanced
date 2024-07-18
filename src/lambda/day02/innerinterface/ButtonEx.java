package lambda.day02.innerinterface;

public class ButtonEx {

  public static void main(String[] args) {
    Button okBtn = new Button();

    class OKListener implements Button.ClickListener {


      @Override
      public void onClick() {
        System.out.println("OK 버튼 클릭");
      }
    }

    okBtn.setClickListener(new OKListener());
    okBtn.click();

    Button cancelBtn = new Button();

    class CancelListener implements Button.ClickListener {


      @Override
      public void onClick() {
        System.out.println("캔슬 버튼 클릭");
      }
    }

    cancelBtn.setClickListener(new CancelListener());
    cancelBtn.click();
  }
}
