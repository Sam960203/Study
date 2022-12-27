package kh_java.week4.Dec22;

// 얕은 복사 
import java.util.Arrays;

public class ArrayCopy1 {
  public static void main(String[] args) {
    ArrayCopy acopy = new ArrayCopy();
    System.out.println(Arrays.toString(acopy.fruit2));//
    System.out.println(Arrays.toString(acopy.fruit));//
    acopy.fruit2 = new String[] { "파인애플", "키위" };
    System.out.println(acopy.fruit2[1]);// NullpointerException
  }
}
