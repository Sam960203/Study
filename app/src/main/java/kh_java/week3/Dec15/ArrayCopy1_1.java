package kh_java.Dec15;

//딥카피 
public class ArrayCopy1_1 {
  void deepCopy() {

    int[] org = { 1, 2, 3 };
    int[] org_copy = org.clone();
    org_copy[2] = 5;
    for (int e : org) {
      System.out.println(e);
    }
    for (int e : org_copy) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    ArrayCopy1 ac1 = new ArrayCopy1();
    ac1.deepCopy();
  }

}

/*
 * 배열복사
 * 얕은 복사
 * 복사된 배열이나 원본배열이 변경이될때 서로간의 값이 같이 바뀐다
 * 깊은복사
 * 
 */
