package com.lengedyun.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @title: Test1
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 14:54
 */
public class Test1 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试1");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,600);

        JLabel jLabel = new JLabel();

        JButton jButton = new JButton("获取时间");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            }
        });

        JPanel jPanel = new JPanel();
        jPanel.add(jButton);
        jPanel.add(jLabel);

        jFrame.setContentPane(jPanel);


        jFrame.setVisible(true);

    }

}
