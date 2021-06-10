import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame {
    private final JTextField numberTextField;
    private int number = 0;

    public void updateNumberTextField() {
        numberTextField.setText("" + number);
    }

    public SwingCounter() {
        setBounds(400, 400, 150, 150);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("Счетчик");

        add(new Label("Число"));
        numberTextField = new JTextField("" + number, 2);
        numberTextField.setEditable(false);
        add(numberTextField);

        JButton plusButton = new JButton("+1");
        JButton minusButton = new JButton("-1");

        plusButton.addActionListener(e -> {
            if (number < 3) {
                number++;
                updateNumberTextField();
            }
        });

        minusButton.addActionListener(e -> {
            if (number > -5) {
                number--;
                updateNumberTextField();
            }
        });

        add(plusButton);
        add(minusButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCounter();
    }
}