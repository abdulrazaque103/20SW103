/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author HP
 */
class TeaSearchD extends JFrame implements ActionListener{
     JLabel l1,l2,id8,jk,l3;
    JTable t1;
    JButton b1,b2,back,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Cast","Tea_Id","Phone_No","Salary","CNIC_no", "Experience", "Address","Qualification","Subject_Assigned"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    
    Connection not=null;
    PreparedStatement men=null;
     
    TeaSearchD(){
     super("Teacher Details");
       getContentPane().setBackground(Color.black);
        setSize(1060,580);
        setLocation(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(null);
        setResizable(false);
        
         back=new JButton("Back");
        back.setBounds(2,5,70,25);
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor yb =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(yb);
        back.setFocusable(false);
        //back.setOpaque(false);
        add(back);
        
         
        id8 = new JLabel("Teacher's Record");
        id8.setBounds(380,5,500,50);
        id8.setFont(new Font("Algerian",Font.BOLD,30));
        id8.setForeground(Color.WHITE);
        add(id8);
       
        
        jk = new JLabel("Enter teacher id to delete Teacher : ");
        jk.setBounds(50,350,400,30);
        jk.setFont(new Font("serif",Font.BOLD,20));
        jk.setForeground(Color.WHITE);
        add(jk);
        
        t2 = new JTextField();
        t2.setBounds(400,350,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        Cursor pb =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(pb);
        b1.setFocusable(false);
        b1.setBounds(620, 350, 100 ,30);
        add(b1);
            
        l2 = new JLabel("Add New Teacher");
        l2.setBounds(50,410,400,30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        Cursor l4b =new Cursor(Cursor.HAND_CURSOR);
        b2.setCursor(l4b);
        b2.setFocusable(false);
        b2.setBounds(300, 410, 150 ,30);
        add(b2);
        
        l3 = new JLabel("Update Teacher Details");
        l3.setBounds(50,450,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        add(l3);
        
        b3 = new JButton("Update");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        Cursor k5b =new Cursor(Cursor.HAND_CURSOR);
        b3.setCursor(k5b);
        b3.setFocusable(false);
        b3.setBounds(300, 450, 150 ,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        try{
             String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
           
           String sql = "select * from add_teacher";
          
            not=DriverManager.getConnection(url,uname,password);  
            men=not.prepareStatement(sql);
            
           ResultSet rs = men.executeQuery();
               
            while(rs.next()){
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("Father_Name");
                y[i][j++]=rs.getString("Age");
                y[i][j++]=rs.getString("Cost");
                y[i][j++]=rs.getString("Tea_Id");
                y[i][j++]=rs.getString("Phone_No");
                y[i][j++]=rs.getString("Salary");
                y[i][j++]=rs.getString("CNIC_No");
                y[i][j++]=rs.getString("Experience");
                y[i][j++]=rs.getString("Address");
                y[i][j++]=rs.getString("Qualification");
                y[i][j++]=rs.getString("Subject_Assigned");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,80,1000,250);
        add(sp);
        
        
        b1.addActionListener(this);
        setVisible(true);
    
    
    
    
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==back){
             
             dispose();
           Teachers tre=new Teachers();
             
         }
          if(ae.getSource()==b1){
        
        try{
        String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
           
           String a = t2.getText();
           String q = "delete from add_teacher where Tea_Id = '"+a+"'";
          
            not=DriverManager.getConnection(url,uname,password);  
            men =not.prepareStatement(q);
            men.executeUpdate();
        
          JOptionPane.showMessageDialog(null,"Dta Successfully Delete");
          this.setVisible(false);
           new TeaSearchD().setVisible(true);
        }catch(Exception er){}
      
      
    }
        
        else if(ae.getSource()==b2){
        
            new TeaAddData().f.setVisible(true);
            this.setVisible(false);
        
        }
         else if(ae.getSource()==b3){
          
              new TeaUpdateData().f.setVisible(true);
            this.setVisible(false);
         
         }
       
}
      
    }
    

