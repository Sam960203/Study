package kh_java.Week5.Dec26.Override;//override 공부하기 

class point extends Object {
  int x;
  int y;

  point(int x, int y) {
    this.x = x;
    this.y = y;
  }////////////////////////////////////////// 생성자

  public String toString() {
    return "x:" + x + ", y:" + y;
  }// 선언부와 자손부가 일치해야 됨
}

public class OverrideTest1 {
  public static void main(String[] args) {
    point p = new point(3, 5);
    System.out.println(p);
  }
}
