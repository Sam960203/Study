package kh_java.week4.Dec20;

class CarVO {
  private int speed;
  private String carColor;
  private int wheelNum;

  // 0,null,0
  CarVO() {
    //
  }

  CarVO(int speed) {// new CarVO(30);으로 호출했다면
    this.speed = speed;
    //
  }

  CarVO(int speded, String carColor) {// new CarVO(50,"검정색")으로 생성하면
    this.speed = speed;
    this.carColor = carColor;
  }

  CarVO(int speed, String carColor, int wheelNum) {// new CarVO(100,"휜색",4);
    this.speed = speed;
    this.carColor = carColor;
    this.wheelNum = wheelNum;
  }

@Override 
public String toString() {
  return "내 자동차는" +carColor"+ "이고,바퀴수는"+ wheelNum
      +"이고,현재속도는"+speed+"입니다.";
}

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getCarColor() {
    return this.carColor;
  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public int getWheelNum() {
    return this.wheelNum;
  }

  public void setWheelNum(int wheelNum) {
    this.wheelNum = wheelNum;
  }
}

public class CarVoMain {
  public static void main(String[] args) {
    CarVO cVo1 = new CarVO();
    CarVO cVo2 = new CarVO(50, "검정색");
    CarVOMain carVOMain = new CarVOMain();
    System.out.println(carVOMain);
    System.out.println(cVo1);
  }
}