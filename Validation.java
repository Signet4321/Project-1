
package Project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
    
public class Validation implements ActionListener
{
      private JTextField sidNumber;
      private JTextField dateNumber;
      private JButton registerButton;
      

    public Validation()
    {
        JFrame frame = new JFrame ("Student Attendance Register");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(makePanel());
        frame.pack();
        frame.setVisible(true);

    }
    private JPanel makePanel() {
        JPanel panel = new JPanel();
       
        panel.add (new JButton ("Enter Your Student ID"));
        sidNumber = new JTextField(8);
        panel.add(sidNumber);
        
        panel.add (new JButton ("Enter The Day"));
        dateNumber = new JTextField(8);
        panel.add(dateNumber);
        
        
       
        registerButton = new JButton ("REGISTER:");
       
        panel.add (registerButton);
        
        registerButton.addActionListener(this);
        
        panel.setPreferredSize(new Dimension(300,100));
        panel.setBackground(Color.white);
        return panel;
     }
 public static void main (String[] args)
                        {
                         new Validation();

                        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}