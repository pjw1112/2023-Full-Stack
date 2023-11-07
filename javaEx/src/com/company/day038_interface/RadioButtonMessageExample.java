package com.company.day038_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonMessageExample {
	String text="";
	
    public static void main(String[] args) {
    	RadioButtonMessageExample rr = new RadioButtonMessageExample();
        JFrame frame = new JFrame("Radio Button Message Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // 라디오 버튼 생성
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");
        JRadioButton radioButton4 = new JRadioButton("Option 4");
        JTextField textField = new JTextField("기본 텍스트", 20);
        radioButton1.addActionListener(e -> rr.updateText(textField));
        
        // 라디오 버튼 그룹 생성
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        // 버튼 생성
        JButton button = new JButton("Submit");

        // 프레임에 컴포넌트 추가
        frame.setLayout(new FlowLayout());
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(button);
        frame.add(textField);

        frame.setVisible(true);
    }
    void updateText(JTextField textField) {
        text = "버튼 1 선택함"; // 업데이트할 텍스트
//        textField.setText(newText); // JTextField에 새로운 텍스트 설정
    }
   
}

