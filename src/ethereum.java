import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class ethereum {
    static JFrame ethereumframe;
    static JLabel ethereumbg, balancescreen;
    public static void main(String[] args) {
        new ethereum();
    }

    ethereum(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        ethereumframe = new JFrame();
        ethereumframe.setSize(390, 815);
        ethereumframe.setLayout(null);
        ethereumframe.setResizable(false);
        ethereumframe.setLocationRelativeTo(null);
        ethereumframe.setVisible(true);
        ethereumframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ethereumframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        ethereumframe.add(balancescreen);

        ethereumbg = new JLabel();
        ethereumbg.setBounds(0,-30,375, 812);
        ethereumbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("coin 2.png")));
        ethereumframe.add(ethereumbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        ethereumframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        ethereumframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c2receive = new JButton();
        c2receive.setBounds(32, 250, 50, 50);
        c2receive.setContentAreaFilled(false);
        ethereumframe.add(c2receive);

        ActionListener c2receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new c2receive();
            }
        }; c2receive.addActionListener(c2receivelisten);

        JButton c2send = new JButton();
        c2send.setBounds(164, 250, 50, 50);
        c2send.setContentAreaFilled(false);
        ethereumframe.add(c2send);

        ActionListener c2sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new c2send();
            }
        }; c2send.addActionListener(c2sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        ethereumframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        ethereumframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        ethereumframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                ethereumframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c2receive {
    static JLabel balancescreen;
    static JTextField amount;
    static double aamount;
    public static void main(String[] args) {
        new c2receive();
    }

    c2receive(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c2receiveframe = new JFrame();
        c2receiveframe.setSize(390, 815);
        c2receiveframe.setLayout(null);
        c2receiveframe.setResizable(false);
        c2receiveframe.setLocationRelativeTo(null);
        c2receiveframe.setVisible(true);
        c2receiveframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c2receiveframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c2receiveframe.add(balancescreen);

        amount = new JTextField();
        amount.setBounds(35, 580, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c2receiveframe.add(amount);

        JLabel c2receivebg = new JLabel();
        c2receivebg.setBounds(0, -30, 375, 812);
        c2receivebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c2receive.png")));
        c2receiveframe.add(c2receivebg);

        JButton receive = new JButton();
        receive.setBounds(96, 650, 183, 48);
        receive.setOpaque(false);
        receive.setContentAreaFilled(false);
        c2receiveframe.add(receive);

        ActionListener receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                confirm.transfer = aamount;
                home.transacttype[home.transactcount] = "receive";
                home.transactaddress[home.transactcount] = "Your wallet";
                c2receiveframe.dispose();
                new confirm();
            }
        }; receive.addActionListener(receivelisten);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c2receiveframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new ethereum();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c2receiveframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c2receive = new JButton();
        c2receive.setBounds(32, 250, 50, 50);
        c2receive.setContentAreaFilled(false);
        c2receiveframe.add(c2receive);

        ActionListener c2receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new c2receive();
            }
        }; c2receive.addActionListener(c2receivelisten);

        JButton c2send = new JButton();
        c2send.setBounds(164, 250, 50, 50);
        c2send.setContentAreaFilled(false);
        c2receiveframe.add(c2send);

        ActionListener c2sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new c2send();
            }
        }; c2send.addActionListener(c2sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c2receiveframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c2receiveframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c2receiveframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2receiveframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c2send {
    static JLabel sendfailed, balancescreen;
    static JTextField address, amount;
    static double aamount;
    public static void main(String[] args) {
        new c2send();
    }

    c2send(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c2sendframe = new JFrame();
        c2sendframe.setSize(390, 815);
        c2sendframe.setLayout(null);
        c2sendframe.setResizable(false);
        c2sendframe.setLocationRelativeTo(null);
        c2sendframe.setVisible(true);
        c2sendframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c2sendframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c2sendframe.add(balancescreen);

        sendfailed = new JLabel();
        sendfailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sendfailed.png")));
        sendfailed.setBounds(-9, 381, 391, 424);
        sendfailed.setForeground(Color.WHITE);
        sendfailed.setVisible(false);
        c2sendframe.add(sendfailed);

        address = new JTextField();
        address.setBounds(35, 400, 305, 40);
        address.setOpaque(false);
        address.setBorder(null);
        c2sendframe.add(address);

        amount = new JTextField();
        amount.setBounds(35, 500, 195, 40);
        amount.setBorder(null);
        amount.setOpaque(false);
        c2sendframe.add(amount);

        JLabel c2sendbg = new JLabel();
        c2sendbg.setBounds(0, -30, 375, 812);
        c2sendbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c2send.png")));
        c2sendframe.add(c2sendbg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c2sendframe.add(clos);

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
        c2sendframe.add(send2);

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
                    c2sendframe.dispose();
                    new confirm();
                }
            }
        }; send2.addActionListener(send2listen);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c2sendframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new ethereum();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c2sendframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c2receive = new JButton();
        c2receive.setBounds(32, 250, 50, 50);
        c2receive.setContentAreaFilled(false);
        c2sendframe.add(c2receive);

        ActionListener c2receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new c2receive();
            }
        }; c2receive.addActionListener(c2receivelisten);

        JButton c2send = new JButton();
        c2send.setBounds(164, 250, 50, 50);
        c2send.setContentAreaFilled(false);
        c2sendframe.add(c2send);

        ActionListener c2sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new c2send();
            }
        }; c2send.addActionListener(c2sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c2sendframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c2sendframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c2sendframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c2sendframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}