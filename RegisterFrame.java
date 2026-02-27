package view;

import config.DBConnection;
import util.PasswordUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class RegisterFrame extends JFrame {

    JTextField name, username, email, age, height, weight;
    JPasswordField password;

    public RegisterFrame(){

        setTitle("Register");
        setSize(400,500);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9,2,10,10));

        add(new JLabel("Name"));
        name=new JTextField(); add(name);

        add(new JLabel("Username"));
        username=new JTextField(); add(username);

        add(new JLabel("Password"));
        password=new JPasswordField(); add(password);

        add(new JLabel("Email"));
        email=new JTextField(); add(email);

        add(new JLabel("Age"));
        age=new JTextField(); add(age);

        add(new JLabel("Height (m)"));
        height=new JTextField(); add(height);

        add(new JLabel("Weight (kg)"));
        weight=new JTextField(); add(weight);

        JButton btn=new JButton("Register");
        add(btn);

        btn.addActionListener(e->registerUser());

        setVisible(true);
    }

    private void registerUser(){
        try{
            Connection con= DBConnection.getConnection();
            String sql="INSERT INTO users(name,username,password,email,age,height,weight) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name.getText());
            ps.setString(2,username.getText());
            ps.setString(3,PasswordUtil.hash(new String(password.getPassword())));
            ps.setString(4,email.getText());
            ps.setInt(5,Integer.parseInt(age.getText()));
            ps.setDouble(6,Double.parseDouble(height.getText()));
            ps.setDouble(7,Double.parseDouble(weight.getText()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,"Registered Successfully!");
            dispose();

        }catch(Exception e){ e.printStackTrace();}
    }
}