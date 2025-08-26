import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientLIST implements ActionListener {

    JFrame f1 = new JFrame();
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel();
    JPanel p2 = new JPanel();

    JButton b1 = new JButton("ADD");
    JButton b2 = new JButton("DELETE");
    JButton b3 = new JButton("EDIT");
    JTable tb1 = new JTable();
    JScrollBar js;
JButton b11 = new JButton("BACK");
    PatientLIST() {
        p1.setBounds(0, 0, 1600, 70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDICAL - PATIENT-LIST");
        l1.setBounds(800, 35, 200, 50);
        l1.setFont(new Font("", Font.BOLD + Font.ITALIC, 50));
        p1.add(l1);

        b1.setBounds(1000, 800, 150, 50);
        b1.setFocusable(true);
        b1.setFont(new Font("MV", Font.BOLD, 24));
        b1.setBackground(new Color(187, 97, 211));
        b1.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b1.setVerticalTextPosition(JLabel.CENTER);
        b1.addActionListener(this);
        b1.setVisible(true);

        b11.setBounds(0, 0, 100, 30);
        b11.setFont(new Font("TT",Font.PLAIN,16));
        b11.setBackground(Color.RED);
        b11.addActionListener(this);
        f1.add(b11);


        String [][] data=
                {
                        {"SL","NAME","RELATION","TOTAL COST"},
                        {"101","Karim","Friend", String.valueOf(30*8)},
                        {"102","Kudu","Friend",String.valueOf(10*15)},
                        {"103","Rahim","Friend","0"},
                        {"104","Judu","Friend","0"}
                };

        String []column={"SL","NAME","Relation","TOTAL COST"};



        DefaultTableModel m =new DefaultTableModel(data,column);
        JTable tb2 = new JTable(data,column);
        tb2.setFont(new Font("MV",Font.BOLD+Font.ITALIC,15));
        tb2.setBackground(new Color(0x11CAEE));
        tb2.setSize(1500, 600);
        tb2.setBounds(0,0,6000,600);
        p2.add(tb2);

        p2.setBounds(50, 250, 1500, 600);






        b2.setBounds(1200, 800, 150, 50);
        b2.setFocusable(true);
        b2.setFont(new Font("MV", Font.BOLD, 24));
        b2.setBackground(new Color(253, 1, 1));
        b2.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b2.setVerticalTextPosition(JLabel.CENTER);
        b2.addActionListener(this);
        b2.setVisible(true);

        b3.setBounds(1400, 800, 150, 50);
        b3.setFocusable(true);
        b3.setFont(new Font("MV", Font.BOLD, 24));
        b3.setBackground(new Color(37, 206, 103));
        b3.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b3.setVerticalTextPosition(JLabel.CENTER);
        b3.addActionListener(this);
        b3.setVisible(true);






        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(p1);
        f1.add(p2);
        //f1.add(p3);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        f1.setBounds(150, 100, 1600, 900);
        f1.setResizable(false);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.setVisible(false);
            Patient_INFO pi = new Patient_INFO();
        } else if (e.getSource()==b11) {
            Profile pp = new Profile();
            f1.setVisible(true);

        }


    }
}

