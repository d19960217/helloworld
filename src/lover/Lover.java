package lover;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class MyFlowLayout {
    public static void main(String []args){
        // 声明一个类实例
        MyFlowLayout mFlow = new MyFlowLayout();

        // 创建一个外部容器， 容器名-->FlowLayout效果
        Frame f = new Frame("FlowLayout效果");
        Button button1, button2, button3;

        // 设置布局管理器
        f.setLayout(new FlowLayout(FlowLayout.CENTER,100,200));
        button1 = new Button("btn1");
        button2 = new Button("btn2");
        button3 = new Button("btn3");
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(0,100);

        f.pack();
        f.setVisible(true);
        // 添加Window监听器
        // x 退出程序
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                f.dispose();
                System.exit(0);
            }
        });
    }


}


