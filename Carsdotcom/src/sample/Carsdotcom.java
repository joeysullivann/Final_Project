package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sullivanj3341 on 5/23/2017.
 */
public class Carsdotcom {
    private JButton Login;
    private JPanel panelMain;

    public Carsdotcom() {
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Login");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Carsdotcom");
        frame.setContentPane(new Carsdotcom().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
