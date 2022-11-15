package com.lengedyun.test;

import com.lengedyun.frame.MyJFrame;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @title: Test1
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/14 14:54
 */
public class Test2 {

    public static void main(String[] args) {
        MyJFrame jFrame = new MyJFrame();

        //文本框
        JTextField jTextField = new JTextField();
        jTextField.setText("legend test");
        jTextField.setColumns(20);

        //专门用于密码处理
        JPasswordField jPasswordField = new JPasswordField();

        //复选框
        JCheckBox jCheckBox = new JCheckBox("用户协议");

        //下拉列表
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("red");
        comboBox.addItem("green");
        comboBox.addItem("yellow");
        comboBox.addItem("blue");
        comboBox.setSelectedIndex(3);

        //文本控件
        JLabel jLabel = new JLabel(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

        JButton jButton = new JButton("按一下");

        jButton.addActionListener(e-> {
            System.out.println(jTextField.getText());
            System.out.println(jCheckBox.isSelected());
            System.out.println(comboBox.getSelectedItem().toString());
            jLabel.setText(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        });

        jFrame.getjPanel().add(jButton);
        jFrame.getjPanel().add(jTextField);
        jFrame.getjPanel().add(jCheckBox);
        jFrame.getjPanel().add(comboBox);
        jFrame.getjPanel().add(jLabel);


        //最后执行渲染操作
        jFrame.setVisible(true);

        System.out.println(1111);
    }

}
