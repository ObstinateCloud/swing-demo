package com.lengedyun.layout;

import java.awt.*;

/**
 * @title: CustomerLayout
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/16 9:17
 */
public class CustomerLayout extends CustomerLayoutAdapter {
    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
//        1.
        System.out.println("---addLayoutComponent---");
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        //2.
        System.out.println("---removeLayoutComponent---");
    }

    @Override
    public void layoutContainer(Container parent) {
        //3.
        System.out.println("---layoutContainer---");

        int width = parent.getWidth();
        int height = parent.getHeight();
        //获取所有的子控件
        Component[] components = parent.getComponents();
        //eg.对所有控件 每两个一组 横向充满纵向100
        for (int i = 0; i < components.length; i++) {
            System.out.println(width);
            Component component = components[i];
            if (i%2==0){
                component.setBounds(0,i/2*100,width/2,100);
            }else {
                component.setBounds(width/2,i/2*100,width/2,100);
            }

        }

    }


}
