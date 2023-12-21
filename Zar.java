package Zar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zar implements ActionListener {

    JTextField jtf1;
    JButton jb1;
    Zar() {
        JFrame jf = new JFrame();
        jtf1 = new JTextField();
        jtf1.setBounds(50, 100, 250, 50);
        jtf1.setEditable(false);
        jb1 = new JButton();
        jb1.setBounds(150, 200, 100, 40);
        jb1.setText("Zarlari At");
        jb1.addActionListener(this);
        jf.add(jtf1);
        jf.add(jb1);
        jf.setSize(375, 576);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public  void actionPerformed(ActionEvent e) {
        int[] arr = new int[6];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int count = 0;
        boolean all6 = false;
        do {
            for (int i = 0; i < 6; i++) {
                arr[i] = (int)(Math.random() * range) + min;
            }
            if(arr[0] == 6 && arr[1] == 6 && arr[2] == 6 && arr[3] == 6 && arr[4] == 6 && arr[5] == 6)  {
                all6 = true;
            } else {
                all6 = false;
            }
            count++;
        } while(!all6);
        jtf1.setText(count + ". atista hepsi 6 geldi.");
    }

    public static void main(String[] args) {
        new Zar();
    }
}
