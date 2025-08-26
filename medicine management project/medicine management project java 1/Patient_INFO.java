import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Patient_INFO implements ActionListener {

    JFrame f1 = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel();
    JTable tb1 = new JTable();
    JButton b1 = new JButton("SAVE");
    JButton b2 = new JButton("DELETE");

    JLabel l4 = new JLabel();
    JLabel l41 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l51 = new JLabel();
    JLabel  l7= new JLabel();
    JLabel  l71= new JLabel();
    JLabel  l8= new JLabel();
    JLabel  l9= new JLabel();
    JLabel  l10= new JLabel();
    JTextField tf4 = new JTextField();
    JTextField tf5 = new JTextField();
    JTextField tf7= new JTextField();
    JTextField tf8 = new JTextField();
    JTextField tf9 = new JTextField();
    JTextField tf41 = new JTextField();

    JTextField tf71 = new JTextField();
    JButton b = new JButton("ADD MEDICINE");
    JButton b11 = new JButton("BACK");
    JButton b12 = new JButton("Profile");




    Patient_INFO(){

        b11.setBounds(0, 0, 100, 30);
        b11.setFont(new Font("TT",Font.PLAIN,20));
        b11.setBackground(new Color(0xE90DD6));
        b11.addActionListener(this);
        f1.add(b11);
        b12.setBounds(110, 0, 100, 30);
        b12.setFont(new Font("TT",Font.PLAIN,20));
        b12.setBackground(new Color(0xE90DD6));
        b12.addActionListener(this);
        f1.add(b12);
        p1.setBounds(0,0,1600,70);
        p1.setBackground(new Color(0xF73FEA74, true));
        l1.setText("MEDI LIFE - PATIENT-INFO");
        l1.setBounds(800,35,200,50);
        l1.setFont(new Font("",Font.BOLD+Font.ITALIC,50));
        p1.add(l1);

        b1.setBounds(1300, 800, 100, 50);
        b1.setFocusable(true);
        b1.setFont(new Font("MV",Font.BOLD, 15));
        b1.setBackground(new Color(187, 97, 211));
        b1.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b1.setVerticalTextPosition(JLabel.CENTER);
        b1.addActionListener(this);
        b1.setVisible(true);

       b.setBounds(750, 700, 200, 50);
       b.setFocusable(true);
       b.setFont(new Font("MV",Font.BOLD, 15));
       b.setBackground(new Color(187, 97, 211));
       b.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
       b.setVerticalTextPosition(JLabel.CENTER);
       b.addActionListener(this);
       b.setVisible(true);
        f1.add(b);


        l4.setText("NAME: ");
        l4.setFont(new Font("MV",Font.BOLD,25));
        l4.setBounds(150,90,250,50);
        tf4.setBounds(400,90,300,50);

        l41.setText("WEIGHT: ");
        l41.setFont(new Font("MV",Font.BOLD,25));
        l41.setBounds(750,90,250,50);
        tf41.setBounds(880,90,200,50);

        l5.setText("AGE : ");
        l5.setFont(new Font("MV",Font.BOLD,25));
        l5.setBounds(150,190,200,50);
        tf5.setBounds(400,190,300,50);

        l51.setText("Gender : ");
        l51.setFont(new Font("MV",Font.BOLD,25));
        l51.setBounds(750,190,250,50);
        String Gender[] = {"Male", "Female","Other"};
        JComboBox jc1 = new JComboBox(Gender);
        jc1.setBounds(880,190,200,50);
        l51.add(jc1);
        f1.add(l51);
        f1.add(jc1);

        l7.setText("MOBILE NUMBER : ");
        l7.setFont(new Font("MV",Font.BOLD,25));
        l7.setBounds(150,290,250,50);
        tf7.setBounds(400,290,300,50);

        l71.setText("BG : ");
        l71.setFont(new Font("MV",Font.BOLD,25));
        l71.setBounds(750,290,250,50);
        tf71.setBounds(880,290,200,50);
        f1.add(l71);
        f1.add(tf71);

        l8.setText("ADDRESS : ");
        l8.setFont(new Font("MV",Font.BOLD,25));
        l8.setBounds(150,390,200,50);
        tf8.setBounds(400,390,300,50);

        l9.setText("Home Town: ");
        l9.setFont(new Font("MV",Font.BOLD,25));
        l9.setBounds(150,490,200,50);
        tf9.setBounds(400,490,300,50);

        l10.setText("Relation: ");
        l10.setFont(new Font("MV",Font.BOLD,25));
        l10.setBounds(150,590,200,50);




        String items[] = {"Father", "Mother", "Brother", "Sister","Uncle","Aunty","Friend"};
        JComboBox jc = new JComboBox(items);
        jc.setBounds(400, 590, 150, 50);
        l10.add(jc);






        b2.setBounds(1400, 800, 100, 50);
        b2.setFocusable(true);
        b2.setFont(new Font("MV",Font.BOLD, 15));
        b2.setBackground(new Color(253, 1, 1));
        b2.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b2.setVerticalTextPosition(JLabel.CENTER);
        b2.addActionListener(this);
        b2.setVisible(true);

        String [][] data=
                {
                        {"SL","MEDICINE NAME","MG","PER DAY","Price","Exp Date"},
                        {"1","Fexo","120","1","8","20/12/2022"},
                        {"2","NAPA","10","1","8","20/12/2022"},
                        {"3","N/A","0","1","N/A","N/A"},
                        {"4","N/A","0","1","N/A","N/A"}
                };

        String []column={"SL","MEDICINE NAME","MG","PER DAY","Price","Exp Date"};

        DefaultTableModel m =new DefaultTableModel(data,column);
        JTable tb2 = new JTable(data,column);
        tb2.setFont(new Font("MV",Font.BOLD+Font.ITALIC,15));
        tb2.setBackground(new Color(0x11CAEE));
        tb2.setFont(new Font("MV",Font.PLAIN,15));
        tb2.setSize(1500, 600);
        tb2.setBounds(0,0,1400,600);
        p2.add(tb2);
        p2.setBounds(880,400,600,450);

f1.add(p2);
        /*b3.setBounds(1500, 800, 100, 50);
        b3.setFocusable(true);
        b3.setFont(new Font("MV",Font.BOLD, 15));
        b3.setBackground(new Color(37, 206, 103));
        b3.setHorizontalTextPosition(JLabel.LEFT); // set test left,right, center
        b3.setVerticalTextPosition(JLabel.CENTER);
        b3.addActionListener(this);
        b3.setVisible(true);
*/




        f1.add(l10);
        f1.add(jc);
        f1.add(l4);
        f1.add(l41);
        f1.add(l9);
        f1.add(l5);
        f1.add(l8);
        f1.add(l7);
        f1.add(tf4);
        f1.add(tf41);
        f1.add(tf5);
        f1.add(tf7);
        f1.add(tf8);
        f1.add(tf9);


        f1.add(b1);
        f1.add(b2);
        //f1.add(b3);
        f1.add(p1);

        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        f1.setBounds(150,150,1600,900);
        f1.setResizable(false);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {

            try {
                FileWriter fw = new FileWriter("PatientInfo.txt", true);
                fw.write(tf4.getText() + "\t" + tf5.getText() +"\t" + tf7.getText() +"\t" + tf8.getText() +"\t" + tf9.getText()+"\t"  +tf41.getText()+"\t" +tf71.getText()+"\n");
                fw.close();
                f1.dispose();
            }
            catch (Exception ae) {
            }
            JOptionPane.showMessageDialog(null,"SAVED");
            PatientLIST pl = new PatientLIST();
            f1.setVisible(false);
        }
        else if (e.getSource() == b)
        {
            Medicine pl = new Medicine();
            f1.setVisible(false);
        } 
else if (e.getSource()==b11) {
            {
                f1.setVisible(false);
                PatientLIST pl = new PatientLIST();
            }

        } else if (e.getSource()==b12) {
            f1.setVisible(false);
            Profile pp = new Profile();}

        }

    }

