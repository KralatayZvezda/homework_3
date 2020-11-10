package com.hehexdev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestForm extends JFrame {

    public JPanel mainPanel;
    private JPanel fioPanel;
    private JTextField fioField;
    private JRadioButton firstRadioButton;
    private JRadioButton secondRadioButton;
    private JRadioButton thirdRadioButton;
    private JPanel buttonPanel;
    private JButton testButton;
    private JButton exitButton;


    public TestForm() {

        setContentPane(mainPanel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        testButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (firstRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(mainPanel, fioField.getText() + ", это правильный ответ!");
                } else {
                    JOptionPane.showMessageDialog(mainPanel, fioField.getText() + ", вы не угадали!");
                }
            }
        });
    }

    private void createUIComponents() {

    }
}
