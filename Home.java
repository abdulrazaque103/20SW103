/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author HP
 */
class Home extends JFrame implements ActionListener{
    
     JFrame frame =new JFrame();
    JLabel header,wel,line1,line2;
    JButton student,dev,atten,teacher,fee;
         
    Home(){
                 
       this.setTitle("Home");
       this.setSize(800,700);
       this.setLayout(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.setLocationRelativeTo(null); 
      this.getContentPane().setBackground(Color.BLACK);

       wel=new JLabel("Welcome TO");
       Font fw=new Font("Algerian",Font.BOLD,35);
       wel.setBounds(280,15,230,60);
       wel.setFont(fw);
       wel.setForeground(Color.WHITE);
       
        line1=new JLabel("_________________________________");
        line1.setBounds(280,45,320,20);
         line1.setForeground(Color.WHITE);
       
       header=new JLabel("School Management System");
       Font fh=new Font("Algerian",Font.BOLD,35);
       header.setBounds(120,60,600,60);
       header.setFont(fh);
       header.setForeground(Color.WHITE);       
                      
       line2=new JLabel("_______________________________________________________________________________");
       line2.setBounds(120,90,600,20); 
       line2.setForeground(Color.WHITE);
       
       ImageIcon images=new ImageIcon("add2.jpg");  
       student =new JButton(images);
       student.setBounds(100,180,140,170);
       student.setFocusable(false);
       student.addActionListener(this);
       Cursor cu =new Cursor(Cursor.HAND_CURSOR);
        student.setCursor(cu);
       
         ImageIcon imageat=new ImageIcon("attends.jpg");  
       atten=new JButton(imageat);
       atten.setBounds(100,440,150,150);
       atten.setFocusable(false);
       atten.addActionListener(this);
       Cursor cu4 =new Cursor(Cursor.HAND_CURSOR);
        atten.setCursor(cu4);
       this.add(atten);
       
       ImageIcon imagefr=new ImageIcon("5.png"); 
       fee =new JButton(imagefr);
       fee.setBounds(310,300,156,156);
       fee.setFocusable(false);
       fee.addActionListener(this);
       Cursor c =new Cursor(Cursor.HAND_CURSOR);
        fee.setCursor(c);
       
        ImageIcon imagete=new ImageIcon("add t.jpg"); 
       teacher=new JButton(imagete);
       teacher.setBounds(540,180,156,156);
       teacher.setFocusable(false);
       teacher.addActionListener(this);
       Cursor u =new Cursor(Cursor.HAND_CURSOR);
        teacher.setCursor(u);
        
        ImageIcon imaged=new ImageIcon("developer.jpg");  
       dev=new JButton(imaged);
       dev.setBounds(540,440,150,160);
       dev.setFocusable(false);
       dev.addActionListener(this);
       Cursor cu5 =new Cursor(Cursor.HAND_CURSOR);
        dev.setCursor(cu5);
       this.add(dev);        
    
            this.add(wel);
            this.add(line1);
            this.add(header);
            
            this.add(line2);
            this.add(student);
            this.add(teacher);
            this.add(fee);
            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       //To change body of generated methods, choose Tools | Templates.
        
            
        if(ae.getSource()==student){
            
         try{
            
        this.dispose();
       
        Students stud=new Students();
     
        
         }
         catch(Exception e){}
        
        }
      
             
        if(ae.getSource()==fee){
            
         try{
            
        this.dispose();
       
        FeeCh ch=new FeeCh();
       
        
        }
        catch(Exception e){}
        
        }
        
        if(ae.getSource()==teacher){
            
        try{
            
        this.dispose();
        //this.toBack();
       Teachers teach=new Teachers();
       
        
        }
        catch(Exception e){}
        
        }
        
        if(ae.getSource()==atten){
            
        try{
            
        this.dispose();
        AttendanceStu addtt=new AttendanceStu();
        }
        catch(Exception e){}
        
        }
        
        if(ae.getSource()==dev){
            
        try{
            
        this.dispose();
       
       About abd=new About();
       
        
        }
        catch(Exception e){}
        
        }
    
    }
   
    
    
}
