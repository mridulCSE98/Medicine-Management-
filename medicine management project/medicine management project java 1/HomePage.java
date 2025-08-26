import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HomePage implements ActionListener {
    JFrame f1 = new JFrame("Page-1");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel();
    
    JButton b2 = new JButton("Companies");
    JButton b3 = new JButton("SIGN IN");
    JButton b4 = new JButton("SIGN UP");

    JLabel l2 = new JLabel();

    JPanel p3 = new JPanel();

    ImageIcon img = new ImageIcon("cc.jpg");
    JLabel l3 = new JLabel("", img, JLabel.CENTER);

    JPanel p4 = new JPanel();
    JLabel l12 = new JLabel();
    JLabel l13 = new JLabel();
    JLabel l14 = new JLabel();
    HomePage(){

        p1.setBounds(0,0,1200,70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDICINE MANAGEMENT");
        l1.setBounds(800,35,200,50);
        l1.setFont(new Font("",Font.BOLD+Font.ITALIC,50));
		l1.setBackground(Color.red);
        b2.setBounds(50,0,50,15);
        b2.addActionListener(this);
        b3.setBounds(1300,0,50,15);
        b3.addActionListener(this);
        b4.setBounds(1500,0,50,15);
        b4.addActionListener(this);
        p1.add(l1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        p2.setBounds(0,670,1200,100);
        p2.setBackground(new Color(0xF73FEA74, true));
        l2.setText("MEDICINE MANAGEMENT");
        l2.setBounds(0,0,200,50);
        l2.setFont(new Font("",Font.BOLD+Font.ITALIC,50));
        p2.add(l2);


        l12.setText("The art of medicine consists of amusing");
        l12.setFont(new Font("MV",Font.ITALIC+Font.BOLD,32));
        l12.setBounds(850,250,300,50);
        l12.setBackground(new Color(224, 218, 218, 246));
        l13.setText("the patient while nature cures the disease.");
        l13.setFont(new Font("MV",Font.ITALIC+Font.BOLD,32));
        l13.setBounds(450,370,500,50);
        l13.setBackground(new Color(224, 218, 218, 246));

        l14.setText("not else is more important");
		l14.setFont(new Font("MV",Font.ITALIC+Font.BOLD,32));
        l14.setBounds(450,420,500,50);
        l14.setBackground(new Color(224, 218, 218, 246));
        p3.setBounds(0,70,1200,700);
        p3.setBackground(Color.BLACK);

        p3.add(l12);
        p3.add(l13);
        p3.add(l14);


        l3.setSize(800,800);
        l3.setVisible(true);
        p3.add(l3);

        f1.add(p1);
        f1.add(p2);
        f1.add(p3);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setBounds(50,50,1200,900);
        f1.setResizable(false);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b2) {
            Companies c = new Companies();
            f1.setVisible(false);
        } else if (e.getSource()==b3) {
            SIGN_IN sn = new SIGN_IN();
            f1.setVisible(false);
        } else if (e.getSource()== b4) {
            SIGN_UP su = new SIGN_UP();
            f1.setVisible(false);
        }

    }


}
