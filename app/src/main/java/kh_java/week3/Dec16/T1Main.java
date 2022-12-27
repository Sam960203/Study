package kh_java.Dec16;

class T1 {

  int i = 1;
}

public class T1Main {
  public static void main(String[] args) {
    T1 t1 = new T1();//
    System.out.println(t1);// 1
    t1 = new T1();//
    System.out.println(t1);
    T1[] t1s = new T1[3];
    t1s[0] = new T1();
    t1s[1] = new T1();
    t1s[2] = new T1();
    for (T1 t : t1s) {
      System.out.println(t + " ");
    }
  }
}
// new 라는 것을 썼기떄문에 새로운 객체
// 그래서 모든 주소번지가 다르다.