import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class bitcoin {
    static JLabel bitcoinbg, balancescreen;
    public static void main(String[] args) {
        new bitcoin();
    }

    bitcoin(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame bitcoinframe = new JFrame();
        bitcoinframe.setSize(390, 815);
        bitcoinframe.setLayout(null);
        bitcoinframe.setResizable(false);
        bitcoinframe.setLocationRelativeTo(null);
        bitcoinframe.setVisible(true);
        bitcoinframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bitcoinframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(0, 90, bitcoinframe.getWidth(), 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        bitcoinframe.add(balancescreen);

        bitcoinbg = new JLabel();
        bitcoinbg.setBounds(0,-30,375, 812);
        bitcoinbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("coin 1.png")));
        bitcoinframe.add(bitcoinbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        bitcoinframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        bitcoinframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c1receive = new JButton();
        c1receive.setBounds(32, 250, 50, 50);
        c1receive.setContentAreaFilled(false);
        bitcoinframe.add(c1receive);

        ActionListener c1receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new c1receive();
            }
        }; c1receive.addActionListener(c1receivelisten);

        JButton c1send = new JButton();
        c1send.setBounds(164, 250, 50, 50);
        c1send.setContentAreaFilled(false);
        bitcoinframe.add(c1send);

        ActionListener c1sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new c1send();
            }
        }; c1send.addActionListener(c1sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        bitcoinframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        bitcoinframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.setVisible(false);
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        bitcoinframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                bitcoinframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c1receive {
    static JLabel balancescreen;
    static JTextField amount;
    static double aamount;
    public static void main(String[] args) {
        new c1receive();
    }

    c1receive(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c1receiveframe = new JFrame();
        c1receiveframe.setSize(390, 815);
        c1receiveframe.setLayout(null);
        c1receiveframe.setResizable(false);
        c1receiveframe.setLocationRelativeTo(null);
        c1receiveframe.setVisible(true);
        c1receiveframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1receiveframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c1receiveframe.add(balancescreen);

        amount = new JTextField();
        amount.setBounds(35, 580, 195, 40);
        amount.setBorder(null);
        c1receiveframe.add(amount);

        JLabel c1receivebg = new JLabel();
        c1receivebg.setBounds(0, -30, 375, 812);
        c1receivebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c1receive.png")));
        c1receiveframe.add(c1receivebg);

        JButton receive = new JButton();
        receive.setBounds(96, 650, 183, 48);
        receive.setOpaque(false);
        receive.setContentAreaFilled(false);
        c1receiveframe.add(receive);

        ActionListener receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                confirm.transfer = aamount;
                home.transacttype[home.transactcount] = "receive";
                home.transactaddress[home.transactcount] = "Your wallet";
                c1receiveframe.dispose();
                new confirm();
            }
        }; receive.addActionListener(receivelisten);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c1receiveframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new bitcoin();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c1receiveframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c1receive = new JButton();
        c1receive.setBounds(32, 250, 50, 50);
        c1receive.setContentAreaFilled(false);
        c1receiveframe.add(c1receive);

        ActionListener c1receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new c1receive();
            }
        }; c1receive.addActionListener(c1receivelisten);

        JButton c1send = new JButton();
        c1send.setBounds(164, 250, 50, 50);
        c1send.setContentAreaFilled(false);
        c1receiveframe.add(c1send);

        ActionListener c1sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new c1send();
            }
        }; c1send.addActionListener(c1sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c1receiveframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c1receiveframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c1receiveframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1receiveframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c1send {
    static JLabel sendfailed, balancescreen;
    static JTextField address, amount;
    static double aamount;
    public static void main(String[] args) {
        new c1send();
    }

    c1send(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c1sendframe = new JFrame();
        c1sendframe.setSize(390, 815);
        c1sendframe.setLayout(null);
        c1sendframe.setResizable(false);
        c1sendframe.setLocationRelativeTo(null);
        c1sendframe.setVisible(true);
        c1sendframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1sendframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c1sendframe.add(balancescreen);

        sendfailed = new JLabel();
        sendfailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sendfailed.png")));
        sendfailed.setBounds(-9, 381, 391, 424);
        sendfailed.setForeground(Color.WHITE);
        sendfailed.setVisible(false);
        c1sendframe.add(sendfailed);

        address = new JTextField();
        address.setBounds(35, 400, 305, 40);
        address.setOpaque(false);
        address.setBorder(null);
        c1sendframe.add(address);

        amount = new JTextField();
        amount.setBounds(35, 500, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c1sendframe.add(amount);

        JLabel c1sendbg = new JLabel();
        c1sendbg.setBounds(0, -30, 375, 812);
        c1sendbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c1send.png")));
        c1sendframe.add(c1sendbg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c1sendframe.add(clos);

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
        c1sendframe.add(send2);

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
                    c1sendframe.dispose();
                    new confirm();
                }
            }
        }; send2.addActionListener(send2listen);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c1sendframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new bitcoin();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c1sendframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c1receive = new JButton();
        c1receive.setBounds(32, 250, 50, 50);
        c1receive.setContentAreaFilled(false);
        c1sendframe.add(c1receive);

        ActionListener c1receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new c1receive();
            }
        }; c1receive.addActionListener(c1receivelisten);

        JButton c1send = new JButton();
        c1send.setBounds(164, 250, 50, 50);
        c1send.setContentAreaFilled(false);
        c1sendframe.add(c1send);

        ActionListener c1sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new c1send();
            }
        }; c1send.addActionListener(c1sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c1sendframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c1sendframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c1sendframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c1sendframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}