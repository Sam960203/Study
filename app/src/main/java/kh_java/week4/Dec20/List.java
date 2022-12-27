package kh_java.week4.Dec20;

import java.util.List;
import java.util.ArrayList;
//자바에서 제공하는 자료구조는 java.util폴더에 있음

public class List {
  public static void main(String[] args) {
    // 아래는 생성부에 인터페이스가 와서 에러임 -구현체 클래스
    // 왜 벡터인가요?- DefaultTableModel객체에 데이터셋을 추가하는 메소드를 제공하니깐.
    List<String> nameList = new Vector<>();// 멀트스레드안전-속도느림-안전
    // List<String> nameList2 = new ArrayList<>();// 싱글스레드 안전-속도 빠름-안전하지 않다.
    System.out.println(nameList.size());// 0
    boolean isOk = nameList.add("이순신");// 0
    System.out.println(nameList.size());
    System.out.println((0));
    System.out.println(isOk);
  }
}
