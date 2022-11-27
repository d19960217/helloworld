package lover;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyBorderLayout {
    private Frame f;
    private Button east, north,south, west;

    public static void main(String []args){
        MyBorderLayout myB = new MyBorderLayout();
        myB.go();
    }
    public void go(){
        f = new Frame("BorderLayout展示");
        // 设置窗口的属性
        f.setBounds(400,0,600,300);
        f.setLayout(new BorderLayout());
        north = new Button("上");
        south = new Button("下");
        west = new Button("西");
        east = new Button("东");
        f.add(BorderLayout.NORTH, north);
        f.add(BorderLayout.SOUTH, south);
        f.add(BorderLayout.EAST, east);
        f.add(BorderLayout.WEST, west);
        f.setVisible(true);
        // 添加事件监听， 关闭框
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                f.dispose();
                System.exit(0);
            }
        });

    }
}

