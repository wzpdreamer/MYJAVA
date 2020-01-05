package 上课;

import javax.swing.*;
import java.awt.*;


public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("上课.MainWindow");
//        frame.setContentPane(new MainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setPreferredSize(new Dimension(600,500));
        frame.pack();
        frame.setVisible(true);
    }
}

