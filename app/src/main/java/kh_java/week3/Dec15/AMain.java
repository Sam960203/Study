package kh_java.Dec15;

class A {
  int i = 1;// 변수 원시형
  AMain aMain = null;// 아무것도 가르키고 있지 않다.

  public A(AMain aMain) { // AMain 은 지변 //디폴트 생성자가 아님
    System.out.println("A(AMain aMain) 호출성공");

    this.aMain = aMain;
  }// 생성자 생성자는 클래스 명과 메소드명이 동일하다. 생성자 선언

  void methodB() {
    aMain.methodA();// 호출하면 null이 되겠지 4번때문에
  }
}// A class

public class AMain {
  A a = new A(this);// A가 사라지면 에러가 나옴 7번에 디폴트 생성 해줘서 빨간 줄 사라짐

  void methodA() {
    System.out.println("AMain methodA() 호출");
  }// AMain class

  public static void main(String[] args) {
    AMain aMain = new AMain();
    aMain.a.methodB();
  }// main
}// AMain