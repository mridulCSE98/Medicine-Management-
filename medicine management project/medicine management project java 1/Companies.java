import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Companies implements ActionListener {

    JFrame f1 = new JFrame();
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel("MEDICINE -Companies");
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JPanel p2 = new JPanel();

    ImageIcon img = new ImageIcon("1.png");
    JLabel l11 = new JLabel("", img, JLabel.CENTER);
    ImageIcon img1 = new ImageIcon("2.png");
    JLabel l12 = new JLabel("", img1, JLabel.CENTER);
    ImageIcon img2 = new ImageIcon("22..jpg");
    JLabel l13 = new JLabel("", img2, JLabel.CENTER);
    ImageIcon img3 = new ImageIcon("52.jpg");
    JLabel l14 = new JLabel("", img3, JLabel.CENTER);
    ImageIcon img4 = new ImageIcon("10.jpg");
    JLabel l15 = new JLabel("", img4, JLabel.CENTER);

    ImageIcon img5 = new ImageIcon("111.jpg");
    JLabel l16 = new JLabel("", img5, JLabel.CENTER);


    JPanel p11 = new JPanel();
    JPanel p12 = new JPanel();
    JPanel p13 = new JPanel();
    JPanel p14 = new JPanel();
    JPanel p15 = new JPanel();
    JPanel p16 = new JPanel();
    JLabel l5 = new JLabel();
    JLabel l23 = new JLabel();
    JLabel l24 = new JLabel();
    JLabel l25 = new JLabel();
    JLabel l26 = new JLabel();
    JButton b1 = new JButton("BACK");

    Companies() {
        b1.setBounds(0, 70, 100, 30);
        b1.setFont(new Font("TT",Font.BOLD,16));
        b1.setBackground(Color.RED);
        b1.addActionListener(this);
        f1.add(b1);
        p1.setBounds(0, 0, 1600, 70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDICINE-Companies");
        l1.setBounds(800, 35, 200, 50);
        l1.setFont(new Font("", Font.BOLD + Font.ITALIC, 50));


        f1.add(p11);
        f1.add(p12);
        f1.add(p13);
        f1.add(p14);
        f1.add(p15);
        f1.add(p16);
        f1.add(l3);
        f1.add(l4);
        f1.add(p1);
        f1.add(p2);
        //f1.add(p3);
        p1.add(l1);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setBounds(150, 120, 1600, 900);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.add(b1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            HomePage hp = new HomePage();
            f1.setVisible(false);

        }
    }
}
