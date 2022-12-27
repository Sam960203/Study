package kh_java.UI;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.util.Vector;

public class List extends JFrame {
  
  JTextField jtf_display = new JTextField(10);
  JPanel jp_center = new JPanel();
  DefaultTableModel model = new DefaultTableModel();
  
  Vector<String> rowOne = new Vector<String>();
  rowOne.addElement("남        웅        식");
  rowOne.addElement("지        휘        자");
  rowOne.addElement("2  7");
  rowOne.addElement("경 기 도   일 산"); // 2번째 줄

  Vector<Vector> rowData = new Vector<Vector>();
  rowData.addElement(rowOne);

  Vector<String> columnNames = new Vector<String>();
  columnNames.addElement("이름");
  columnNames.addElement("직업");
  columnNames.addElement("나이");
  columnNames.addElement("지역");// 1번째 줄
  JTable table = new JTable(rowData, columnNames);// JTable 안에 rowData, columnNames 를 넣어라

  JScrollPane scrollPane = new JScrollPane(table);

  // 생성부
  public List() {
    initDisplay();
  }

  // 화면처리기
  public void initDisplay() {
    jp_center.setBackground(Color.CYAN);
    jp_center.setLayout(new GridLayout(2, 2));
    jtf_display.setEditable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add("North", jtf_display);
    this.add("Center", jp_center);
    this.setTitle("인적사항");
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new List();
  }
}
