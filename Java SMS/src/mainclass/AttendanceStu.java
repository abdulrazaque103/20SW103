/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

class AttendanceStu implements ActionListener{
    
     JFrame frame =new JFrame();
    JLabel header,lin,wel,line1,line2;
    JButton add,search,edit,back;

AttendanceStu(){    
     frame.setTitle("Student");
       frame.setSize(500,500);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.getContentPane().setBackground(Color.BLACK);
       
        wel=new JLabel("Attendance Of Student's ");
       Font fw=new Font("Algerian",Font.BOLD,30);
       wel.setBounds(40,40,500,60);
       wel.setFont(fw);
       wel.setForeground(Color.WHITE);
       frame.add(wel);
       
       lin=new JLabel("_____________________________________________________________");
       lin.setBounds(40,75,450,20);
       lin.setForeground(Color.WHITE);
       frame.add(lin);
       
         back =new JButton("Back");
       back.setBounds(2,5,70,25);
       back.setFocusable(false);
       //back.setOpaque(false);
       back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
       Cursor cu =new Cursor(Cursor.HAND_CURSOR);
       back.setCursor(cu);
       back.addActionListener(this);
       frame.add(back);
       
        ImageIcon imagead=new ImageIcon("Sattendance.png");
       add =new JButton(imagead);
       add.setBounds(70,150,150,180);
       add.setFocusable(false);
       Cursor c =new Cursor(Cursor.HAND_CURSOR);
       add.setCursor(c);
       add.addActionListener(this);
       frame.add(add);
       
        ImageIcon imageu=new ImageIcon("Sshow.png");
       edit=new JButton(imageu);
       edit.setBounds(280,150,160,180);
       edit.setFocusable(false);
       Cursor u =new Cursor(Cursor.HAND_CURSOR);
       edit.setCursor(u);
       edit.addActionListener(this);
       frame.add(edit);
    
    frame.setVisible(true);
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
             
             frame.dispose();
          Home me=new Home();
             
         }
        
         if(ae.getSource()==add){
             
                 
        try{
            
        frame.dispose();
       
        AttendS ad=new AttendS();
       
        
        }
        catch(Exception e){}
        
        }
         
            
         if(ae.getSource()==edit){
             
             frame.dispose();
            ShowAttendStu adds=new ShowAttendStu();

         }
            
    }

}
