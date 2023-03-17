import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.awt.event.*;

public class confirm {
    static JLabel receivesuccess, receivefailed, balancescreen, amount;
    public static double transfer;
    static JPasswordField pinfield;
    static JButton[] pinbuttons;
    static JButton backspace;
    static String limit = "000000", u1pin = "000000";
    static int attempt = 3;

    public static void main(String[] args) {
        new confirm();
    }

    confirm() {

        ImageIcon frameicon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));

        JFrame confirmframe = new JFrame();
        confirmframe.setSize(390, 815);
        confirmframe.setLayout(null);
        confirmframe.setResizable(false);
        confirmframe.setLocationRelativeTo(null);
        confirmframe.setVisible(true);
        confirmframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmframe.setIconImage(frameicon.getImage());

        balancescreen = new JLabel("$" + home.balance, JLabel.CENTER);
        balancescreen.setBounds(95, 100, 200, 40);
        balancescreen.setFont(new FontUIResource("Titillium Web",0, 36));
        balancescreen.setForeground(Color.WHITE);
        confirmframe.add(balancescreen);

        receivesuccess = new JLabel();
        receivesuccess.setIcon(new ImageIcon(getClass().getClassLoader().getResource("receivesuccess.png")));
        receivesuccess.setBounds(-9, 381, 391, 424);
        receivesuccess.setForeground(Color.WHITE);
        receivesuccess.setVisible(false);
        confirmframe.add(receivesuccess);

        receivefailed = new JLabel();
        receivefailed.setIcon(new ImageIcon(getClass().getClassLoader().getResource("receivefailed.png")));
        receivefailed.setBounds(-9, 381, 391, 424);
        receivefailed.setForeground(Color.WHITE);
        receivefailed.setVisible(false);
        confirmframe.add(receivefailed);

        amount = new JLabel("$" + transfer, SwingConstants.CENTER);
        amount.setBounds(35, 254, 195, 40);
        amount.setBorder(null);
        amount.setOpaque(false);
        confirmframe.add(amount);

        JButton back = new JButton();
        back.setBounds(10, 28, 40, 40);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        confirmframe.add(back);

        ActionListener backlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                confirmframe.dispose();
                new home();
            }
        }; back.addActionListener(backlisten);

        JButton menu = new JButton();
        menu.setBounds(318, 28, 40, 40);
        menu.setContentAreaFilled(false);
        menu.setBorder(null);
        confirmframe.add(menu);

        ActionListener menulisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                confirmframe.dispose();
                new menu();
            }
        }; menu.addActionListener(menulisten);

        JButton clos = new JButton();
        clos.setBounds(96, 650, 183, 48);
        clos.setOpaque(false);
        clos.setContentAreaFilled(false);
        clos.setVisible(false);
        confirmframe.add(clos);

        ActionListener closlisten = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                confirmframe.dispose();
                new home();
            }
        }; clos.addActionListener(closlisten);

        pinfield = new JPasswordField();
        pinfield.setBounds(63, 380, 250, 30);
        pinfield.setHorizontalAlignment(JPasswordField.CENTER);
        pinfield.setFont(new FontUIResource("Arial", Font.BOLD, 40));
        pinfield.setBorder(null);
        pinfield.setOpaque(false);
        pinfield.setEditable(false);
        confirmframe.add(pinfield);

        JLabel status = new JLabel("", JLabel.CENTER);
        status.setBounds(63, 415, 250, 30);
        status.setFont(new FontUIResource("Arial", Font.BOLD|Font.ITALIC, 15));
        confirmframe.add(status);

        JLabel confirmbg = new JLabel();
        confirmbg.setIcon(new ImageIcon(getClass().getClassLoader().getResource("confirm.png")));
        confirmbg.setBounds(0, -25, 375, 812);
        confirmframe.add(confirmbg);

        pinbuttons = new JButton[11];
        pinbuttons[0] = new JButton("1");
        pinbuttons[0].setBounds(84, 457, 50, 50);
        pinbuttons[0].setContentAreaFilled(false);
        pinbuttons[0].setBorder(null);

        pinbuttons[1] = new JButton("2");
        pinbuttons[1].setBounds(163, 457, 50, 50);
        pinbuttons[1].setContentAreaFilled(false);
        pinbuttons[1].setBorder(null);

        pinbuttons[2] = new JButton("3");
        pinbuttons[2].setBounds(242, 457, 50, 50);
        pinbuttons[2].setContentAreaFilled(false);
        pinbuttons[2].setBorder(null);

        pinbuttons[3] = new JButton("4");
        pinbuttons[3].setBounds(84, 524, 50, 50);
        pinbuttons[3].setContentAreaFilled(false);
        pinbuttons[3].setBorder(null);

        pinbuttons[4] = new JButton("5");
        pinbuttons[4].setBounds(163, 524, 50, 50);
        pinbuttons[4].setContentAreaFilled(false);
        pinbuttons[4].setBorder(null);

        pinbuttons[5] = new JButton("6");
        pinbuttons[5].setBounds(242, 524, 50, 50);
        pinbuttons[5].setContentAreaFilled(false);
        pinbuttons[5].setBorder(null);

        pinbuttons[6] = new JButton("7");
        pinbuttons[6].setBounds(84, 592, 50, 50);
        pinbuttons[6].setContentAreaFilled(false);
        pinbuttons[6].setBorder(null);

        pinbuttons[7] = new JButton("8");
        pinbuttons[7].setBounds(163, 592, 50, 50);
        pinbuttons[7].setContentAreaFilled(false);
        pinbuttons[7].setBorder(null);

        pinbuttons[8] = new JButton("9");
        pinbuttons[8].setBounds(242, 592, 50, 50);
        pinbuttons[8].setContentAreaFilled(false);
        pinbuttons[8].setBorder(null);

        pinbuttons[9] = new JButton("0");
        pinbuttons[9].setBounds(163, 657, 50, 50);
        pinbuttons[9].setContentAreaFilled(false);
        pinbuttons[9].setBorder(null);

        pinbuttons[10] = new JButton();
        pinbuttons[10].setBounds(0, 0, 0, 0);

        for (int i = 0; i < 10; i++) {
        pinbuttons[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pinfield.setText(String.valueOf(pinfield.getPassword()) + ((JButton) e.getSource()).getText());
                    if (String.valueOf(pinfield.getPassword()).length() == limit.length()) {
                        if (String.valueOf(pinfield.getPassword()).equals(u1pin)) {
                            home.balance += transfer;
                            home.transactamount[home.transactcount] = amount.getText();
                            home.transactcount++;
                            amount.setText(null);
                            balancescreen.setText("$" + home.balance);
                            receivesuccess.setVisible(true);
                            clos.setVisible(true);
                            balancescreen.repaint();
                        } else {
                            attempt --;

                            if (attempt > 0) {
                                status.setText("Pin is Incorrect! "+attempt+" Remaining");
                                pinfield.setText("");
                            } else if (attempt == 0){
                                status.setText("Out of Attempts, Wait for Awhile. :(");
                                pinfield.setText("");
                                for (int j = 0; j < 10; j++) {
                                    pinbuttons[j].setEnabled(false);
                                    backspace.setEnabled(false);
                                }
                                Timer timer = new Timer(10000, new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        for (int j = 0; j < 10; j++) {
                                            pinbuttons[j].setEnabled(true);
                                            backspace.setEnabled(true);
                                        }
                                        status.setText("");
                                        attempt = 3;
                                    }
                                });
                                timer.setRepeats(false);
                                timer.start();
                            }
                        }
                    }
                }
            }); confirmframe.add(pinbuttons[i]);
        }
        backspace = new JButton();
        backspace.setBounds(242, 657, 50, 50);
        backspace.setContentAreaFilled(false);
        backspace.setBorder(null);
        confirmframe.add(backspace);

        ActionListener backspacelisten = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pinfield.setText(String.valueOf(pinfield.getPassword()).substring(0, String.valueOf(pinfield.getPassword()).length() -1));
            }
        }; backspace.addActionListener(backspacelisten);
    }
}