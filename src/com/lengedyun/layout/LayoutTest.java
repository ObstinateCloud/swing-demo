package com.lengedyun.layout;

import javax.swing.*;
import java.awt.*;

/**
 * @title: LayoutTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/11/15 10:26
 */
public class LayoutTest {

    public static void main(String[] args) {

        //参考链接 https://zhuanlan.zhihu.com/p/372373627

//        defaultLayout();
//        borderLayoutTest();
//        cardLayoutTest();
//        gridLayoutTest();
//        gridBagLayoutTest();
//        boxLayoutTest();
//        handleLayout();
        customerLayout();


    }


    public static void defaultLayout(){
        JFrame jFrame = new JFrame("默认布局");
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        LayoutManager layout = jPanel.getLayout();
//        //默认使用 java.awt.FlowLayout 瀑布流 从左到右，从上到下
        System.out.println(layout.getClass().getName());
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);
    }

    public static void borderLayoutTest(){
        JFrame jFrame = new JFrame("边界布局管理器");
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        //BorderLayout 边界布局管理器 东西南北中
        jPanel.setLayout(new BorderLayout());
        jPanel.add(new JButton("1"), BorderLayout.SOUTH);
        jPanel.add(new JButton("2"), BorderLayout.CENTER);
        jPanel.add(new JButton("3"), BorderLayout.EAST);
        jPanel.add(new JButton("4"), BorderLayout.WEST);
        jPanel.add(new JButton("5"), BorderLayout.NORTH);

        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);
    }


    public static void cardLayoutTest(){
        JFrame jFrame = new JFrame("卡片布局管理器");
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        //CardLayout 卡片布局管理器 多层
        CardLayout cardLayout = new CardLayout();
        jPanel.setLayout(cardLayout);
        JButton jButton1 = new JButton("切换卡片2");
        jButton1.setSize(60,40);

        JButton jButton2 = new JButton("切换卡片1");
        jButton2.setSize(60,40);


        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("2"));
        jPanel1.add(new JButton("3"));
        jPanel1.add(jButton1);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JButton("4"));
        jPanel2.add(new JButton("5"));
        jPanel2.add(new JButton("6"));
        jPanel2.add(jButton2);

        jPanel.add(jPanel1,"card1");
        jPanel.add(jPanel2,"card2");

        jButton1.addActionListener(e-> cardLayout.show(jPanel,"card2"));
        jButton2.addActionListener(e-> cardLayout.show(jPanel,"card1"));

        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);
    }


    public static void gridLayoutTest(){
        JFrame jFrame = new JFrame("网格布局管理器");
        jFrame.setSize(800,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        //网格布局管理器  每行每列是均匀分布的
//        GridLayout gridLayout = new GridLayout(2,3);
        //指定行列及间距
        GridLayout gridLayout = new GridLayout(4,4,5,5);
        jPanel.setLayout(gridLayout);
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("+"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        jPanel.add(new JButton("-"));
        jPanel.add(new JButton("7"));
        jPanel.add(new JButton("8"));
        jPanel.add(new JButton("9"));
        jPanel.add(new JButton("*"));
        jPanel.add(new JButton("0"));
        jPanel.add(new JButton("."));
        jPanel.add(new JButton("="));
        jPanel.add(new JButton("/"));
        jFrame.setContentPane(jPanel);

        jFrame.setVisible(true);
    }


    public static void gridBagLayoutTest(){

        JFrame frame=new JFrame("拨号盘");
        GridBagLayout gbaglayout=new GridBagLayout(); //创建GridBagLayout布局管理器
        GridBagConstraints constraints=new GridBagConstraints();
        frame.setLayout(gbaglayout); //使用GridBagLayout布局管理器
        constraints.fill=GridBagConstraints.BOTH; //组件填充显示区域
        constraints.weightx=0.0; //恢复默认值
        constraints.gridwidth = GridBagConstraints.REMAINDER; //结束行
        JTextField tf=new JTextField("13612345678");
        gbaglayout.setConstraints(tf, constraints);
        frame.add(tf);
        constraints.weightx=0.5; // 指定组件的分配区域
        constraints.weighty=0.2;
        constraints.gridwidth=1;
        makeButton("7",frame,gbaglayout,constraints); //调用方法，添加按钮组件
        makeButton("8",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER; //结束行
        makeButton("9",frame,gbaglayout,constraints);
        constraints.gridwidth=1; //重新设置gridwidth的值

        makeButton("4",frame,gbaglayout,constraints);
        makeButton("5",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("6",frame,gbaglayout,constraints);
        constraints.gridwidth=1;

        makeButton("1",frame,gbaglayout,constraints);
        makeButton("2",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("3",frame,gbaglayout,constraints);
        constraints.gridwidth=1;

        makeButton("返回",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("拨号",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
        frame.setBounds(400,400,400,400); //设置容器大小
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //向JFrame中添加JButton按钮
    public static void makeButton(String title,JFrame frame,GridBagLayout gridBagLayout,GridBagConstraints constraints)
    {
        JButton button=new JButton(title); //创建Button对象
        gridBagLayout.setConstraints(button,constraints);
        frame.add(button);
    }

    public static void boxLayoutTest(){
        //盒子布局
        JFrame frame=new JFrame("盒子布局");
        Box b1=Box.createHorizontalBox(); //创建横向Box容器
        Box b2=Box.createVerticalBox(); //创建纵向Box容器
        frame.add(b1); //将外层横向Box添加进窗体
        b1.add(Box.createVerticalStrut(200)); //添加高度为200的垂直框架
        b1.add(new JButton("西")); //添加按钮1
        b1.add(Box.createHorizontalStrut(140)); //添加长度为140的水平框架
        b1.add(new JButton("东")); //添加按钮2
        b1.add(Box.createHorizontalGlue()); //添加水平胶水
        b1.add(b2); //添加嵌套的纵向Box容器
        //添加宽度为100，高度为20的固定区域
        b2.add(Box.createRigidArea(new Dimension(100,20)));
        b2.add(new JButton("北")); //添加按钮3
        b2.add(Box.createVerticalGlue()); //添加垂直组件
        b2.add(new JButton("南")); //添加按钮4
        b2.add(Box.createVerticalStrut(40)); //添加长度为40的垂直框架
        //设置窗口的关闭动作、标题、大小位置以及可见性等
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,200);
        frame.setVisible(true);
    }

    //手工布局器 自己指定每一个控件的位置
    public static void handleLayout(){
        JFrame frame=new JFrame("手动布局");
        frame.setSize(800,600);

        JPanel jPanel = new JPanel();
        //取消默认布局
        jPanel.setLayout(null);

        JButton jButton = new JButton("左上角");
        jButton.setBounds(0,0,80,60);

        jPanel.add(jButton);


        frame.setContentPane(jPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void customerLayout(){
        JFrame frame=new JFrame("自定义布局器");
        frame.setSize(800,600);

        JPanel jPanel = new JPanel();
        //取消默认布局
        jPanel.setLayout(new CustomerLayout());


        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));


        frame.setContentPane(jPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
