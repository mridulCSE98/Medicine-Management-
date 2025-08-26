import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Profile implements ActionListener {
    JFrame f1 = new JFrame("Page-3");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JTextField tf1 = new JTextField();
    JLabel l1 = new JLabel();
    JButton b1 = new JButton("BACK TO MainManu");
    JButton b2 = new JButton("SAVE");

    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel  l7= new JLabel();
    JLabel  l8= new JLabel();
    JLabel  l9= new JLabel();
    JTextField tf4 = new JTextField();
    JTextField tf5 = new JTextField();
    JTextField tf7= new JTextField();
    JTextField tf8 = new JTextField();
    JTextField tf9 = new JTextField();
    JPanel p6 = new JPanel();
    JFileChooser fc = new JFileChooser();
    JButton b3 = new JButton("SELECT");

    ImageIcon img = new ImageIcon("Pp.jpg");
    JLabel l33 = new JLabel("", img, JLabel.CENTER);
    Profile(){
        p1.setBounds(0,0,1600,70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDI LIFE - PROFILE");
        l1.setBounds(800,35,200,50);
        l1.setFont(new Font("",Font.BOLD+Font.ITALIC,50));
        p1.add(l1);


        l4.setText("NAME: ");
        l4.setFont(new Font("MV",Font.BOLD,25));
        l4.setBounds(150,90,250,50);
        tf4.setBounds(400,90,300,50);

        l5.setText("AGE : ");
        l5.setFont(new Font("MV",Font.BOLD,25));
        l5.setBounds(150,190,200,50);
        tf5.setBounds(400,190,300,50);

        l7.setText("MOBILE NUMBER : ");
        l7.setFont(new Font("MV",Font.BOLD,25));
        l7.setBounds(150,290,250,50);
        tf7.setBounds(400,290,300,50);

        l8.setText("ADDRESS : ");
        l8.setFont(new Font("MV",Font.BOLD,25));
        l8.setBounds(150,390,200,50);
        tf8.setBounds(400,390,300,50);

        l9.setText("Home Town: ");
        l9.setFont(new Font("MV",Font.BOLD,25));
        l9.setBounds(150,490,200,50);
        tf9.setBounds(400,490,300,50);
/*
        fc.showOpenDialog(null);
        File f = fc.getSelectedFile();
        fc.setBounds(900,200,400,400);
        String filename = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);  */

        p6.add(l33);
        p6.setBounds(1000 ,100, 400,400);
        p6.setBackground(Color.RED);

        ImageIcon icon = new ImageIcon("Cartoon.bmp");

        b3.setBounds(1100,500,100,50);
        b3.addActionListener(this);
        b3.setIcon(icon);




        //back
        b1.setBounds(1100, 680, 280, 50);
        b1.setFocusable(true);
        b1.setFont(new Font("MV",Font.BOLD, 24));
        b1.setBackground(new Color(187, 97, 211));
        b1.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b1.setVerticalTextPosition(JLabel.CENTER);
        b1.addActionListener(this);
        b1.setVisible(true);




        //save button
        b2.setBounds(1380, 680, 200, 50);
        b2.setFocusable(true);
        b2.setFont(new Font("MV",Font.BOLD, 20));
        b2.setBackground(new Color(13, 210, 55));
        b2.setHorizontalTextPosition(JLabel.RIGHT); // set test left,right, center
        b2.setVerticalTextPosition(JLabel.CENTER);
        b2.addActionListener(this);
        b2.setVisible(true);


        f1.add(p1);
        f1.add(p2);
        f1.add(b1);
        f1.add(b2);
        f1.add(l4);
        f1.add(l5);
        f1.add(p6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(tf4);
        f1.add(tf5);
        f1.add(fc);
        f1.add(tf7);
        f1.add(tf8);
        f1.add(tf9);
        f1.add(b3);
       // f1.add(p3);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setBounds(150,150,1600,800);
        f1.setResizable(false);
        f1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            JOptionPane.showConfirmDialog(null," DO YOU WANT TO CLOSE");
            if(e.getSource()==b1)
            {
                HomePage hp = new HomePage();
                f1.setVisible(false);
            }
        }
        else if (e.getSource()==b2)
        {
                JOptionPane.showMessageDialog(null," Your Profiled is updated");
            try {
                FileWriter fw = new FileWriter("Profile.txt", true);
                fw.write(tf4.getText() + "\t" + tf5.getText() +"\t" + tf7.getText() +"\t" + tf8.getText() +"\t" + tf9.getText() + "\n");
                fw.close();
                f1.dispose();
            } catch (Exception ae) {
            }
            if (e.getSource() == b1) {
                JOptionPane.showMessageDialog(null, " SIGN UP SUCCESSFUL");
                SIGN_IN sn = new SIGN_IN();
                f1.setVisible(false);
            }
            PatientLIST pl = new PatientLIST();
            f1.setVisible(false);
        }
        else if (e.getSource()==b3) {
            JFileChooser fileChooser = new JFileChooser();
            f1.setVisible(true);

          int response = fileChooser.showOpenDialog(null); // select file
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
           System.out.print(file);
            }


        }

    }
}
