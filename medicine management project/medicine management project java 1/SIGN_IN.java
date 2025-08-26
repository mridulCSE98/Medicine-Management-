import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SIGN_IN implements ActionListener {

    JFrame f1 = new JFrame("PAGE 2");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel();
    JButton b1 = new JButton("Sign In");
    JButton b2 = new JButton("Sign Up");
    public JTextField tf1 = new JTextField();
    JPasswordField pf1 = new JPasswordField();
    JLabel l4 = new JLabel("SIGN IN");
    JLabel l5 = new JLabel("Create a new Account");
     SIGN_IN(){
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
        JLabel l2 = new JLabel("E-mail or Phone Number");
        l2.setBounds(230,160,400,50);
        l2.setFont(new Font("RR",Font.BOLD,20));


        pf1.setBounds(230,300,400,50);
        pf1.setFocusable(true);
        pf1.setFont(new Font("II",Font.BOLD,15));
        pf1.setBackground(new Color(53, 237, 128, 185));

        JLabel l3 = new JLabel("PASSWORD");
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

        //JOptionPane.showMessageDialog(null,"  Orange");


        //sign up button
        b2.setBounds(500, 550, 150, 50);
        b2.setFocusable(true);
        b2.setFont(new Font("MV",Font.BOLD, 20));
        b2.setBackground(new Color(13, 210, 55));
        b2.setHorizontalTextPosition(JLabel.RIGHT); // set test left,right, center
        b2.setVerticalTextPosition(JLabel.CENTER);
        b2.addActionListener(this);
        b2.setVisible(true);


        l4.setBounds(300 , 100,200,70);
        l4.setFont(new Font("MV",Font.BOLD+Font.TRUETYPE_FONT+Font.ITALIC,40));

         l5.setBounds(500 , 520,300,30);
         l5.setFont(new Font("MV",Font.BOLD+Font.TRUETYPE_FONT+Font.ITALIC,16));

        ImageIcon img = new ImageIcon("GREEN.jpg");
        JLabel l1 = new JLabel("", img, JLabel.CENTER);
        l1.setBounds(0, 0, 1200, 700);


        f1.add(p1);
        f1.add(l2);
        f1.add(l3);
        f1.add(b1);
        f1.add(b2);
        f1.add(pf1);
        f1.add(l4);
        f1.add(l5);
        f1.setBounds(500,150,800, 700);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.add(tf1);
        f1.add(l1);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            boolean matched = false;
            String uname= tf1.getText().toString();
            String pass= pf1.getText().toString();

            try
            {
                FileReader fr= new FileReader("usernameANDpass.txt");
                BufferedReader br= new BufferedReader(fr);
                String str;
                while((str=br.readLine())!=null)
                {
                    if(str.equals(uname+"\t"+pass))
                    {
                        matched=true;
                        break;
                    }
                }
            }
            catch(Exception ae){};
            if(matched)
            {
                JOptionPane.showMessageDialog(null,"Log SUCCESSFUL");
                Profile pp = new Profile();
                f1.dispose();
                f1.setVisible(false);
               }
            else{
                JOptionPane.showMessageDialog(null," User Invalid");
            }

        } else if (e.getSource()==b2) {
            SIGN_UP su = new SIGN_UP();
            f1.setVisible(false);
        }

        }
    }



       /* public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {JOptionPane.showMessageDialog(null," Login Successful");
            f1.setVisible(false);
            Profile pp = new Profile();}
        else if (e.getSource()==b2) {
            SIGN_UP su = new SIGN_UP();
            f1.setVisible(false);
        }

    } */

