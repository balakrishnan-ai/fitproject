package view;

import config.DBConnection;
import util.PasswordUtil;
import util.OTPUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginFrame extends JFrame {

    JTextField username;
    JPasswordField password;

    public LoginFrame() {

        setTitle("FitLife Pro - Login");
        setSize(500,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel bg = new JLabel(new ImageIcon("resources/images/bg.jpg"));
        bg.setLayout(new GridBagLayout());
        add(bg);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));
        panel.setBackground(new Color(255,255,255,220));

        panel.add(new JLabel("Username"));
        username = new JTextField();
        panel.add(username);

        panel.add(new JLabel("Password"));
        password = new JPasswordField();
        panel.add(password);

        JButton login = new JButton("Login");
        JButton register = new JButton("Register");

        panel.add(login);
        panel.add(register);

        bg.add(panel);

        login.addActionListener(e -> loginUser());
        register.addActionListener(e -> new RegisterFrame());

        setVisible(true);
    }

    private void loginUser(){
        try{
            Connection con = DBConnection.getConnection();
            String sql="SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, username.getText());
            ps.setString(2, PasswordUtil.hash(new String(password.getPassword())));
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                String otp = OTPUtil.generate();
                JOptionPane.showMessageDialog(this,"Your OTP: "+otp);
                new OTPFrame(rs.getInt("id"), otp);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Invalid Login");
            }

        }catch(Exception e){ e.printStackTrace();}
    }
}