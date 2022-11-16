package com.lengedyun;

import com.lengedyun.frame.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /**
         * 参考教程B站 阿发你好 java swing教程
         */

        //Jxxx控件 java.swing包
        //xxx控件 java.awt包

//        JFrame frame = new JFrame("窗口1");
//        //关闭窗口时，结束进程
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800,600);
//
//        //容器对象
//        JPanel jPanel = new JPanel();
//        jPanel.setBackground(Color.BLUE);
//        frame.setContentPane(jPanel);
//
//        //控件
//        JButton jButton = new JButton("按一下");
//
//        jPanel.add(jButton);
//
//        JLabel jLabel = new JLabel("111");
//        jPanel.add(jLabel);
//
//        jPanel.add(new JLabel("label"));
//
//        //这个需要放在最后
//        frame.setVisible(true);

        MyJFrame jFrame = new MyJFrame();


    }
}
