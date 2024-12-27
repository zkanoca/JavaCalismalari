package javaDersleri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hesap Makinesi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(5, 2));

        JLabel num1Label = new JLabel("Birinci Sayı:");
        JLabel num2Label = new JLabel("İkinci Sayı:");
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JButton addButton = new JButton("Topla");
        JButton subButton = new JButton("Çıkar");
        JButton mulButton = new JButton("Çarp");
        JButton divButton = new JButton("Böl");
        JLabel resultLabel = new JLabel("Sonuç:");

        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(resultLabel);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = 0;

                    if (e.getSource() == addButton) {
                        result = num1 + num2;
                    } else if (e.getSource() == subButton) {
                        result = num1 - num2;
                    } else if (e.getSource() == mulButton) {
                        result = num1 * num2;
                    } else if (e.getSource() == divButton) {
                        result = num1 / num2;
                    }

                    resultLabel.setText("Sonuç: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Geçersiz Giriş!");
                }
            }
        };

        addButton.addActionListener(actionListener);
        subButton.addActionListener(actionListener);
        mulButton.addActionListener(actionListener);
        divButton.addActionListener(actionListener);

        frame.setVisible(true);
    }
}
