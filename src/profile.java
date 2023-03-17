import javax.swing.*;
import java.awt.event.*;

public class profile {
    public static void main(String[] args) {
        new profile();
    }

    profile(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame profileframe = new JFrame();
        profileframe.setSize(390, 815);
        profileframe.setLayout(null);
        profileframe.setResizable(false);
        profileframe.setLocationRelativeTo(null);
        profileframe.setVisible(true);
        profileframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        profileframe.setIconImage(frameicon.getImage());

        JLabel profilebg = new JLabel();
        profilebg.setBounds(0, -30, 375, 812);
        profilebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("profile.png")));
        profileframe.add(profilebg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        profileframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        profileframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        profileframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        profileframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        profileframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);

        JButton personal = new JButton();
        personal.setBounds(25, 245, 327, 50);
        personal.setContentAreaFilled(false);
        profileframe.add(personal);

        ActionListener personallisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                profileframe.dispose();
                new info();
            }
        }; personal.addActionListener(personallisten);
    }
}