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
import java.sql.*;
/**
 *
 * @author HP
 */
class UpdateDataS implements ActionListener{
    
     JFrame frame = new JFrame();
       JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,gend,id8,id9,id10,id11,id12,gender,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    JButton b,b1,b2,back;
    JRadioButton m1,f1;
    String id_emp;
    
     Connection co=null;
     PreparedStatement st=null;

  UpdateDataS(){
  
    f=new JFrame("Update Student details");
          f.getContentPane().setBackground(Color.BLACK);
        f.setSize(850,630);
        f.setLocation(400,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); 
        f.setLayout(null);
        f.setResizable(false);
        
        
        back=new JButton("Back");
        back.setBounds(2,5,70,25);
        back.addActionListener(this);
        Cursor cb =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(cb);
        back.setFocusable(false);
       // back.setOpaque(false);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        f.add(back);
        

        JLabel jl = new JLabel("Enter roll number to update the data of student");
        jl.setBounds(50,100,500,30);
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("serif",Font.BOLD,20));
        f.add(jl);
        
        t12 = new JTextField();
        t12.setBounds(500,100,200,30);
        f.add(t12);
        
        b2 = new JButton("Update");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(720,100,100,30);
        Cursor c2b =new Cursor(Cursor.HAND_CURSOR);
        b2.setCursor(c2b);
        b2.setFocusable(false);
        f.add(b2);
        b2.addActionListener(this);

        
        id8 = new JLabel("Update Student Details:");
        id8.setBounds(200,10,500,50);
        id8.setFont(new Font("Algerian",Font.BOLD,30));
        id8.setForeground(Color.WHITE);
        f.add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.WHITE);
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(200,170,150,30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
         id2.setForeground(Color.WHITE);
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,170,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
         id3.setForeground(Color.WHITE);
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        f.add(t3);

        id4= new JLabel("DOB (yyyy-dd-mm)");  
        id4.setBounds(400,220,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
         id4.setForeground(Color.WHITE);
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,220,150,30);
        f.add(t4);

        gend= new JLabel("Gender");
        gend.setBounds(50,270,100,30);
         gend.setForeground(Color.WHITE);
        gend.setFont(new Font("serif",Font.BOLD,20));
        f.add(gend);
        
       
        t5=new JTextField(); 
        t5.setBounds(200,270,150,30);
        f.add(t5);
        
       
       
        id6= new JLabel("Phone");
        id6.setBounds(400,270,100,30);
         id6.setForeground(Color.WHITE);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,270,150,30);
        f.add(t6);

        id7= new JLabel("Class");
        id7.setBounds(50,320,100,30);
         id7.setForeground(Color.WHITE);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        f.add(t7);

        id9= new JLabel("Roll No");
        id9.setBounds(400,320,130,30);
         id9.setForeground(Color.WHITE);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        f.add(id9);

        t8=new JTextField();
        t8.setBounds(600,320,150,30);
        f.add(t8);

        id10= new JLabel("City");
        id10.setBounds(50,370,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
         id10.setForeground(Color.WHITE);
        f.add(id10);

        t9=new JTextField();
        t9.setBounds(200,370,150,30);
        f.add(t9);


        id11= new JLabel("Country");
        id11.setBounds(400,370,100,30);
         id11.setForeground(Color.WHITE);
        id11.setFont(new Font("serif",Font.BOLD,20));
        f.add(id11);

        t10=new JTextField();
        t10.setBounds(600,370,150,30);
        f.add(t10);

        id12= new JLabel("Address");
        id12.setBounds(50,420,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
         id12.setForeground(Color.WHITE);
        f.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,420,150,30);
        f.add(t11);


        
        b = new JButton("Submit");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setBounds(250,490,150,40);
        Cursor cub =new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(cub);
        b.setFocusable(false);
        
        f.add(b);

        b1=new JButton("Reset");   
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(450,490,150,40);
        Cursor ub =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(ub);
        b1.setFocusable(false);
        f.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
    
         
      
  }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource()==back){
       
       f.dispose();
       Students nn=new Students();
      
       
       
       }
      
      if(ae.getSource()==b){
            
           try{
        
            String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
             
           
          String str = "update add_students set Name='"+t1.getText()+"',Father_Name='"+t2.getText()+"',Age='"+t3.getText()+"', DOB='"+t4.getText()+"',Gender='"+t5.getText()+"',Phone_No='"+t6.getText()+"',Class='"+t7.getText()+"',Roll_No='"+t8.getText()+"',City='"+t9.getText()+"',Country='"+t10.getText()+"',Address='"+t11.getText()+"' where Roll_No='"+t12.getText()+"'";
            co=DriverManager.getConnection(url,uname,password);  
            st =co.prepareStatement(str);
            st.executeUpdate();

         JOptionPane.showMessageDialog(null,"Data Successfully Updated");
        
        
        }
        catch(Exception e){
         System.out.println(e);     
        }
       
        
       
            
       }
      
       
      if(ae.getSource()==b2){
               try{
        
        
            String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
             
           String str = "select * from add_students where Roll_No = '"+t12.getText()+"'";
          
            co=DriverManager.getConnection(url,uname,password);  
            st =co.prepareStatement(str);
            ResultSet rs = st.executeQuery();
                
            
                if(rs.next()){
                   // f.setVisible(true);
             

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t8.setText(rs.getString(8));
                    t9.setText(rs.getString(9));
                    t10.setText(rs.getString(10));
                    t11.setText(rs.getString(11));
                    
                }
        
        
        
        }
        catch(Exception ex){}
        
            
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
            t11.setText("");
            
       }
    
    }

}
