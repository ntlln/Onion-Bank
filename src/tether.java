import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class tether {
    static JLabel balancescreen;
    public static void main(String[] args) {
        new tether();
    }

    tether(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame tetherframe = new JFrame();
        tetherframe.setSize(390, 815);
        tetherframe.setLayout(null);
        tetherframe.setResizable(false);
        tetherframe.setLocationRelativeTo(null);
        tetherframe.setVisible(true);
        tetherframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tetherframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        tetherframe.add(balancescreen);
        
        JLabel tetherbg = new JLabel();
        tetherbg.setBounds(0,-30,375, 812);
        tetherbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("coin 3.png")));
        tetherframe.add(tetherbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        tetherframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        tetherframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c3receive = new JButton();
        c3receive.setBounds(32, 250, 50, 50);
        c3receive.setContentAreaFilled(false);
        tetherframe.add(c3receive);

        ActionListener c3receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new c3receive();
            }
        }; c3receive.addActionListener(c3receivelisten);

        JButton c3send = new JButton();
        c3send.setBounds(164, 250, 50, 50);
        c3send.setContentAreaFilled(false);
        tetherframe.add(c3send);

        ActionListener c3sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new c3send();
            }
        }; c3send.addActionListener(c3sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        tetherframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        tetherframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        tetherframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                tetherframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c3receive {
    static JLabel balancescreen;
    static JTextField amount;
    static double aamount;
    public static void main(String[] args) {
        new c3receive();
    }

    c3receive(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c3receiveframe = new JFrame();
        c3receiveframe.setSize(390, 815);
        c3receiveframe.setLayout(null);
        c3receiveframe.setResizable(false);
        c3receiveframe.setLocationRelativeTo(null);
        c3receiveframe.setVisible(true);
        c3receiveframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c3receiveframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c3receiveframe.add(balancescreen);

        amount = new JTextField();
        amount.setBounds(35, 580, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c3receiveframe.add(amount);

        JLabel c3receivebg = new JLabel();
        c3receivebg.setBounds(0, -30, 375, 812);
        c3receivebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c3receive.png")));
        c3receiveframe.add(c3receivebg);

        JButton receive = new JButton();
        receive.setBounds(96, 650, 183, 48);
        receive.setOpaque(false);
        receive.setContentAreaFilled(false);
        c3receiveframe.add(receive);

        ActionListener receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                confirm.transfer = aamount;
                home.transacttype[home.transactcount] = "receive";
                home.transactaddress[home.transactcount] = "Your wallet";
                c3receiveframe.dispose();
                new confirm();
            }
        }; receive.addActionListener(receivelisten);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c3receiveframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new tether();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c3receiveframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c3receive = new JButton();
        c3receive.setBounds(32, 250, 50, 50);
        c3receive.setContentAreaFilled(false);
        c3receiveframe.add(c3receive);

        ActionListener c3receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new c3receive();
            }
        }; c3receive.addActionListener(c3receivelisten);

        JButton c3send = new JButton();
        c3send.setBounds(164, 250, 50, 50);
        c3send.setContentAreaFilled(false);
        c3receiveframe.add(c3send);

        ActionListener c3sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new c3send();
            }
        }; c3send.addActionListener(c3sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c3receiveframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c3receiveframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c3receiveframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3receiveframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c3send {
    static JLabel sendfailed, balancescreen;
    static JTextField address, amount;
    static double aamount;
    public static void main(String[] args) {
        new c3send();
    }

    c3send(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c3sendframe = new JFrame();
        c3sendframe.setSize(390, 815);
        c3sendframe.setLayout(null);
        c3sendframe.setResizable(false);
        c3sendframe.setLocationRelativeTo(null);
        c3sendframe.setVisible(true);
        c3sendframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c3sendframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c3sendframe.add(balancescreen);

        sendfailed = new JLabel();
        sendfailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sendfailed.png")));
        sendfailed.setBounds(-9, 381, 391, 424);
        sendfailed.setForeground(Color.WHITE);
        sendfailed.setVisible(false);
        c3sendframe.add(sendfailed);

        address = new JTextField();
        address.setBounds(35, 400, 305, 40);
        address.setOpaque(false);
        address.setBorder(null);
        c3sendframe.add(address);

        amount = new JTextField();
        amount.setBounds(35, 500, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c3sendframe.add(amount);

        JLabel c3sendbg = new JLabel();
        c3sendbg.setBounds(0, -30, 375, 812);
        c3sendbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c3send.png")));
        c3sendframe.add(c3sendbg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c3sendframe.add(clos);

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
        c3sendframe.add(send2);

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
                    c3sendframe.dispose();
                    new confirm();
                }
            }
        }; send2.addActionListener(send2listen);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c3sendframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new tether();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c3sendframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c3receive = new JButton();
        c3receive.setBounds(32, 250, 50, 50);
        c3receive.setContentAreaFilled(false);
        c3sendframe.add(c3receive);

        ActionListener c3receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new c3receive();
            }
        }; c3receive.addActionListener(c3receivelisten);

        JButton c3send = new JButton();
        c3send.setBounds(164, 250, 50, 50);
        c3send.setContentAreaFilled(false);
        c3sendframe.add(c3send);

        ActionListener c3sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new c3send();
            }
        }; c3send.addActionListener(c3sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c3sendframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c3sendframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c3sendframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c3sendframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}