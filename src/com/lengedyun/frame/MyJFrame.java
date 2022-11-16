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

    private JPanel jPanel;

    public MyJFrame() throws HeadlessException {

        super("legend");
        jPanel = new JPanel();

        jPanel.setBackground(Color.BLUE);

        this.setContentPane(jPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(800,600);



    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }
}
