/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Random;

class TeaAddData implements ActionListener{
     JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,back,b3;
    JComboBox c1,c2;
    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 90L) + 10L;
    long first = Math.abs(first4);
    
    Connection connt=null;
    PreparedStatement smen=null;
    
     TeaAddData(){
     
         f = new JFrame("Add Teacher");
        f.getContentPane().setBackground(Color.black);
        f.setLayout(null);
        f.setSize(800,550);
        f.setLocation(400,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); 
        f.setResizable(false);
       
    

         back=new JButton("Back");
        back.setBounds(2,5,70,25);
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor cub =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(cub);
        back.setFocusable(false);
         f.add(back);
         
         
        id8 = new JLabel("New Teacher Details");
        id8.setBounds(230,15,500,50);
        id8.setFont(new Font("Algerian",Font.BOLD,30));
        id8.setForeground(Color.WHITE);
        
        f.add(id8);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,100,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.WHITE);
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(200,100,150,30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,100,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.WHITE);
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,100,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,150,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.WHITE);
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,150,150,30);
        f.add(t3);

        id4= new JLabel("Cast");  
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.WHITE);
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,150,150,30);
        f.add(t4);

        id5= new JLabel("Tea_Id");
        id5.setBounds(50,200,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.WHITE);
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,200,150,30);
        t5.setText("10"+first);
        f.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,200,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.WHITE);
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,200,150,30);
        f.add(t6);

        id7= new JLabel("Salary");
        id7.setBounds(50,250,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.WHITE);
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,250,150,30);
        
        f.add(t7);

        id8= new JLabel("CNIC No");
        id8.setBounds(400,250,130,30);
        id8.setFont(new Font("serif",Font.BOLD,20)); 
        id8.setForeground(Color.WHITE);
        f.add(id8);

        t8=new JTextField();
        t8.setBounds(600,250,150,30);
        f.add(t8);

        id9= new JLabel("Experience");
        id9.setBounds(50,300,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        id9.setForeground(Color.WHITE);
        f.add(id9);

        t9=new JTextField();
        t9.setBounds(200,300,150,30);
        f.add(t9);


        id10= new JLabel("Address");
        id10.setBounds(400,300,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.WHITE);
        f.add(id10);

        t10=new JTextField();
        t10.setBounds(600,300,150,30);
        f.add(t10);

        
        lab=new JLabel("Qualification");
        lab.setBounds(50,350,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        lab.setForeground(Color.WHITE);
        f.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,350,150,30);
        f.add(c1);
        
        lab2=new JLabel("Subject Assigned");
        lab2.setBounds(400,350,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        lab2.setForeground(Color.WHITE);
        f.add(lab2);
        
        String branch[] = {"Chemistry","Science","English","Mathematical","Urdu"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(600,350,150,30);
        f.add(c2);
       
        
        b = new JButton("Submit");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setBounds(240,440,150,40);
         Cursor ub =new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(ub);
        b.setFocusable(false);
        f.add(b);

        b1=new JButton("Reset");   
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(470,440,150,40);
         Cursor cb =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(cb);
        b1.setFocusable(false);
        f.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        
    
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if(ae.getSource()==back){
             
            f.dispose();
            Teachers ter=new Teachers();
             
         }
           
          if(ae.getSource()==b){
            
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String dds = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k =(String)c1.getSelectedItem();
        String kk =(String)c2.getSelectedItem();
       
        
          try{
            
            
           String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
             
            String query="INSERT into add_teacher(Name,Father_name,Age,Cost,Tea_Id,Phone_No,Salary,CNIC_No,Experience,Address,Qualification,Subject_Assigned) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            connt =DriverManager.getConnection(url,uname,password);  
            smen =connt.prepareStatement(query);
            
            smen.setString(1,t1.getText());
            smen.setString(2,t2.getText());
            smen.setString(3,t3.getText());
            smen.setString(4,t4.getText());
            smen.setString(5,t5.getText());
           smen.setString(6,t6.getText());
            smen.setString(7,t7.getText());
            smen.setString(8,t8.getText());
            smen.setString(9,t9.getText());
             smen.setString(10,t10.getText());
            smen.setString(11,(String)c1.getSelectedItem());
            smen.setString(12,(String)c2.getSelectedItem());
            
                smen.executeUpdate();
                JOptionPane.showMessageDialog(null,"Teacher Data Has Been Inserted Successfully");
            }
            catch(Exception ee){
            
                 System.out.println(ee);       
            }
       
       }
           if(ae.getSource()==b1){
              
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t9.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
             t10.setText("");
            
       
       }
    
    }
}
