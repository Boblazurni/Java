package PW5.Task_22;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RPNView {
    private JFrame frame;
    private JTextField display;

    public RPNView() {
        frame = new JFrame("RPN Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            panel.add(btn);
        }
        String[] ops = {"+", "-", "*", "/", "C"};
        for (String op : ops) {
            JButton btn = new JButton(op);
            panel.add(btn);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void updateDisplay(String text) {
        display.setText(text);
    }

    public void addNumberButtonListener(ActionListener listener) {
        for (Component comp : ((JPanel)frame.getContentPane().getComponent(1)).getComponents()) {
            JButton btn = (JButton) comp;
            if (btn.getText().matches("\\d")) btn.addActionListener(listener);
        }
    }

    public void addOperationButtonListener(ActionListener listener) {
        for (Component comp : ((JPanel)frame.getContentPane().getComponent(1)).getComponents()) {
            JButton btn = (JButton) comp;
            if (btn.getText().matches("[+\\-*/]")) btn.addActionListener(listener);
        }
    }

    public void addClearButtonListener(ActionListener listener) {
        for (Component comp : ((JPanel)frame.getContentPane().getComponent(1)).getComponents()) {
            JButton btn = (JButton) comp;
            if (btn.getText().equals("C")) btn.addActionListener(listener);
        }
    }
}