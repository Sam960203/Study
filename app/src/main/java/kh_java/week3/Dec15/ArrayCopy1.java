package kh_java.Dec15;

public class ArrayCopy1 {
  public static void main(String[] args) {
    int[] org = { 1, 2, 3 };
    int[] org_copy = org;
    org_copy[2] = 5;
    for (int e : org) {
      System.out.println(e);
    }
    for (int e : org_copy) {
      System.out.println(e);
    }
  }
}
/*
 * 배열복사
 * 얕은 복사
 * 복사된 배열이나 원본배열이 변경이될때 서로간의 값이 같이 바뀐다
 * 깊은복사
 * 
 */
