package com.saniazt.itproger.RealProjGraphics;

import javax.swing.*; //позволяет создать приложение
import java.awt.*; //позволяет создать обьекты в приложении
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JTextField name_field,email_field;
    private JRadioButton male, female;
    private JCheckBox check;
    private JPasswordField password;

    public ContactForm(){
        super("ContactForm");
        super.setBounds(200,100,300,230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(6,2,1,10)); //система рассположения обьектов

        JLabel name = new JLabel("Enter your name:");
        name_field = new JTextField("",1);
        JLabel email = new JLabel("Enter your email:");
        email_field = new JTextField("@",1);
        JLabel pss1 = new JLabel("Enter yor password");
        password = new JPasswordField("");


        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);
        container.add(pss1);
        container.add(password);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        check = new JCheckBox("Agree?",false);
        JButton send_button = new JButton("Send");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();

            String isMale = "Male";
            if(!male.isSelected())
                isMale = "Female";

            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null,"Your email: "+ email+"\nYour gender: "+isMale+"\nAre you agree?"+checkBox, "Hello, "+name,JOptionPane.PLAIN_MESSAGE);
        }
    }

}
