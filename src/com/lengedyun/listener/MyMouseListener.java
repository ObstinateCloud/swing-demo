package com.lengedyun.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @title: MyMouseListener
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/16 15:16
 */
public class MyMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");
        System.out.println(e.getClickCount()); //点击次数
        System.out.println(e.getPoint()); //坐标
        System.out.println(e.getButton()); //左键1 右键3 中键2
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("移入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("移除");
    }
}
