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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Random;
import javax.swing.border.Border;
/**
 *
 * @author HP
 */
class AddDataS implements ActionListener{
    
      JFrame frame = new JFrame();
    JFrame f;
    JLabel id,id1,id2,id3,id4,gend,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,gender,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,back,b1,b2,b3;
    JComboBox c1,c2;
    JRadioButton m1,f1;
    
       
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9L) + 1L;
    long first = Math.abs(first4);
    
    Connection con=null;
    PreparedStatement stat=null;
    AddDataS(){
    
       f = new JFrame("Add Student");
        f.getContentPane().setBackground(Color.black);
         f.setSize(800,550);
       f.setLocation(400,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); 
        f.setLayout(null);
        f.setResizable(false);
       
        
      
       
        back=new JButton("Back");
        back.setBounds(2,5,70,25);
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor cub =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(cub);
        back.setFocusable(false);
        //back.setOpaque(false);
        f.add(back);
        
        id8 = new JLabel("New Student Details");
        id8.setBounds(230,20,500,50);
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

        id4= new JLabel("DOB (yyyy-dd-mm)");  
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.WHITE);
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,150,150,30);
        f.add(t4);

        gend= new JLabel("Gender");
        gend.setBounds(50,200,100,30);
        gend.setFont(new Font("serif",Font.BOLD,20));
        gend.setForeground(Color.WHITE);
        f.add(gend);

          ButtonGroup bg=new ButtonGroup();
        m1 =new JRadioButton("Male"); 
        m1.setBounds(200,200,70,30);
        m1.setFocusable(false);
        m1.setOpaque(false);
        m1.setForeground(Color.WHITE);
        bg.add(m1);
        f.add(m1);
        
        f1 =new JRadioButton("Female");
       f1.setBounds(280,200,70,30);
       f1.setFocusable(false);
       f1.setOpaque(false);
       f1.setForeground(Color.WHITE);
        bg.add(f1);
        f.add(f1);
        

        id6= new JLabel("Phone");
        id6.setBounds(400,200,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.WHITE);
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,200,150,30);
        f.add(t6);

        id7= new JLabel("Class");
        id7.setBounds(50,250,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.WHITE);
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,250,150,30);
        f.add(t7);

        id9= new JLabel("Roll No");
        id9.setBounds(400,250,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        id9.setForeground(Color.WHITE);
        f.add(id9);

        t8=new JTextField();
        t8.setBounds(600,250,150,30);
        t8.setText("1"+first);
        f.add(t8);

        id10= new JLabel("City");
        id10.setBounds(50,300,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id10.setForeground(Color.WHITE);
        f.add(id10);

        t9=new JTextField();
        t9.setBounds(200,300,150,30);
        f.add(t9);


        id11= new JLabel("Country");
        id11.setBounds(400,300,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id11.setForeground(Color.WHITE);
        f.add(id11);

        t10=new JTextField();
        t10.setBounds(600,300,150,30);
        f.add(t10);

         id12= new JLabel("Address");
        id12.setBounds(50,350,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id12.setForeground(Color.WHITE);
        f.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,350,150,30);
        f.add(t11);
        
        b = new JButton("Submit");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setBounds(250,420,150,40);
        b.setFocusable(false);
        Cursor cu =new Cursor(Cursor.HAND_CURSOR);
        b.setCursor(cu);
        f.add(b);

        b1=new JButton("Reset");   
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(450,420,150,40);
        b1.setFocusable(false);
        Cursor c =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(c);
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
      Students sty=new Students();
       
       
       }
        
       if(ae.getSource()==b){
      
       String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String gender="Male";
        if(f1.isSelected()){ gender="Female"; }
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
       
        
          try{
            
            
           String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
             
            String query="INSERT into add_students(Name,Father_name,Age,DOB,Gender,Phone_No,Class,Roll_No,City,Country,Address) values(?,?,?,?,?,?,?,?,?,?,?)";
            
            con =DriverManager.getConnection(url,uname,password);  
            stat =con.prepareStatement(query);
            
            stat.setString(1,t1.getText());
            stat.setString(2,t2.getText());
            stat.setString(3,t3.getText());
            stat.setString(4,t4.getText());
            stat.setString(5,m1.getText());
            stat.setString(6,t6.getText());
            stat.setString(7,t7.getText());
            stat.setString(8,t8.getText());
            stat.setString(9,t9.getText());
             stat.setString(10,t10.getText());
            stat.setString(11,t11.getText());
            
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Student Data Has Been Inserted Successfully ");
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
            t11.setText("");
       
       }
          
    
    }
}
