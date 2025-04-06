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

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;

class AttendS extends JFrame implements ActionListener{
     
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    JButton back;
     JLabel  dat;
     JTextField fff;
    Connection cont=null;
    PreparedStatement tt=null;
    Date da=new Date();
    
    AttendS (){
    
        setSize(400,450); 
         setLocation(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(false);
        setLayout(null);
       getContentPane().setBackground(Color.BLACK);
   
         setLayout(new FlowLayout());
        c2 = new Choice();
        try{
             
           String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
            String sr="select * from add_students";
            
            cont =DriverManager.getConnection(url,uname,password);  
            tt =cont.prepareStatement(sr);
            
            ResultSet rs = tt.executeQuery();
            
            while(rs.next()){
                c2.add(rs.getString("Roll_No"));    
            }
      
      
       }catch(Exception e){ }
     
        JPanel p01=new JPanel();
   p01.setLayout(new FlowLayout(FlowLayout.LEFT));
   p01.setPreferredSize(new Dimension(400,30));
        back=new JButton("Back");
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor b22 =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(b22);
        back.setFocusable(false);
         p01.add(back);
        p01.setBackground(Color.BLACK);
      add(p01);
        
        JPanel p0=new JPanel();
   p0.setLayout(new FlowLayout(FlowLayout.CENTER));
   p0.setPreferredSize(new Dimension(5000,50));
     JLabel el=new JLabel("Attendance Sheet");
      el.setFont(new Font("Algerian",Font.BOLD,30));
     el.setForeground(Color.WHITE);
        p0.add(el);
        p0.setBackground(Color.BLACK);
      add(p0);
        
   JPanel p1=new JPanel();
   p1.setLayout(new FlowLayout(FlowLayout.CENTER));
   p1.setPreferredSize(new Dimension(5000,50));
   
        JLabel sel=new JLabel("Select Roll Number");
         sel.setForeground(Color.WHITE);
        p1.add(sel);
        p1.setBackground(Color.BLACK);
        sel.setFont(new Font("serif",Font.BOLD,20));
         p1.add(c2);
        add(p1);
       
       
      
      
        
        
       JPanel p2=new JPanel();
   p2.setLayout(new FlowLayout(FlowLayout.CENTER));
   p2.setPreferredSize(new Dimension(5000,60));
        l1 = new JLabel("First Half");
         l1.setForeground(Color.WHITE);
         l1.setFont(new Font("serif",Font.BOLD,20));
         p2.add(l1);
          p2.setBackground(Color.BLACK);
         add(p2);
    
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
        p2.setBackground(Color.BLACK);
         
       p2.add(fh);
        add(p2);
       
        
           
       JPanel p3=new JPanel();
   p3.setLayout(new FlowLayout(FlowLayout.CENTER));
   p3.setPreferredSize(new Dimension(5000,60));
        l2 = new JLabel("Second Half");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.BOLD,20));
        p3.add(l2);
       p3.setBackground(Color.BLACK);
        
       
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
       
         p3.setBackground(Color.BLACK);
       p3.add(sh);
       add(p3);
        
        JPanel p44=new JPanel();
   p44.setLayout(new FlowLayout(FlowLayout.CENTER));
   p44.setPreferredSize(new Dimension(5000,50));
         dat=new JLabel("Date");
         dat.setFont(new Font("serif",Font.BOLD,20));
         dat.setForeground(Color.WHITE);
          fff=new JTextField(15);
     p44.add(dat);
     p44.add(fff);
      p44.setBackground(Color.BLACK);
        add(p44);
           
       JPanel p4=new JPanel();
   p4.setLayout(new FlowLayout(FlowLayout.CENTER));
   p4.setPreferredSize(new Dimension(5000,80));
        b1 =new JButton("Submit");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
         Font fw=new Font("serif",Font.BOLD,15);
         b1.setFont(fw);
         Cursor cb =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(cb);
        b1.setFocusable(false);
        p4.add(b1);
       p4.setBackground(Color.BLACK);
        add(p4);
        
             
       
        b2 = new JButton("Reset");
       b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
         Font fwe=new Font("serif",Font.BOLD,15);
         b2.setFont(fwe);
         Cursor tb =new Cursor(Cursor.HAND_CURSOR);
        b2.setCursor(tb);
        b2.setFocusable(false);
        p4.add(b2);
         p4.setBackground(Color.BLACK);
       add(p4);
        
       
           
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
       
        
        setVisible(true);
      
       
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
         
         dispose();
         AttendanceStu ade=new AttendanceStu();
         
         
         
         }
         Connection cnt=null;
    PreparedStatement sts=null;
         
         String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        //String dt = da.toString();
        String id=c2.getSelectedItem();
        String date=fff.getText();
       
         if(ae.getSource()==b1){
        
        try{
             String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
       
            String qry = "INSERT into attend_s(First_Half,Second_Half,Roll_No,Date) values(?,?,?,?)";
            
            cnt =DriverManager.getConnection(url,uname,password);  
            sts =cnt.prepareStatement(qry);
            
             sts.setString(1,(String)fh.getSelectedItem());
            sts.setString(2,(String)sh.getSelectedItem());
            sts.setString(3,(String)c2.getSelectedItem());
             sts.setString(4,fff.getText());
            
                sts.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            //this.setVisible(false);
            
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
         
    
       
    }
}
