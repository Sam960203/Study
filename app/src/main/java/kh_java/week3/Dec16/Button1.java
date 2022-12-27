package kh_java.Dec16;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Button1 extends JFrame {
  // 선언부
  String jtbn_label[] = { "입력", "수정", "삭제" };
  JPanel jp_north = new JPanel();
  JButton jbtn_ins = new JButton(jbtn_label[0]);
  JButton jbtn_upd = new JButton(jbtn_label[1]);
  JButton jbtn_del = new JButton(jbtn_label[2]);// 이른 인스턴스화

  // 생성자
  public Button1() {
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    for (int i = 0; i < jbtns.length; i++) {
      jbtns[i] = new JButton(jbtn_label[i]);
      jp_south.add(jbtns[i]);
    }
    jp_north.add(jbtn_ins);
    jp_north.add(jbtn_upd);
    jp_north.add(jbtn_del);
    this.add("North", jp_north);
    this.setSize(500, 400);
    this.setVisible(true);
  }

  // 메인메소드
  public static void main(String[] args) {
    new Button1();
  }

}
