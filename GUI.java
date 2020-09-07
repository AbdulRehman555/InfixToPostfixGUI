import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
        private static JPanel panel;
        private static JFrame frame;
        private static JLabel infixLabel;
        private static JTextField infixText;
        private static JTextField postfixText;
        private static  JLabel postfixLabel;
        private static JButton button;

        public static void main(String [] args){
            panel =new JPanel();
            frame=new JFrame();
            Color blue=new Color(0,116,232);
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame .add(panel);
            panel.setLayout(null);
            infixLabel =new JLabel("Infix Notation");
            infixLabel.setBounds(50,50,100,25);
            panel.add(infixLabel);
            infixText =new JTextField();
            infixText.setBounds(170,50,180,25);
            panel.add(infixText);
            postfixLabel =new JLabel("Postfix Notation");
            postfixLabel.setBounds(50,100,100,25);
            panel.add(postfixLabel);

            button=new JButton("Convert");
            button.setBounds(50,150,298,25);
            button.setBackground(blue);
            button.addActionListener(new GUI());
            panel.add(button);

            frame.setVisible(true);

        }

    @Override
        public void actionPerformed(ActionEvent e) {
            Test test=new Test();
            String infix= infixText.getText();
            postfixText =new JTextField();
            postfixText.setBounds(170,100,180,25);
            postfixText.setText(test.infixToPostfix(infix));
            panel.add(postfixText);

        }
    }
