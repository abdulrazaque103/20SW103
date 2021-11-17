/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
class Students implements ActionListener{
    
    JFrame frame =new JFrame();
    JLabel header,lin,wel,line1,line2;
   JButton add,search,edit,back;
    
    Students(){
    
           frame.setTitle("Student");
       frame.setSize(600,600);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.getContentPane().setBackground(Color.BLACK);
       
       
       wel=new JLabel("Student's Module");
       Font fw=new Font("Algerian",Font.BOLD,30);
       wel.setBounds(140,30,330,60);
       wel.setFont(fw);
       wel.setForeground(Color.WHITE);
       
       lin=new JLabel("____________________________________________");
       lin.setBounds(140,60,330,20);
       lin.setForeground(Color.WHITE);
       frame.add(lin);
        
       back =new JButton("Back");
       back.setBounds(2,5,70,25);
       back.setFocusable(false);
      back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
       Cursor cu =new Cursor(Cursor.HAND_CURSOR);
       back.setCursor(cu);
       back.addActionListener(this);
       
       ImageIcon imagead=new ImageIcon("add.jpg");
       add =new JButton(imagead);
       add.setBounds(80,150,150,150);
       add.setFocusable(false);
       Cursor c =new Cursor(Cursor.HAND_CURSOR);
       add.setCursor(c);
       add.addActionListener(this);
       
       ImageIcon imageu=new ImageIcon("p.jpg");
       edit=new JButton(imageu);
       edit.setBounds(330,150,160,150);
       edit.setFocusable(false);
       Cursor u =new Cursor(Cursor.HAND_CURSOR);
       edit.setCursor(u);
       edit.addActionListener(this);
        
       ImageIcon imagep=new ImageIcon("sd.jpg");
       search=new JButton(imagep);
       search.setBounds(200,350,190,190);
       search.setFocusable(false);
       Cursor cu1 =new Cursor(Cursor.HAND_CURSOR);
       search.setCursor(cu1);
       search.addActionListener(this);
    
           
            frame.add(wel);
            frame.add(add);
            frame.add(search);
            frame.add(edit);
            frame.add(back);
            frame.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
         //To change body of generated methods, choose Tools | Templates.
          if(ae.getSource()==back){
             
           frame.dispose();
            Home hom=new Home();
             
         }
         
        if(ae.getSource()==add){
             
          try{
            
          frame.dispose();
       
         AddDataS adds=new AddDataS();
        
          }
          catch(Exception e){}
        
        } 
         
         if(ae.getSource()==edit){
             
             frame.dispose();
             UpdateDataS adds=new UpdateDataS();

         }
          
         else if(ae.getSource()==search){
             
             frame.dispose();
            SearchDS button=new SearchDS();

         }
    
    }

   
}
