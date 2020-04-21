import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class PuzzleGame extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next;
    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<JButton> buttons = new ArrayList<>();

    PuzzleGame() {
        super("Puzzle Game");
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        next = new JButton("shuffle!");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add(" ");
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);

        b1.setBounds(60, 30, 50, 40);
        b2.setBounds(120, 30, 50, 40);
        b3.setBounds(180, 30, 50, 40);
        b4.setBounds(60, 80, 50, 40);
        b5.setBounds(120, 80, 50, 40);
        b6.setBounds(180, 80, 50, 40);
        b7.setBounds(60, 130, 50, 40);
        b8.setBounds(120, 130, 50, 40);
        b9.setBounds(180, 130, 50, 40);
        next.setBounds(100, 200, 100, 40);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(next);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        buttonShuffle();

        next.setForeground(Color.red);
        setSize(300, 300);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void buttonShuffle() {
        Collections.shuffle(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            buttons.get(i).setText(numbers.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            buttonShuffle();
        }
        if (e.getSource() == b1) {
            String s = b1.getText();
            if (b2.getText().equals(" ")) {
                b2.setText(s);
                b1.setText(" ");
            } else if (b4.getText().equals(" ")) {
                b4.setText(s);
                b1.setText(" ");
            }
        }
        if (e.getSource() == b2) {
            String s = b2.getText();
            if (b1.getText().equals(" ")) {
                b1.setText(s);
                b2.setText(" ");
            } else if (b3.getText().equals(" ")) {
                b3.setText(s);
                b2.setText(" ");
            } else if (b5.getText().equals(" ")) {
                b5.setText(s);
                b2.setText(" ");
            }
        }
        if (e.getSource() == b3) {
            String s = b3.getText();
            if (b2.getText().equals(" ")) {
                b2.setText(s);
                b3.setText(" ");
            } else if (b6.getText().equals(" ")) {
                b6.setText(s);
                b3.setText(" ");
            }
        }
        if (e.getSource() == b4) {
            String s = b4.getText();
            if (b5.getText().equals(" ")) {
                b5.setText(s);
                b4.setText(" ");
            } else if (b7.getText().equals(" ")) {
                b7.setText(s);
                b4.setText(" ");
            } else if (b1.getText().equals(" ")) {
                b1.setText(s);
                b4.setText(" ");
            }
        }
        if (e.getSource() == b5) {
            String s = b5.getText();
            if (b2.getText().equals(" ")) {
                b2.setText(s);
                b5.setText(" ");
            } else if (b4.getText().equals(" ")) {
                b4.setText(s);
                b5.setText(" ");
            } else if (b6.getText().equals(" ")) {
                b6.setText(s);
                b5.setText(" ");
            } else if (b8.getText().equals(" ")) {
                b8.setText(s);
                b5.setText(" ");
            }
        }
        if (e.getSource() == b6) {
            String s = b6.getText();
            if (b5.getText().equals(" ")) {
                b5.setText(s);
                b6.setText(" ");
            } else if (b9.getText().equals(" ")) {
                b9.setText(s);
                b6.setText(" ");
            } else if (b3.getText().equals(" ")) {
                b3.setText(s);
                b6.setText(" ");
            }
        }
        if (e.getSource() == b7) {
            String s = b7.getText();
            if (b4.getText().equals(" ")) {
                b4.setText(s);
                b7.setText(" ");
            } else if (b8.getText().equals(" ")) {
                b8.setText(s);
                b7.setText(" ");
            }
        }
        if (e.getSource() == b8) {
            String s = b8.getText();
            if (b5.getText().equals(" ")) {
                b5.setText(s);
                b8.setText(" ");
            } else if (b7.getText().equals(" ")) {
                b7.setText(s);
                b8.setText(" ");
            } else if (b9.getText().equals(" ")) {
                b9.setText(s);
                b8.setText(" ");
            }
        }
        if (e.getSource() == b9) {
            String s = b9.getText();
            if (b8.getText().equals(" ")) {
                b8.setText(s);
                b9.setText(" ");
            } else if (b6.getText().equals(" ")) {
                b6.setText(s);
                b9.setText(" ");
            }
        }
        if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText().equals("3") &&
                b4.getText().equals("4") && b5.getText().equals("5") && b6.getText().equals("6") &&
                b7.getText().equals("7") && b8.getText().equals("8"))
            JOptionPane.showMessageDialog(PuzzleGame.this, "You Have Won!");

    }

    public static void main(String[] args) {
        new PuzzleGame();
    }
}
