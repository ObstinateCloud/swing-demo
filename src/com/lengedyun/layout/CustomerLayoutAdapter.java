package com.lengedyun.layout;

import java.awt.*;

/**
 * @title: CustomerLayoutAdapter
 * @description: 通过适配器 简化自定义部署器
 * @auther: zhangjianyun
 * @date: 2022/11/16 9:51
 */
public abstract class CustomerLayoutAdapter implements LayoutManager2 {
    @Override
    public void addLayoutComponent(Component comp, Object constraints) {

    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return null;
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target) {

    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

    }
}
