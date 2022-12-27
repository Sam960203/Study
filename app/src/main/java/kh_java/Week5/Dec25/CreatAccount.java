package kh_java.Week5.Dec25;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreatAccount { // 회원가입

  public void initDisplay() {
    JFrame jf = new JFrame();
    jf.setSize(600, 300);
    jf.setLocation(400, 200);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setTitle("Creat Account");
    jf.setLayout(null);
    ////////////////////////////////////////////////////////////////////// 틀

    JLabel jl = new JLabel("I     D  : ");
    jl.setSize(80, 30);
    jl.setLocation(30, 30);
    jl.setHorizontalAlignment(JLabel.CENTER);

    jf.add(jl);

    JTextField jtf = new JTextField();
    jtf.setSize(250, 30);
    jtf.setLocation(110, 30);

    jf.add(jtf);
    ///////////////////////////////////////////////////////////////////// I D
    jl = new JLabel(" P     W  : ");
    jl.setSize(80, 30);
    jl.setLocation(30, 72);
    jl.setHorizontalAlignment(JLabel.CENTER);
    jf.add(jl);

    jtf = new JTextField();
    jtf.setSize(250, 30);
    jtf.setLocation(110, 75);

    jf.add(jtf);
    ///////////////////////////////////////////////////////////////////// P W
    jl = new JLabel("N A M E :");
    jl.setSize(80, 30);
    jl.setLocation(30, 120);
    jl.setHorizontalAlignment(JLabel.CENTER);
    jf.add(jl);

    jtf = new JTextField();
    jtf.setSize(250, 30);
    jtf.setLocation(110, 120);
    jf.add(jtf);

    ///////////////////////////////////////////////////////////////////// Name

    jl = new JLabel(" TEL. NO.  : ");
    jl.setSize(80, 30);
    jl.setLocation(30, 160);
    jl.setHorizontalAlignment(JLabel.CENTER);
    jf.add(jl);

    jtf = new JTextField();
    jtf.setSize(250, 30);
    jtf.setLocation(110, 165);
    jf.add(jtf);
    ///////////////////////////////////////////////////////////////////// Tel.No

    jl = new JLabel(" ADDRESS.  : ");
    jl.setSize(80, 30);
    jl.setLocation(30, 200);
    jl.setHorizontalAlignment(JLabel.CENTER);
    jf.add(jl);

    jtf = new JTextField();
    jtf.setSize(250, 30);
    jtf.setLocation(110, 205);
    jf.add(jtf);
    ///////////////////////////////////////////////////////////////////// Address

    JButton jb = new JButton("C  O  M  P  L  E  T  E");
    jb.setSize(180, 80);
    jb.setLocation(380, 140);
    jf.add(jb);

    jf.setVisible(true);
  }

  public static void main(String[] args) {

    CreatAccount ca = new CreatAccount();
    ca.initDisplay();

  }
}
/*
 * 화면그리기 용
 */