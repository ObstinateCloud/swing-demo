package com.lengedyun.listener;

import javax.swing.*;

/**
 * @title: ListenerTest
 * @description: 监听器
 * @auther: zhangjianyun
 * @date: 2022/11/16 14:39
 */
public class ListenerTest {


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("鼠标监听器");
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("监听中");
        jFrame.add(jButton);
        jButton.addMouseListener(new MyMouseAdapter());
//        jButton.addMouseListener(new MyMouseListener());
//        jButton.addMouseMotionListener(new MyMouseMotionListener());

//        jButton.addMouseWheelListener(new MyMouseWheelListener());

        jFrame.setVisible(true);
    }


}
