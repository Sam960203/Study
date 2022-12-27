package kh_java.Dec16;

import java.util.Vector;

public class Vector5 {

  public static void main(String[] args) {
    String fruits[] = { "키위", "포도", "사과", "멜론", "파인애플", "바나나", "복숭아" };
    // 저과일중에서 본인이 좋아하는 과일만 골라서 Vector에 담아주세요
    String myFruits[] = { "키위", "토마토", "복숭아" };
    Vector<String> vfruit = new Vector<>();
    // insert here
    for (int i = 0; i < fruits.length; i++) {
      for (int j = 0; j < myFruits.length; j++) {
        if (fruits[i].equals(myFruits[j])) {
          vfruit.add(fruits[i]);
        }
      }

    } // for문
      // 구매한 과일 출력하시오
    for (String f : vfruit) {
      System.out.print("내가좋아하는 과일은 " + f);
      System.out.print(f + " ");
    }
  }// 메인
}
