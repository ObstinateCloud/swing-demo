package com.lengedyun.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @title: MouseAdapter
 * @description: 通过适配器可以只重写某个事件
 * @auther: zhangjianyun
 * @date: 2022/11/16 15:40
 */
public class MyMouseAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println(e.getClickCount());
    }
}
