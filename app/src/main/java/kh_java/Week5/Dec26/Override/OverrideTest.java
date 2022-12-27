package kh_java.Week5.Dec26.Override;//override 공부하기 

class point {
  int x;
  int y;

  String getLocation() {
    return "x:" + x + ",y:" + y; // 선언부
  }
}

class Point3D extends point {
  int z;

  String getLocation() {
    return "x:" + x + ",y:" + y + ",z:" + z;
    // 조상의 point의 메소드를 재 할당 해준거야 거기에 z만 넣었지
    // 이게 오버라이딩라고
  }
}

public class OverrideTest {
  public static void main(String[] args) {
    Point3D d = new Point3D();
    d.x = 3;
    d.y = 5;
    d.z = 10;
    System.out.println(d.getLocation());
  }

}
// 오버라이딩의 조건
/*
 * 선언부(반환타입,메소드이름,매개변수목록) 이게 동일해야함 누구와?
 * 자손이 같아야 한다. 그래야지 오버라이딩 할 수 있다.
 * 접근제어자를 조상클래스의 메소드보다 좁은 범위로 변경할 수 없다.
 * 예외는 조상클래스의 메서드보다 많이 선언할 수 있다.
 */