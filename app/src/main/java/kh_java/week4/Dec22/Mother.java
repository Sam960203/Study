package kh_java.week4.Dec22;
//벡터 녹화본 있어 보면서 해 

// 시험문제 3번이랑 같이 진행했어 

import java.util.Vector;

public class Mother {
  public static void main(String[] args) {
    Vector<Mother> v = new Vector<>();
    Mother m1 = new Mother();
    v.add(0, m1);
    v.get(0).m.money = 200000;
    Mother m2 = new Mother();
    v.add(1, m2);
    Mother m3 = new Mother();
    v.add(2, m3);
    /* 
     * 
     */
    // for (Mother m : v) {
    // System.out.println(m);}
    for (int i = 0; i < v.size(); i++) {
      Mother mot = v.get(i);
      System.out.println(mot.m.money);
      // System.out.println(m);// 이 두개의 차이 를 아니?
      // System.out.println(m.toString());// 차이를 알아야 해
    }
  }
}
