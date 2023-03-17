import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class home {
    static JLabel balancescreen;
    public static double balance = 1000.0;
    static String balancestr = Double.toString(balance);
    public static int transactcount = 0;
    public static String[] transactaddress = {null,null,null,null,null,null,null,null,null,null};
    public static String[] transacttype = {null,null,null,null,null,null,null,null,null,null};
    public static String[] transactamount = {null,null,null,null,null,null,null,null,null,null};
    public static void main(String[] args) {
        new home();
    }

    home(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame homeframe = new JFrame();
        homeframe.setSize(390, 815);
        homeframe.setLayout(null);
        homeframe.setResizable(false);
        homeframe.setLocationRelativeTo(null);
        homeframe.setVisible(true);
        homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + balance, JLabel.CENTER);
        balancescreen.setBounds(0, 90, homeframe.getWidth(), 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        homeframe.add(balancescreen);

        JLabel homebg = new JLabel();
        homebg.setBounds(0, -30, 375, 812);
        homebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("home.png")));
        homeframe.add(homebg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        homeframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                System.exit(0);
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        homeframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        homeframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        homeframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        homeframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);

        JButton btcbutton = new JButton();
        btcbutton.setBounds(25, 244, 327, 60);
        btcbutton.setContentAreaFilled(false);
        btcbutton.setOpaque(false);
        homeframe.add(btcbutton);

        ActionListener btclisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new bitcoin();
            }
        }; btcbutton.addActionListener(btclisten);

        JButton ethbutton = new JButton();
        ethbutton.setBounds(25, 318, 327, 60);
        ethbutton.setContentAreaFilled(false);
        ethbutton.setOpaque(false);
        homeframe.add(ethbutton);

        ActionListener ethlisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new ethereum();
            }
        }; ethbutton.addActionListener(ethlisten);

        JButton tetherbutton = new JButton();
        tetherbutton.setBounds(25, 392, 327, 60);
        tetherbutton.setContentAreaFilled(false);
        tetherbutton.setOpaque(false);
        homeframe.add(tetherbutton);

        ActionListener tetherlisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new tether();
            }
        }; tetherbutton.addActionListener(tetherlisten);

        JButton xrpbutton = new JButton();
        xrpbutton.setBounds(25, 466, 327, 60);
        xrpbutton.setContentAreaFilled(false);
        xrpbutton.setOpaque(false);
        homeframe.add(xrpbutton);

        ActionListener xrplisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new xrp();
            }
        }; xrpbutton.addActionListener(xrplisten);

        JButton dogebutton = new JButton();
        dogebutton.setBounds(25, 540, 327, 60);
        dogebutton.setContentAreaFilled(false);
        dogebutton.setOpaque(false);
        homeframe.add(dogebutton);

        ActionListener dogelisten = new ActionListener (){
            @Override
            public void actionPerformed (ActionEvent e){
                homeframe.dispose();
                new dogecoin();
            }
        }; dogebutton.addActionListener(dogelisten);
    }
}