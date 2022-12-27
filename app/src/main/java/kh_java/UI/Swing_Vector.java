package kh_java.UI;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Swing_Vector {
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(500, 600);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setTitle("인적사항"); // 화면그리기

  }
}