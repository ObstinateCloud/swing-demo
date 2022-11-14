package com.lengedyun.frame;

import com.lengedyun.container.MyJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @title: MyJFrame
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 10:14
 */
public class MyJFrame extends JFrame {

    public MyJFrame(String title) throws HeadlessException {

        super(title);
        MyJPanel jPanel = new MyJPanel();

        jPanel.setBackground(Color.BLUE);

        this.setContentPane(jPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(800,600);

        this.setVisible(true);

    }
}
