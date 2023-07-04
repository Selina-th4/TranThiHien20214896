package hust.soict.dsai.swing;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AWTAccumulator extends Frame {
    private static final long serialVersionUID = 1L;
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator() {
        super("AWT Accumulator");
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The Accumulated Sum is: "));

        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                int numberIn = Integer.parseInt(tfInput.getText());
                sum += numberIn;
                tfInput.setText("");
                tfOutput.setText(String.valueOf(sum));
            } catch (NumberFormatException e) {
                tfOutput.setText("Invalid input");
            }
        }
    }
}
