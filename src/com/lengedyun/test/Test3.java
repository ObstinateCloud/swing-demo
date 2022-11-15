package com.lengedyun.test;

import com.lengedyun.frame.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @title: Test1
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 14:54
 */
public class Test3 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();



        JPanel jPanel = new JPanel();
        //布局管理器
        jPanel.setLayout(new BorderLayout());


        //东西南北中无区域
        jPanel.add(new JLabel("南"),BorderLayout.SOUTH);


        jFrame.setContentPane(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800,600);
        //最后执行渲染操作
        jFrame.setVisible(true);

        System.out.println(1111);
    }

}
