import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class xrp {
    static JLabel balancescreen;
    public static void main(String[] args) {
        new xrp();
    }

    xrp(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame xrpframe = new JFrame();
        xrpframe.setSize(390, 815);
        xrpframe.setLayout(null);
        xrpframe.setResizable(false);
        xrpframe.setLocationRelativeTo(null);
        xrpframe.setVisible(true);
        xrpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xrpframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        xrpframe.add(balancescreen);
        
        JLabel xrpbg = new JLabel();
        xrpbg.setBounds(0,-30,375, 812);
        xrpbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("coin 4.png")));
        xrpframe.add(xrpbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        xrpframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        xrpframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c4receive = new JButton();
        c4receive.setBounds(32, 250, 50, 50);
        c4receive.setContentAreaFilled(false);
        xrpframe.add(c4receive);

        ActionListener c4receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new c4receive();
            }
        }; c4receive.addActionListener(c4receivelisten);

        JButton c4send = new JButton();
        c4send.setBounds(164, 250, 50, 50);
        c4send.setContentAreaFilled(false);
        xrpframe.add(c4send);

        ActionListener c4sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new c4send();
            }
        }; c4send.addActionListener(c4sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        xrpframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        xrpframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        xrpframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                xrpframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c4receive {
    static JLabel balancescreen;
    static JTextField amount;
    static double aamount;
    public static void main(String[] args) {
        new c4receive();
    }

    c4receive(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c4receiveframe = new JFrame();
        c4receiveframe.setSize(390, 815);
        c4receiveframe.setLayout(null);
        c4receiveframe.setResizable(false);
        c4receiveframe.setLocationRelativeTo(null);
        c4receiveframe.setVisible(true);
        c4receiveframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c4receiveframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c4receiveframe.add(balancescreen);

        amount = new JTextField();
        amount.setBounds(35, 580, 195, 40);
        amount.setBorder(null);
        amount.setOpaque(false);
        c4receiveframe.add(amount);

        JLabel c4receivebg = new JLabel();
        c4receivebg.setBounds(0, -30, 375, 812);
        c4receivebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c4receive.png")));
        c4receiveframe.add(c4receivebg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c4receiveframe.add(clos);

        JButton receive = new JButton();
        receive.setBounds(96, 650, 183, 48);
        receive.setOpaque(false);
        receive.setContentAreaFilled(false);
        c4receiveframe.add(receive);

        ActionListener receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                confirm.transfer = aamount;
                home.transacttype[home.transactcount] = "receive";
                home.transactaddress[home.transactcount] = "Your wallet";
                c4receiveframe.dispose();
                new confirm();
            }
        }; receive.addActionListener(receivelisten);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c4receiveframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new xrp();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c4receiveframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c4receive = new JButton();
        c4receive.setBounds(32, 250, 50, 50);
        c4receive.setContentAreaFilled(false);
        c4receiveframe.add(c4receive);

        ActionListener c4receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new c4receive();
            }
        }; c4receive.addActionListener(c4receivelisten);

        JButton c4send = new JButton();
        c4send.setBounds(164, 250, 50, 50);
        c4send.setContentAreaFilled(false);
        c4receiveframe.add(c4send);

        ActionListener c4sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new c4send();
            }
        }; c4send.addActionListener(c4sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c4receiveframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c4receiveframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c4receiveframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4receiveframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c4send {
    static JLabel sendfailed, balancescreen;
    static JTextField address, amount;
    static double aamount;
    public static void main(String[] args) {
        new c4send();
    }

    c4send(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c4sendframe = new JFrame();
        c4sendframe.setSize(390, 815);
        c4sendframe.setLayout(null);
        c4sendframe.setResizable(false);
        c4sendframe.setLocationRelativeTo(null);
        c4sendframe.setVisible(true);
        c4sendframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c4sendframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c4sendframe.add(balancescreen);

        sendfailed = new JLabel();
        sendfailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sendfailed.png")));
        sendfailed.setBounds(-9, 381, 391, 424);
        sendfailed.setForeground(Color.WHITE);
        sendfailed.setVisible(false);
        c4sendframe.add(sendfailed);

        address = new JTextField();
        address.setBounds(35, 400, 305, 40);
        address.setBorder(null);
        address.setOpaque(false);
        c4sendframe.add(address);

        amount = new JTextField();
        amount.setBounds(35, 500, 195, 40);
        amount.setBorder(null);
        amount.setOpaque(false);
        c4sendframe.add(amount);

        JLabel c4sendbg = new JLabel();
        c4sendbg.setBounds(0, -30, 375, 812);
        c4sendbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c4send.png")));
        c4sendframe.add(c4sendbg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c4sendframe.add(clos);

        ActionListener closlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                address.setText(null);
                amount.setText(null);
                sendfailed.setVisible(false);
                clos.setVisible(false);
            }
        }; clos.addActionListener(closlisten);

        JButton send2 = new JButton();
        send2.setBounds(96, 650, 183, 48);
        send2.setOpaque(false);
        send2.setContentAreaFilled(false);
        c4sendframe.add(send2);

        ActionListener send2listen = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                if(home.balance < aamount){
                    sendfailed.setVisible(true);
                    clos.setVisible(true);
                }
                else{
                    aamount = aamount * -1;
                    confirm.transfer = aamount;
                    home.transacttype[home.transactcount] = "send";
                    home.transactaddress[home.transactcount] = address.getText();
                    c4sendframe.dispose();
                    new confirm();
                }
            }
        }; send2.addActionListener(send2listen);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c4sendframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new xrp();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c4sendframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c4receive = new JButton();
        c4receive.setBounds(32, 250, 50, 50);
        c4receive.setContentAreaFilled(false);
        c4sendframe.add(c4receive);

        ActionListener c4receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new c4receive();
            }
        }; c4receive.addActionListener(c4receivelisten);

        JButton c4send = new JButton();
        c4send.setBounds(164, 250, 50, 50);
        c4send.setContentAreaFilled(false);
        c4sendframe.add(c4send);

        ActionListener c4sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new c4send();
            }
        }; c4send.addActionListener(c4sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c4sendframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c4sendframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c4sendframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c4sendframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}