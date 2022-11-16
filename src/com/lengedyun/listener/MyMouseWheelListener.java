package com.lengedyun.listener;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * @title: MyMouseWheelListener
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/16 15:23
 */
public class MyMouseWheelListener implements MouseWheelListener {
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("滚轮移动");
    }
}
