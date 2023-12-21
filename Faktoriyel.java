package FaktoriyelJavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Faktoriyel {
    public static int faktoriyel(int n) {
        int faktoriyel = 1;
        if(n == 0 || n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel label1 = new JLabel("Sayi");
        JLabel label2 = new JLabel("Faktoriyel");
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JButton b = new JButton("Hesapla");
        b.setBounds(150, 200, 100, 40);
        label1.setBounds(100, 100, 100, 40);
        label2.setBounds(275, 100, 100, 40);
        text1.setBounds(75, 150, 100, 25);
        text2.setBounds(250, 150, 100, 25);
        text2.setEditable(false);
        f.add(b);
        f.add(label1);
        f.add(label2);
        f.add(text1);
        f.add(text2);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = text1.getText();

                int sayi = Integer.parseInt(text);
                int sonuc = faktoriyel(sayi);

                //String result = String.valueOf(sonuc);

                text2.setText(Integer.toString(sonuc));
            }
        });
    }
}
