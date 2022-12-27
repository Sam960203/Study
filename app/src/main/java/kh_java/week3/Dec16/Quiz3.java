package kh_java.Dec16;

public class Quiz3 {
  int counts[] = new int[10];// count 라는 배열 선언,생성

  int[] initArray(int datas[], int size) {
    int i;
    for (i = 0; i < datas.length; i++) {
      datas[i] = (int) (Math.random() * 10);
    }
    dataPrint(datas);
    return datas;
  }

  void dataPrint(int[] datas) {
    for (int i = 0; i < datas.length; i++) {
      System.out.print(datas[i]);
      if (i % 10 == 9) {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Quiz3 q3 = new Quiz3();
    int datas[] = new int[100];
    q3.initArray(datas, 100);
  }

}
/*
 * 연습문제 3
 * 0 부터 9사이의 임의의 수를 100개를 채번하여 한 줄에 10개씩
 * 출력하고 그 숫자의 빈도수를 계산하여 출력하시오
 * 원본 : 0 1 2 3 4 5 6 7 8 9
 * 2 5 6 8 7 8 9 0 1 1
 * 5
 * 3
 * 3
 * 7
 * 9
 * 2
 * 0 4 5 6 6 7 8 8 9 9
 * 숫자 : 0 1 2 3 4 5 6 7 8 9
 * 갯수 : 10 9 18 11 7 9 15 14 7 5 (편집됨)
 */