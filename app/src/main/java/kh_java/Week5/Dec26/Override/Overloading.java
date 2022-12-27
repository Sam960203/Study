package kh_java.Week5.Dec26.Override;

class Overloading {
  void parentMethod() {
  }
}

class Child extends Overloading {
  void parentMethod() {
  } // 오버라이딩 상속받은 클래스의 메소드

  void parentMethod(int i) {
  }// 오버로딩 // 상속받은 메소드의 냐용을 변경 하는거

  void ChildMethod() {
  } // 그냥 메소드 정의 오버라이딩아니야

  void ChildMethod(int i) {
  } // 오버로딩 이름만같은 메소드 새로

}

/*
 * 오버로딩과 오버라이딩의 차이
 * 오버로딩은 기존에 없는 새로운 메소드를 정의하는것(new)→상속과 관계없음
 * 오버라이딩은 상속받은 메소드의 내용을 변경하는 것(change,modify)
 */