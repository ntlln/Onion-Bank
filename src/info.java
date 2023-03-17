import javax.swing.*;
import java.awt.event.*;

public class info {
    public static void main(String[] args) {
        new info();
    }

    info(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame infoframe = new JFrame();
        infoframe.setSize(390, 815);
        infoframe.setLayout(null);
        infoframe.setResizable(false);
        infoframe.setLocationRelativeTo(null);
        infoframe.setVisible(true);
        infoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoframe.setIconImage(frameicon.getImage());

        JLabel infobg = new JLabel();
        infobg.setBounds(0, -30, 375, 812);
        infobg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("info.png")));
        infoframe.add(infobg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        infoframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                infoframe.dispose();
                new profile();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        infoframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                infoframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        infoframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                infoframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        infoframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                infoframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        infoframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                infoframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}