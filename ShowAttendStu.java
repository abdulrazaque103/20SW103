/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ShowAttendStu  extends JFrame implements ActionListener{
    
     JTable j1;
    JButton b1,back;
    String h[]={"First Half","Second Half","Roll Number","Date"};
    String d[][]=new String[15][4];  
    int i=0,j=0;
    Connection tion=null;
    PreparedStatement ion=null;

    ShowAttendStu(){
        
    super("View Students Attendence");
        setSize(800,300);
        setLocation(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(false);
        //setLayout(null);
        
       // JPanel p01=new JPanel();
   //p01.setLayout(new FlowLayout(FlowLayout.LEFT));
  // p01.setPreferredSize(new Dimension(400,30));
        back=new JButton("Back");
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor b22 =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(b22);
        back.setFocusable(false);
         //p01.add(back);
        //p01.setBackground(Color.BLACK);
      add(back,"North");
        
        try{
             String url="jdbc:mysql://localhost:3306/school";
           String uname="root";
           String password="";
         
            String sr="select * from attend_s";
            
            tion =DriverManager.getConnection(url,uname,password);  
            ion =tion.prepareStatement(sr);
          
            
            ResultSet rs=ion.executeQuery();
            while(rs.next()){
                d[i][j++]=rs.getString("First_Half");
                d[i][j++]=rs.getString("Second_Half");
                d[i][j++]=rs.getString("Roll_No");
                d[i][j++]=rs.getString("Date");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
         b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        Cursor b2 =new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(b2);
        b1.setFocusable(false);
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
   setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==back){
        
             dispose();
             AttendanceStu bre=new AttendanceStu();
             
        }
         
         if(ae.getSource()==b1){
        try{
            j1.print();
        }catch(Exception e){}
         }
    }
}
