import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class transactions {
    static JLabel transactlist[] = new JLabel[10], transactdetails[] = new JLabel[10];
    static String[] transacttype2 = home.transacttype;
    static String[] transactamount2 = home.transactamount;
    public static void main(String[] args) {
        new transactions();
    }

    transactions(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame transactionsframe = new JFrame();
        transactionsframe.setSize(390, 815);
        transactionsframe.setLayout(null);
        transactionsframe.setResizable(false);
        transactionsframe.setLocationRelativeTo(null);
        transactionsframe.setVisible(true);
        transactionsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        transactionsframe.setIconImage(frameicon.getImage());

        JLabel transactionsbg = new JLabel();
        transactionsbg.setBounds(0, -30, 375, 812);
        transactionsbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("transactions.png")));
        transactionsframe.add(transactionsbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        transactionsframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                transactionsframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        transactionsframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                transactionsframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        transactionsframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                transactionsframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        transactionsframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                transactionsframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        transactionsframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                transactionsframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);

        for (int i =  0; i < 10; i++) {
            transactlist[i] = new JLabel("", JLabel.CENTER);
            switch(transacttype2[i]){
                case "send":
                transactlist[i].setIcon(new ImageIcon(getClass().getClassLoader().getResource("sent.png")));
                break;
                case "received":
                transactlist[i].setIcon(new ImageIcon(getClass().getClassLoader().getResource("received.png")));
                break;
                default:   
                transactlist[i].setIcon(new ImageIcon(getClass().getClassLoader().getResource("received.png")));
                break;
            }
            transactlist[i].setBounds(-10, (i * 60) + 120, transactionsframe.getWidth(), 95);
            transactlist[i].setForeground(Color.WHITE);
            transactionsbg.add(transactlist[i]);

            transactdetails[i] = new JLabel();
            switch(transacttype2[i]){
                case "send":
                transactdetails[i].setText(transactamount2[i]);
                break;
                case "received":
                transactdetails[i].setText(transactamount2[i]);
                break;
                default:   
                transactdetails[i].setText(transactamount2[i]);
                break;
            }
            transactdetails[i].setBounds(285, (i * 60) + 170, 100, 16);
            transactdetails[i].setFont(new FontUIResource("Titillium Web",0, 13));
            transactdetails[i].setForeground(Color.BLACK);
            transactionsbg.add(transactdetails[i]);
        }
    }
}