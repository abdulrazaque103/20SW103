/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author HP
 */
class SearchDS  extends JFrame implements ActionListener{
    
      JLabel l1,l2,id8,l3;
    JTable t1;
    JButton b1,back,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Gender","Phone","Class","Roll No", "City", "Country","Address"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    
     Connection cont=null;
     PreparedStatement stae=null;
     
     SearchDS(){
     
    super("Student Details");
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
        
         
        id8 = new JLabel("Student's Record");
        id8.setBounds(380,5,500,50);
        id8.setFont(new Font("Algerian",Font.BOLD,30));
        id8.setForeground(Color.WHITE);
        add(id8);
        
        l1 = new JLabel("Enter roll number to delete Student : ");
        l1.setBounds(50,350,400,30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,350,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(620, 350, 100 ,30);
        b1.setFocusable(false);
        Cursor abr =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(abr);
        add(b1);
            
        l2 = new JLabel("Add New Student");
        l2.setBounds(50,410,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setForeground(Color.WHITE);
        add(l2);
        
        b2 = new JButton("Add Student");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
         Cursor yrtb =new Cursor(Cursor.HAND_CURSOR);
        b2.setCursor(yrtb);
        b2.setFocusable(false);
        b2.setBounds(300, 410, 150 ,30);
   
        add(b2);
        
        l3 = new JLabel("Update Student Details");
        l3.setBounds(50,450,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.WHITE);
        add(l3);
        
        b3 = new JButton("Update Student");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
         Cursor yyb =new Cursor(Cursor.HAND_CURSOR);
        b3.setCursor(yyb);
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
           
           String sql = "select * from add_students";
          
            cont=DriverManager.getConnection(url,uname,password);  
            stae =cont.prepareStatement(sql);
            
            ResultSet rs = stae.executeQuery();
            
            while(rs.next()){
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("Father_Name");
                y[i][j++]=rs.getString("Age");
                y[i][j++]=rs.getString("DOB");
                y[i][j++]=rs.getString("Gender");
                y[i][j++]=rs.getString("Phone_No");
                y[i][j++]=rs.getString("Class");
                y[i][j++]=rs.getString("Roll_No");
                y[i][j++]=rs.getString("City");
                y[i][j++]=rs.getString("Country");
                y[i][j++]=rs.getString("Address");
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
            Students str=new Students();
       }
        if(ae.getSource()==b1){
        
        try{
        String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
           
           String a = t2.getText();
           String q = "delete from add_students where Roll_No = '"+a+"'";
          
            cont=DriverManager.getConnection(url,uname,password);  
            stae =cont.prepareStatement(q);
            stae.executeUpdate();
        
          JOptionPane.showMessageDialog(null,"Data Successfully delete");
        this.setVisible(false);
        new SearchDS().setVisible(true);
        }
        catch(Exception ec){}
        
        
        }
        else if(ae.getSource()==b2){
        
            new AddDataS().f.setVisible(true);
            this.setVisible(false);
        
        }
         else if(ae.getSource()==b3){
          
              new UpdateDataS().f.setVisible(true);
            this.setVisible(false);
         
         }
       
    }
}
