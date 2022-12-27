package kh_java.week4.Dec22;

import java.util.Arrays;

public class ArrayCopy {
  String fruit[] = { "사과", "딸기", "바나나" };
  String fruit2[];

  public ArrayCopy() {
    fruit2 = fruit;
    fruit2[1] = "키위";
    System.out.println(Arrays.toString(fruit));
    System.out.println(Arrays.toString(fruit2));
  }

  public static void main(String[] args) {
    new ArrayCopy();
  }
}
