import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SIGN_UP implements ActionListener {

    JFrame f1 = new JFrame("PAGE 2");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel();
    JButton b1 = new JButton("Sign Up");
    JButton b2 = new JButton("Sign In");

    public JTextField tf1 = new JTextField();
    JPasswordField pf1 = new JPasswordField();
    JLabel l4 = new JLabel("Create Your Account");
    JLabel l5 = new JLabel("Already have an Account");
    SIGN_UP(){
        p1.setBounds(0,0,800,70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDI LIFE");
        l1.setBounds(800,35,200,50);
        l1.setFont(new Font("",Font.BOLD+Font.ITALIC,50));

        p1.add(l1);


        tf1.setBounds(230,200,400,50);
        tf1.setFocusable(true);
        tf1.setFont(new Font("II",Font.BOLD,15));
        tf1.setBackground(new Color(45, 233, 124, 172));
        JLabel l2 = new JLabel("EMAIL or PHONE NUMBER");
        l2.setBounds(230,160,400,50);
        l2.setFont(new Font("RR",Font.BOLD,20));


        pf1.setBounds(230,300,400,50);
        pf1.setFocusable(true);
        pf1.setFont(new Font("II",Font.BOLD,15));
        pf1.setBackground(new Color(53, 237, 128, 185));

        JLabel l3 = new JLabel("SET PASSWORD");
        l3.setBounds(230,260,200,50);
        l3.setFont(new Font("RR",Font.BOLD,20));


        //sign in button
        b1.setBounds(230, 550, 150, 50);
        b1.setFocusable(true);
        b1.setFont(new Font("MV",Font.BOLD, 24));
        b1.setBackground(new Color(187, 97, 211));
        b1.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b1.setVerticalTextPosition(JLabel.CENTER);
        b1.addActionListener(this);
        b1.setVisible(true);




        l4.setBounds(250 , 100,400,70);
        l4.setFont(new Font("MV",Font.BOLD+Font.TRUETYPE_FONT+Font.ITALIC,35));

        l5.setBounds(500 , 520,300,30);
        l5.setFont(new Font("MV",Font.BOLD+Font.TRUETYPE_FONT+Font.ITALIC,16));

        //sign up button
        b2.setBounds(500, 550, 150, 50);
        b2.setFocusable(true);
        b2.setFont(new Font("MV",Font.BOLD, 20));
        b2.setBackground(new Color(13, 210, 55));
        b2.setHorizontalTextPosition(JLabel.RIGHT); // set test left,right, center
        b2.setVerticalTextPosition(JLabel.CENTER);
        b2.addActionListener(this);
        b2.setVisible(true);


        ImageIcon img = new ImageIcon("GREEN.jpg");
        JLabel l1 = new JLabel("", img, JLabel.CENTER);
        l1.setBounds(0, 0, 1200, 700);


        f1.add(p1);
        f1.add(l2);
        f1.add(l3);
        f1.add(b1);
        f1.add(b2);
        f1.add(l4);
        f1.add(l5);
        f1.add(pf1);
        f1.setBounds(500,150,800, 700);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.add(tf1);
        f1.add(l1);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                FileWriter fw = new FileWriter("usernameANDpass.txt", true);
                fw.write(tf1.getText() + "\t" + pf1.getText() + "\n");
                fw.close();
                f1.dispose();
            } catch (Exception e) {
            }
            if (ae.getSource() == b1) {
                JOptionPane.showMessageDialog(null, " SIGN UP SUCCESSFUL");
                SIGN_IN sn = new SIGN_IN();
                f1.setVisible(false);
            }
        } else if (ae.getSource() == b2) {

            SIGN_IN sn = new SIGN_IN();
            f1.setVisible(false);

        }
    }

    /*public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {JOptionPane.showMessageDialog(null," SIGN UP SUCCESSFUL");
            SIGN_IN sn = new SIGN_IN();
            f1.setVisible(false);
        } else if (e.getSource()==b2) {

            SIGN_IN sn = new SIGN_IN();
            f1.setVisible(false);
        }

    }*/
}
