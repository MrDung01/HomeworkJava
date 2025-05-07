package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai2 {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Exit Button App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tạo nút Exit
        JButton exitButton = new JButton("Exit");

        // Gán sự kiện thoát ứng dụng khi nhấn nút
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Thoát chương trình
            }
        });

        // Thêm nút vào giữa cửa sổ
        frame.add(exitButton, BorderLayout.CENTER);

        // Căn giữa cửa sổ trên màn hình
        frame.setLocationRelativeTo(null);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
