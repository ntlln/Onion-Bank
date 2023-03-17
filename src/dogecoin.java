import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class dogecoin {
    static JLabel balancescreen;
    public static void main(String[] args) {
        new dogecoin();
    }

    dogecoin(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame dogecoinframe = new JFrame();
        dogecoinframe.setSize(390, 815);
        dogecoinframe.setLayout(null);
        dogecoinframe.setResizable(false);
        dogecoinframe.setLocationRelativeTo(null);
        dogecoinframe.setVisible(true);
        dogecoinframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dogecoinframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        dogecoinframe.add(balancescreen);

        JLabel dogecoinbg = new JLabel();
        dogecoinbg.setBounds(0,-30,375, 812);
        dogecoinbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("coin 5.png")));
        dogecoinframe.add(dogecoinbg);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        dogecoinframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        dogecoinframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c5receive = new JButton();
        c5receive.setBounds(32, 250, 50, 50);
        c5receive.setContentAreaFilled(false);
        dogecoinframe.add(c5receive);

        ActionListener c5receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new c5receive();
            }
        }; c5receive.addActionListener(c5receivelisten);

        JButton c5send = new JButton();
        c5send.setBounds(164, 250, 50, 50);
        c5send.setContentAreaFilled(false);
        dogecoinframe.add(c5send);

        ActionListener c5sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new c5send();
            }
        }; c5send.addActionListener(c5sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        dogecoinframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        dogecoinframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        dogecoinframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                dogecoinframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c5receive {
    static JLabel balancescreen;
    static JTextField amount;
    static double aamount;
    public static void main(String[] args) {
        new c5receive();
    }

    c5receive(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c5receiveframe = new JFrame();
        c5receiveframe.setSize(390, 815);
        c5receiveframe.setLayout(null);
        c5receiveframe.setResizable(false);
        c5receiveframe.setLocationRelativeTo(null);
        c5receiveframe.setVisible(true);
        c5receiveframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c5receiveframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c5receiveframe.add(balancescreen);

        amount = new JTextField();
        amount.setBounds(35, 580, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c5receiveframe.add(amount);

        JLabel c5receivebg = new JLabel();
        c5receivebg.setBounds(0, -30, 375, 812);
        c5receivebg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c5receive.png")));
        c5receiveframe.add(c5receivebg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c5receiveframe.add(clos);

        JButton receive = new JButton();
        receive.setBounds(96, 650, 183, 48);
        receive.setOpaque(false);
        receive.setContentAreaFilled(false);
        c5receiveframe.add(receive);

        ActionListener receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                aamount = Double.parseDouble(amount.getText());
                confirm.transfer = aamount;
                home.transacttype[home.transactcount] = "receive";
                home.transactaddress[home.transactcount] = "Your wallet";
                c5receiveframe.dispose();
                new confirm();
            }
        }; receive.addActionListener(receivelisten);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c5receiveframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new dogecoin();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c5receiveframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c5receive = new JButton();
        c5receive.setBounds(32, 250, 50, 50);
        c5receive.setContentAreaFilled(false);
        c5receiveframe.add(c5receive);

        ActionListener c5receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new c5receive();
            }
        }; c5receive.addActionListener(c5receivelisten);

        JButton c5send = new JButton();
        c5send.setBounds(164, 250, 50, 50);
        c5send.setContentAreaFilled(false);
        c5receiveframe.add(c5send);

        ActionListener c5sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new c5send();
            }
        }; c5send.addActionListener(c5sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c5receiveframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c5receiveframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c5receiveframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5receiveframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}

class c5send {
    static JLabel sendfailed, balancescreen;
    static JTextField address, amount;
    static double aamount;
    public static void main(String[] args) {
        new c5send();
    }

    c5send(){

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame c5sendframe = new JFrame();
        c5sendframe.setSize(390, 815);
        c5sendframe.setLayout(null);
        c5sendframe.setResizable(false);
        c5sendframe.setLocationRelativeTo(null);
        c5sendframe.setVisible(true);
        c5sendframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c5sendframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        c5sendframe.add(balancescreen);

        sendfailed = new JLabel();
        sendfailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("sendfailed.png")));
        sendfailed.setBounds(-9, 381, 391, 424);
        sendfailed.setForeground(Color.WHITE);
        sendfailed.setVisible(false);
        c5sendframe.add(sendfailed);

        address = new JTextField();
        address.setBounds(35, 400, 305, 40);
        address.setOpaque(false);
        address.setBorder(null);
        c5sendframe.add(address);

        amount = new JTextField();
        amount.setBounds(35, 500, 195, 40);
        amount.setOpaque(false);
        amount.setBorder(null);
        c5sendframe.add(amount);

        JLabel c5sendbg = new JLabel();
        c5sendbg.setBounds(0, -30, 375, 812);
        c5sendbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("c5send.png")));
        c5sendframe.add(c5sendbg);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        c5sendframe.add(clos);

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
        c5sendframe.add(send2);

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
                    c5sendframe.dispose();
                    new confirm();
                }
            }
        }; send2.addActionListener(send2listen);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        c5sendframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new dogecoin();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        c5sendframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton c5receive = new JButton();
        c5receive.setBounds(32, 250, 50, 50);
        c5receive.setContentAreaFilled(false);
        c5sendframe.add(c5receive);

        ActionListener c5receivelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new c5receive();
            }
        }; c5receive.addActionListener(c5receivelisten);

        JButton c5send = new JButton();
        c5send.setBounds(164, 250, 50, 50);
        c5send.setContentAreaFilled(false);
        c5sendframe.add(c5send);

        ActionListener c5sendlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new c5send();
            }
        }; c5send.addActionListener(c5sendlisten);

        JButton home = new JButton();
        home.setBounds(63, 728, 40, 40);
        home.setContentAreaFilled(false);
        c5sendframe.add(home);

        ActionListener homelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new home();
            }
        }; home.addActionListener(homelisten);

        JButton transaction = new JButton();
        transaction.setBounds(166, 728, 40, 40);
        transaction.setContentAreaFilled(false);
        c5sendframe.add(transaction);

        ActionListener transactionlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new transactions();
            }
        }; transaction.addActionListener(transactionlisten);

        JButton profile = new JButton();
        profile.setBounds(271, 728, 40, 40);
        profile.setContentAreaFilled(false);
        c5sendframe.add(profile);

        ActionListener profilelisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                c5sendframe.dispose();
                new profile();
            }
        }; profile.addActionListener(profilelisten);
    }
}
