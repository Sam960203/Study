package kh_java.week4.DEC21;//1221

import java.util.Vector;

public class A1 {
  int ival = 1;

  public static void main(String[] args) {
    A1 a1 = new A1();
    a1.ival = 10;
    System.out.println("9번의 주소번지값 ===> " + a1);
    // 벡터의 안에 있는 타입을 다이아몬드연산자에 적어야 함
    Vector<A1> v1 = new Vector<>();
    v1.add(a1);
    a1 = null;// 객체 초기화 하면 다음 라인 넘어갈때 캔디데이트 상태가 됨
    a1 = new A1();//
    a1.ival = 20;//
    System.out.println(a1);
    // insert here 벡터를 사용해서 다시 a1.ival=10;을 출력하고싶어 어떡해야 할까?
    System.out.println("9번의 주소번지값 ===> " + v1.get(0));
    A1 a2 = v1.get(0);
    System.out.println("9번의 주소번지값 ===> " + a2);
    System.out.println(v1.get(0).ival);// 10
    System.out.println(a1.ival);// 20

  }
}
