package kh_java.Network1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
  Socket socket = null;
  ObjectOutputStream oos = null;
  ObjectInputStream ois = null;
  JLabel jlb_timer = null;

  public TimeClient(JLabel jlb_timer) {
    this.jlb_timer = jlb_timer;
  }

  @Override
  public void run() {
    // 서버로 부터 읽어온 시간 정보를 담기
    String timeMsg = null;
    try {
      // 아래가 실행되자마자 TimeServer와 ServerSocket이 accept()호출하여
      // 클라이언트 소켓 정보를 서버가 취득함.
      socket = new Socket("192.168.10.74", 3000);
      oos = new ObjectOutputStream(socket.getOutputStream());
      ois = new ObjectInputStream(socket.getInputStream());
      while (true) {
        try {
          while ((timeMsg = (String) ois.readObject()) != null) {
            System.out.println(timeMsg);
            jlb_timer.setText(timeMsg);
          } // end of inner while
          sleep(1000);
        } catch (Exception e) {
          // TODO: handle exception
        }
      } // end of outter while
    } catch (IOException ie) {
      System.out.println("타임서버에 접속할 수 없습니다.");
    } finally {
      try {
        oos.close();
        ois.close();
        socket.close();
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
  }

  public static void main(String[] args) {
    // 선언부와 생성부의 이름이 다를 수 있다. - 그래야 다형성 구현이 가능함 - 권장
    // 자바에서는 new 다음에 오는 이름으로 객체가 생성됨
    Thread th = new TimeClient();
    th.start();// run호출
  }
}
