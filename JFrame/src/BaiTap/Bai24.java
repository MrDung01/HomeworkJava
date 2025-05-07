package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bai24 extends JFrame {
    private JCheckBox checkBox;

    public Bai24() {
        // Thiết lập JFrame
        setTitle("JCheckBox Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo JCheckBox
        checkBox = new JCheckBox("Enable Background");

        // Thêm sự kiện cho JCheckBox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    getContentPane().setBackground(Color.GREEN); // Nền xanh khi được chọn
                } else {
                    getContentPane().setBackground(null); // Trở về mặc định
                }
            }
        });

        // Thêm JCheckBox vào JFrame
        add(checkBox);

        // Hiển thị JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bai24();
    }
}
