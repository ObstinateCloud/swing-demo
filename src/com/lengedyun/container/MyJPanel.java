package com.lengedyun.container;

import com.lengedyun.assembly.MyButton;
import com.lengedyun.listener.MyActionListener;

import javax.swing.*;

/**
 * @title: MyJPanel
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 10:16
 */
public class MyJPanel extends JPanel{


    public MyJPanel() {
        JButton jButton = new MyButton("按一下");

        jButton.addActionListener(new MyActionListener());

        JLabel label = new JLabel("忘记密码");

        this.add(jButton);

        this.add(label);

    }
}
