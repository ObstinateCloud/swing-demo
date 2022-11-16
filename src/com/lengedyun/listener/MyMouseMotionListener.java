package com.lengedyun.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @title: MyMouseMotionListener
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/16 15:20
 */
public class MyMouseMotionListener implements MouseMotionListener {
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("按住拖动");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("移动");
    }
}
