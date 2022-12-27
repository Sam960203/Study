package kh_java.Week5.Dec26.Extend;// 상속 

class MultiplicationableCalculator extends Calculator {
  public void multiplication() {
    System.out.println(this.left * this.right);
  }
}// Calculator에서 정의 해놓은것이 있기때문에 재정의 하지않아도 상관없다.
 // Calculator의 기능을 상속하면서
 // public void multiplication() {
 // System.out.println(this.left * this.right); 정의되어있는 메소드를 추가로 정의할 수 있음

public class CalculatorDemo2 {

  public static void main(String[] args) {

    MultiplicationableCalculator c1 = new MultiplicationableCalculator();
    c1.setOprands(10, 20);
    c1.sum();
    c1.avg();
    c1.multiplication();
  }

}
