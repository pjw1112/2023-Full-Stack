package com.company.day042;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleSwingUI {
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowUI();
            }
        });
    }

    private static void createAndShowUI() {
    	Scanner sc = new Scanner(System.in);
    	
        JFrame frame = new JFrame("Updated Swing UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 검은색 화면 추가
        JTextArea consoleArea = new JTextArea(10, 40);
        consoleArea.setBackground(Color.BLACK);
        consoleArea.setForeground(Color.GREEN);
        consoleArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        consoleArea.setEditable(false);

        // 콘솔처럼 JTextArea에 콘솔 출력 설정
        PrintStream consoleStream = new PrintStream(new CustomOutputStream(consoleArea));
        System.setOut(consoleStream);

        // JScrollPane을 사용하여 스크롤 가능하도록 만듭니다.
        JScrollPane scrollPane = new JScrollPane(consoleArea);
        frame.add(scrollPane, BorderLayout.NORTH);

        // 버튼 6개 추가
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    System.out.println("insult number > ");
                    int num = sc.nextInt();
                }
            });
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // 프레임 크기 및 표시 설정
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}

class CustomOutputStream extends OutputStream {
    private JTextArea textArea;

    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}