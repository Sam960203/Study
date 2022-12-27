package kh_java.Dec16;

public class Quiz2 {
  int users[] = null;
  int mhap=0;,phap=0;

  void setArray() {
    users = new int[10];
    for (int i = 0; i < size; i++) {
      users[i] = (int) (Math.random() * 21) % 21 - 10;
    }
  }

  void setArray(int size) {
    users = new int[size];
    for (int i = 0; i < size; i++) {
      // 0.0~1.0 -실수형*21-> 0.0 ~20.0
      users[i] = (int) (Math.random() * 21) % 21 - 10;
    }
  }

  void total() {

  }

  // 난수수집체크
  void nansuPrint() {

    for (int i = 0; i < users.length; i++) {
      System.out.println(users[i]);
    }
  }

  public static void main(String[] args) {
    Quiz2 q2 = new Quiz2();
    for (int i = 0; i < users.length; i++) {
      users[i] = (int) (Math.random() * 20) % 21 - 10;
    }
  }

}
/*
 * 연습문제 2
 * -10에서 10사이의 정수 10개를 랜덤하게 채번하여 음수와 양수의 합계를 구하는 프로그램을 작성하시오.
 * 변수는 몇개 필요할까요 2개 mhap=0,phap=0
 * 
 * 전변으로 해야하는 변수는 무엇일까요?
 * 배열 int nansus[] = new int[10];
 *
 * 메소드 선언하기
 * void setArray()
 * void set Array(int Size)
 *
 *
 *
 *
 *
 *
 *
 */