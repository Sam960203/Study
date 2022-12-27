package kh_java.Dec15;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

//이른 인스턴스화 게으른 인스턴스화 
//어떤 클래스를 상속받을때에는 extends 예약어를 사용
//A is a B관계이면 상속으로 처리한다.
// 소나타는 자동차 이다. 
// 자동차는 소나타이다. 
//부모 클래스가 가진 변수와 메소드도 사용가능함 - 자손이 더 많이 누릴수있다.
public class DeptTable2 extends JFrame {// DeptTable is a JFrame
  // 선언부
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[1][3];

  DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);// 생성자 호출
  // 생성자

  public DeptTable2() {
    initDisplay();
  }

  public DeptTable2(String title) {

  }

  public DeptTable2(int i) {

  }

  // 화면그리기]
  public void initDisplay() {// 화면을 띄우기 위한 함수
    this.setTitle("부서관리시스템Ver1.0)");// 타이틀 지정
    this.setSize(500, 400);// 사이즈 지정
    this.setVisible(true);// 화면을 보여달라

  }

  // 메인메소드
  public static void main(String[] args) {
    new DeptTable1();//

  }
}
