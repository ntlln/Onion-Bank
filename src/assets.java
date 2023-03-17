import javax.swing.*;
import java.awt.event.*;

public class assets {
    public static void main(String[] args) {
        new assets();
    }

    assets(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame assetsframe = new JFrame();
        assetsframe.setSize(390, 815);
        assetsframe.setLayout(null);
        assetsframe.setResizable(false);
        assetsframe.setLocationRelativeTo(null);
        assetsframe.setVisible(true);
        assetsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        assetsframe.setIconImage(frameicon.getImage());

        JLabel assetsbg = new JLabel();
        assetsbg.setBounds(0, -30, 375, 812);
        assetsbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets.png")));
        assetsframe.add(assetsbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        assetsframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new menu();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        assetsframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        assetsframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        assetsframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        assetsframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);

        JButton btcbutton = new JButton();
        btcbutton.setBounds(27, 147, 327, 60);
        btcbutton.setContentAreaFilled(false);
        btcbutton.setOpaque(false);
        assetsframe.add(btcbutton);

        ActionListener btclisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new bitcoin();
            }
        }; btcbutton.addActionListener(btclisten);

        JButton ethbutton = new JButton();
        ethbutton.setBounds(27, 223, 327, 60);
        ethbutton.setContentAreaFilled(false);
        ethbutton.setOpaque(false);
        assetsframe.add(ethbutton);

        ActionListener ethlisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new ethereum();
            }
        }; ethbutton.addActionListener(ethlisten);

        JButton tetherbutton = new JButton();
        tetherbutton.setBounds(27, 297, 327, 60);
        tetherbutton.setContentAreaFilled(false);
        tetherbutton.setOpaque(false);
        assetsframe.add(tetherbutton);

        ActionListener tetherlisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new tether();
            }
        }; tetherbutton.addActionListener(tetherlisten);

        JButton xrpbutton = new JButton();
        xrpbutton.setBounds(27, 372, 327, 60);
        xrpbutton.setContentAreaFilled(false);
        xrpbutton.setOpaque(false);
        assetsframe.add(xrpbutton);

        ActionListener xrplisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new xrp();
            }
        }; xrpbutton.addActionListener(xrplisten);

        JButton dogebutton = new JButton();
        dogebutton.setBounds(27, 447, 327, 60);
        dogebutton.setContentAreaFilled(false);
        dogebutton.setOpaque(false);
        assetsframe.add(dogebutton);

        ActionListener dogelisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                assetsframe.dispose();
                new dogecoin();
            }
        }; dogebutton.addActionListener(dogelisten);
    }
}
