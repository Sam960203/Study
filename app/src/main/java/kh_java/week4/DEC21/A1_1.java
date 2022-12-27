package kh_java.week4.DEC21;

import java.util.Vector;

public class A1_1 {
  int ival = 1;

  public static void main(String[] args) {
    A1_1 = new A1_1();
    a1.ival = 10;
    System.out.println(a1);
    a1 = null;// 객체 초기화 하면 다음 라인 넘어갈때 캔디데이트 상태가 됨
    Vector<> v1 = new Vector<>();
    v1.add(a1);
    a1 = new A1();//
    a1.ival = 20;//
    System.out.println(a1);
    // insert here 벡터를 사용해서 다시 a1.ival=10;을 출력하고싶어 어떡해야 할까?
    System.out.println(a1.ival);// 20
  }

}
