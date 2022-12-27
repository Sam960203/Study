package kh_java.week4.Dec20;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
//자바에서 제공하는 자료구조는 java.util폴더에 있음
import java.util.Iterator;

public class List1 {
  public static void main(String[] args) {
    List<String> nameList = new Vector<>();// 멀트스레드안전-속도느림-안전
    // 자료구조를 지원하는 클래스들은 오브젝트의 존재유무 체크
    // 포함여부
    // 비어있는지 ㅣ혹은 채워져있는지 확인 할 수 있는 api를 제공하고있다.
    List<String> fuitList = new ArrayList<>();// 싱글스레드 안전-속도 빠름-안전하지 않다.
    fruitList.add("사과");
    fruitList.add("바나나");
    boolean isExist = fruitList.contains("토마토");
    isExist = fruitList.contains("토마토");
    if (isExist) {
      System.out.println("들어있다.");
    } else {
      System.out.println("들어있지 않다.");
    }
    boolean isEmpty = fruitList.isEmpty();
    System.out.println(isEmpty);// false
    // Vector나 ArrayList는 오브젝트 추가,꺼내는 기능제공
    // Iterator는 그 안에 오브젝트 존재유무
    Iterator iter2 = fruitList.Iterator();
    while (iter2.hasNext()) {
      // 다이아몬드연산자에 의미임 - 타임을 명시적으로 작성함
      String fname = (String) iter2.next();// 제네릭타입을 지정하지 않아서 에러임
      System.out.println(fname);
    } 
    //아래와 같이 사용 할 수 없다.
    //왜냐하면 Vextor의 제네릭타입이 String이니깐...

    Iterator<Object> = iter3 fruitList.Iterator();
    Iterator<String> = iter4 fruitList.Iterator();
    
  }
}
