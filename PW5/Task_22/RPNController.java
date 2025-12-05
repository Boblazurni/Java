package PW5.Task_22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RPNController {
    private RPNCalculator model;
    private RPNView view;

    public RPNController(RPNCalculator model, RPNView view) {
        this.model = model;
        this.view = view;
        view.addNumberButtonListener(new NumberListener());
        view.addOperationButtonListener(new OperationListener());
        view.addClearButtonListener(e -> {
            model.clear();
            view.updateDisplay("0");
        });
    }

    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double value = Double.parseDouble(((JButton)e.getSource()).getText());
            model.push(value);
            view.updateDisplay(String.valueOf(model.getResult()));
        }
    }

    class OperationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String op = ((JButton)e.getSource()).getText();
            try {
                model.performOperation(op);
                view.updateDisplay(String.valueOf(model.getResult()));
            } catch (Exception ex) {
                view.updateDisplay("Error: " + ex.getMessage());
            }
        }
    }
}