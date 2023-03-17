import javax.swing.*;
import java.awt.event.*;

public class menu {
    public static void main(String[] args) {
        new menu();
    }

    menu(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame menuframe = new JFrame();
        menuframe.setSize(390, 815);
        menuframe.setLayout(null);
        menuframe.setResizable(false);
        menuframe.setLocationRelativeTo(null);
        menuframe.setVisible(true);
        menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuframe.setIconImage(frameicon.getImage());

        JLabel menubg = new JLabel();
        menubg.setBounds(0, -30, 375, 812);
        menubg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("menu.png")));
        menuframe.add(menubg);

        JButton deposit = new JButton();
        deposit.setBounds(40, 160, 50, 50);
        deposit.setContentAreaFilled(false);
        menuframe.add(deposit);

        ActionListener depositlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent d){
                menuframe.dispose();
                new assets();
            }
        }; deposit.addActionListener(depositlisten);

        JButton send = new JButton();
        send.setBounds(120, 160, 50, 50);
        send.setContentAreaFilled(false);
        menuframe.add(send);

        ActionListener sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent s){
                menuframe.dispose();
                new assets();
            }
        }; send.addActionListener(sendlisten);

        JButton orders = new JButton();
        orders.setBounds(213, 160, 50, 50);
        orders.setContentAreaFilled(false);
        menuframe.add(orders);

        ActionListener orderlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent o){
                menuframe.dispose();
                new transactions();
            }
        }; orders.addActionListener(orderlisten);

        JButton referral = new JButton();
        referral.setBounds(293, 160, 50, 50);
        referral.setContentAreaFilled(false);
        menuframe.add(referral);

        ActionListener reflist = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent r){
                menuframe.dispose();
                new profile();
            }
        }; referral.addActionListener(reflist);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        menuframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                menuframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        menuframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                menuframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        menuframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                menuframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        menuframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                menuframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        menuframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                menuframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}