package lambda.day02.innerinterface;

import lambda.day02.Button.ClickListener;

public class Button {

  public static interface ClickListener {

    void onClick();

  }

  // setter 메서드를 이용하여 ClickListener 구현객체 injection
  private ClickListener clickListener;

  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  }
}
