import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Medicine implements ActionListener {
    JFrame f1 = new JFrame("Page-8");

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JLabel l1 = new JLabel();
    JTable tb1 = new JTable();
    JButton b2 = new JButton("DELETE");

    JLabel l4 = new JLabel();
    JLabel l41 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l51 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l71 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JLabel l9 = new JLabel();
    JLabel l10 = new JLabel();
    JTextField tf4 = new JTextField();
    JTextField tf5 = new JTextField();
    JTextField tf6 = new JTextField();
    JTextField tf9 = new JTextField();
    JTextField tf7 = new JTextField();
    JTextField tf8 = new JTextField();
    JTextField tf10 = new JTextField();

    JTextField tf71 = new JTextField();
    JButton b4 = new JButton("SAVE");
    JButton b11 = new JButton("BACK");
    JButton b50 = new JButton("Equal");

    Medicine() {
        b11.setBounds(0, 0, 100, 30);
        b11.setFont(new Font("TT", Font.PLAIN, 16));
        b11.setBackground(Color.RED);
        b11.addActionListener(this);
        f1.add(b11);

        p1.setBounds(0, 0, 1600, 70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDI LIFE - Medicine");
        l1.setBounds(800, 35, 200, 50);
        l1.setFont(new Font("", Font.BOLD + Font.ITALIC, 50));

        l4.setText("MEDICINE NAME: ");
        l4.setFont(new Font("MV", Font.BOLD, 25));
        l4.setBounds(150, 90, 250, 50);
        tf4.setBounds(400, 90, 300, 50);
        f1.add(l4);
        f1.add(tf4);

        l5.setText("COMPANY NAME: ");
        l5.setFont(new Font("MV", Font.BOLD, 25));
        l5.setBounds(150, 190, 250, 50);
        tf5.setBounds(400, 190, 300, 50);
        f1.add(l5);
        f1.add(tf5);

        b4.setBounds(1200, 800, 100, 50);
        b4.setFocusable(true);
        b4.setFont(new Font("MV", Font.BOLD, 15));
        b4.setBackground(new Color(187, 97, 211));
        b4.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b4.setVerticalTextPosition(JLabel.CENTER);
        b4.addActionListener(this);
        b4.setVisible(true);
        f1.add(b4);
        l6.setText("Price: ");
        l6.setFont(new Font("MV", Font.BOLD, 25));
        l6.setBounds(150, 290, 250, 50);
        tf6.setBounds(400, 290, 300, 50);
        f1.add(l6);
        f1.add(tf6);
        l7.setText("MG: ");
        l7.setFont(new Font("MV", Font.BOLD, 25));
        l7.setBounds(150, 390, 250, 50);
        tf7.setBounds(400, 390, 300, 50);
        f1.add(l7);
        f1.add(tf7);
        l8.setText("EXP DATE: ");
        l8.setFont(new Font("MV", Font.BOLD, 25));
        l8.setBounds(150, 490, 250, 50);
        tf8.setBounds(400, 490, 300, 50);
        f1.add(l8);
        f1.add(tf8);
        l9.setText("Total Medicine: ");
        l9.setFont(new Font("MV", Font.BOLD, 25));
        l9.setBounds(150, 590, 250, 50);
        tf9.setBounds(400, 590, 300, 50);
        f1.add(l9);
        f1.add(tf9);
        l10.setText("Total Price: ");
        l10.setFont(new Font("MV", Font.BOLD, 25));
        l10.setBounds(150, 650, 250, 50);
        tf10.setBounds(400, 650, 300, 50);
        f1.add(l10);
        f1.add(tf10);

        b50.setBounds(800, 650, 100, 50);
        b50.setBackground(Color.green);
        f1.add(b50);
        b50.addActionListener(this);

        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setBounds(150, 100, 1600, 900);
        f1.setResizable(false);
        f1.setVisible(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            PatientLIST pl = new PatientLIST();
            f1.setVisible(false);
        } else if (e.getSource() == b4) {
            try {
                FileWriter fw = new FileWriter("MEDICINE.txt", true);
                fw.write(tf4.getText() + "\t" + tf5.getText() + "\t" + tf6.getText() + "\t" + tf7.getText() + "\t"
                        + tf8.getText() + "\t" + tf9.getText() + "\t" + tf10.getText() + "\n");
                fw.close();
                f1.dispose();
            } catch (Exception ae) {
            }
            JOptionPane.showMessageDialog(null, " ADDED");
            f1.setVisible(false);
        } else if (e.getSource() == b50) {
            int a = Integer.parseInt(tf6.getText());
            int b = Integer.parseInt(tf9.getText());
            int c = a * b;
            tf10.setText(String.valueOf(c));
        }

    }
}
