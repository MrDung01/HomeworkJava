package BaiTap;

import javax.swing.*;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo JFrame với tiêu đề
        JFrame frame = new JFrame("My First Swing App");

        // Đặt kích thước cửa sổ
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JLabel và căn giữa nội dung
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // Thêm JLabel vào JFrame
        frame.add(label);

        // Căn giữa cửa sổ trên màn hình
        frame.setLocationRelativeTo(null);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}

