package kh_java.Week5.Dec25;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginForm {
  public void initDisplay() {
    JFrame jf = new JFrame();
    jf.setSize(400, 300);
    jf.setLocation(400, 200);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setTitle("Log in ");
    jf.setLayout(null);
    ////////////////////////////////////////////////////////////////////// 틀

    JLabel jl = new JLabel("I     D  : ");
    jl.setSize(80, 9);
    jl.setLocation(30, 80);
    jl.setHorizontalAlignment(JLabel.CENTER);

    jf.add(jl);

    JTextField jtf = new JTextField();
    jtf.setSize(250, 40);
    jtf.setLocation(110, 70);

    jf.add(jtf);

    jl = new JLabel("P     W  : ");
    jl.setSize(80, 100);
    jl.setLocation(30, 100);
    jl.setHorizontalAlignment(JLabel.CENTER);

    jf.add(jl);

    jtf = new JTextField();
    jtf.setSize(250, 40);
    jtf.setLocation(110, 135);

    jf.add(jtf);
    ///////////////////////////////////////////////////////////////////// I D

    JButton jb = new JButton("Join us? ");
    jb.setSize(120, 20);
    jb.setLocation(130, 190);
    jf.add(jb);

    jf.setVisible(true);
  }

  public static void main(String[] args) {

    LoginForm lf = new LoginForm();
    lf.initDisplay();

  }
}