package com.lengedyun.listener;

import com.lengedyun.assembly.MyButton;
import com.lengedyun.assembly.MyLable;
import com.lengedyun.container.MyJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @title: MyActionListener
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 10:27
 */
public class MyActionListener implements ActionListener {

    private MyLable myLable = new MyLable("新增");


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getID());
        System.out.println(e.getActionCommand());

        MyButton source = (MyButton) e.getSource();
        source.setText(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        MyJPanel parent = (MyJPanel) source.getParent();
        parent.add(new JLabel("aaaaa"+new Random(10).nextInt()));


    }
}
