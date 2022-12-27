package kh_java.Dec15;

public class DeptVO {
  private int deptno;
  private String dname;
  private String loc;

  public int getDeptno() {
    return this.deptno;
  }

  public void setDeptno(int deptno) {
    this.deptno = deptno;
  }

  public String getDname() {
    return this.dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public String getLoc() {
    return this.loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

}
/*
 * 배열복사
 * 얕은 복사
 * 복사된 배열이나 원본배열이 변경이될때 서로간의 값이 같이 바뀐다
 * 깊은복사
 * 
 */