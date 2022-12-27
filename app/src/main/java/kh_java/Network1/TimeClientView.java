package kh_java.Network1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeClientView extends JFrame {
  // 선언부
  JLabel jlb_timer = new JLabel("현재시간", JLabel.CENTER);

  // 생성자
  TimeClientView() {
    initDisplay();
  }

  // 화면처리부
  public void initDisplay() {
    Thread th = new TimeClient(jlb_timer);
    th.start();
    this.add("Center", jlb_timer);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  // 메인메소드
  public static void main(String[] args) {
    new TimeClientView();
  }

}
