package lover;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDialog {
    public static void main(String[] args) {
        Frame f = new Frame("Dialog Test");
        f.setLayout(new FlowLayout());
        f.setBounds(300,400,600,800);


        Dialog dlgModal = new Dialog(f, "Modal Dialog", true);          // 打开该会话框之后，在当前会话框结束之前，不能在主对话框进行操作
        Dialog dlgNonModal = new Dialog(f, "Non-modal Dialog", false);  // 打开该会话框之后，依然可以在主对话框进行操作

        Button btnModal = new Button("Modal");
        Button btnNonModal = new Button("Non Modal");

        dlgModal.setBounds(20, 30, 200, 300);
        dlgNonModal.setBounds(100, 200, 400, 500);

        btnModal.addActionListener(e -> dlgModal.setVisible(true));
        btnNonModal.addActionListener(e -> dlgNonModal.setVisible(true));

        f.add(btnModal,BorderLayout.NORTH);
        f.add(btnNonModal,BorderLayout.SOUTH);


        Button cbtn = new Button("close");

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                f.setVisible(false);
                System.exit(0);
            }
        });
        dlgModal.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                dlgModal.dispose();
            }
        });
        cbtn.addActionListener(e->dlgNonModal.dispose());
        dlgNonModal.add(cbtn);




        f.setVisible(true);
    }
}


