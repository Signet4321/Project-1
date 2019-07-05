
package Project1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Supervisor
      implements ActionListener
{
      private JTextField stdName;
      private JLabel nameOutput;
      private JTextField stdNumber;
      private JLabel numberOutput;
      public JButton Search;
      
    public Supervisor()
    {
        JFrame frame = new JFrame ("Supervisor's Search");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(makePanel());
        frame.pack();
        frame.setVisible(true);

    }
    private JPanel makePanel() {
        JPanel panel = new JPanel();
        panel.add (new JLabel ("Student name"));
        stdName = new JTextField(30);
        panel.add(stdName);
        panel.add (new JLabel ("Student ID"));
        stdNumber = new JTextField(30);
        panel.add(stdNumber);
        Search = new JButton ("Search");
        panel.add (Search);
        Search.addActionListener(this);
        panel.setPreferredSize(new Dimension(400,200));
        panel.setBackground(Color.white);
        return panel;
     
  
     }
          public void actionPerformed (ActionEvent event){

               if (event.getSource() == Search)
             
                     {
//                     NewJFrame3 panel =new NewJFrame3();
//                          frame.setVisible(true);
//                          setDefaultCloseOPeration(JFrame.DISPOSE_ON_CLOSE);
//                         NewJFrame3 newContentPane = new NewJFrame3();
// newContentPane.setOpaque(true); //content panes must be opaque
// frame.setContentPane(newContentPane);
// //Display the window.
// frame.pack();
// frame.setVisible(true);
 NewJFrame3 newJFrame = new NewJFrame3();
 SwingUtilities.invokeLater(new Runnable() {
 @Override
 public void run() {
 createAndShowGUI();
 }

 });
                     
                     }
                     }


                

   
       
        public static void main (String[] args)
         {
          new Supervisor();
         } 

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOPeration(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private void createAndShowGUI() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
}

      



  
