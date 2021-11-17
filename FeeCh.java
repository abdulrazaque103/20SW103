/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
class FeeCh implements ActionListener {
    
    
      JFrame frame =new JFrame();
    JLabel header,wel,uf,fathf,roll,class1f,am,fee,idf;
    JButton back,pay;
    JTextField itf,ltf,tf,ftf,ltro,ltam,fe;
    JTextArea area;
   
    FeeCh(){
      
        frame.setTitle("Fee Challan");
       frame.setSize(700,580);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.getContentPane().setBackground(Color.BLACK);
       
       
        wel=new JLabel("Student Fee Challan");
       Font fw=new Font("Algerian",Font.BOLD,30);
       wel.setBounds(155,20,370,60);
       wel.setFont(fw);
       wel.setForeground(Color.WHITE);
       
        back=new JButton("Back");
        back.setBounds(2,5,70,25);
       back.addActionListener(this);
        Cursor cub =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(cub);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFocusable(false);
       // back.setOpaque(false);
        
          Font id1 =new Font("Times New Roman",Font.BOLD,20);
        idf=new JLabel("Date:");
        idf.setBounds(40,70,100,70);
        idf.setFont(id1);
        idf.setForeground(Color.WHITE);
        
        itf=new JTextField();
        Font fi =new Font("Times New Roman",Font.BOLD,15);  
        itf.setBounds(160,95,150,20);
        itf.setFont(fi);
        //itf.setOpaque(false);
        //itf.setForeground(Color.WHITE);
        
         Font user1 =new Font("Times New Roman",Font.BOLD,20);
        uf=new JLabel("User Name:");
        uf.setBounds(40,110,150,70);
        uf.setFont(user1);
        uf.setForeground(Color.WHITE);

        tf =new JTextField();
        Font ft =new Font("Times New Roman",Font.BOLD,15);
        tf.setFont(ft);
        tf.setBounds(160,135,150,20);
        //tf.setOpaque(false);
       // tf.setForeground(Color.WHITE);
        
        Font co1 =new Font("Times New Roman",Font.BOLD,20);
        fathf = new JLabel("Father Name");
        fathf.setBounds(40,175,150,20);
        fathf.setFont(co1);
        fathf.setForeground(Color.WHITE);
        
        ftf =new JTextField();
        Font fl =new Font("Times New Roman",Font.BOLD,15);
        ftf.setFont(fl);
        ftf.setBounds(160,175,150,20);
        //ftf.setOpaque(false);
        //ftf.setForeground(Color.WHITE);
        
         
        Font coun1 =new Font("Times New Roman",Font.BOLD,20);
        fee = new JLabel("Fee Category");
        fee.setBounds(40,220,150,20);
        fee.setFont(coun1);
        fee.setForeground(Color.WHITE);
        
       
        fe =new JTextField();
        Font fc =new Font("Times New Roman",Font.BOLD,15);
        fe.setFont(fc);
        fe.setBounds(160,220,150,20);
       // fe.setOpaque(false);
        //fe.setForeground(Color.WHITE);
        
         Font c =new Font("Times New Roman",Font.BOLD,20);
        roll = new JLabel("Roll No:");
        roll.setBounds(40,270,150,20);
        roll.setFont(c);
        roll.setForeground(Color.WHITE);
        
        ltro =new JTextField();
        Font fr =new Font("Times New Roman",Font.BOLD,15);
        ltro.setFont(fr);
        ltro.setBounds(160,270,150,20);
        //ltro.setOpaque(false);
        //ltro.setForeground(Color.WHITE);
        
        
         Font co =new Font("Times New Roman",Font.BOLD,20);
        class1f = new JLabel("Class:");
        class1f.setBounds(40,320,150,20);
        class1f.setFont(co);
        class1f.setForeground(Color.WHITE);
        
        ltf =new JTextField();
        Font flf =new Font("Times New Roman",Font.BOLD,15);
        ltf.setFont(flf);
        ltf.setBounds(160,320,150,20);
        //ltf.setOpaque(false);
        //ltf.setForeground(Color.WHITE);
        
         Font co1a =new Font("Times New Roman",Font.BOLD,20);
        am = new JLabel("Tution Fee:");
        am.setBounds(40,370,150,20);
        am.setFont(co1a);
        am.setForeground(Color.WHITE);
        
        ltam =new JTextField();
        Font flm =new Font("Times New Roman",Font.BOLD,15);
        ltam.setFont(flm);
        ltam.setBounds(160,370,150,20);
        //ltam.setOpaque(false);
        //ltam.setForeground(Color.WHITE);
        
        pay =new JButton("Pay");
        pay.addActionListener(this);
        pay.setBounds(120,440,100,30);
        pay.setFocusable(false);
       // pay.setOpaque(false);
        Cursor cu =new Cursor(Cursor.HAND_CURSOR);
        pay.setCursor(cu);
        pay.setBackground(Color.WHITE);
        pay.setForeground(Color.BLACK);
       
       
        
        Font atxt =new Font("Times New Roman",Font.BOLD,20);
        area =new JTextArea();
        area.setBounds(350,90,300,400);
       area.setEditable(false);
       area.setFont(atxt);
        area.setLineWrap(true);
        
      
       
       frame.add(wel);
       frame.add(back);
       frame.add(pay);
       frame.add(idf);
       frame.add(itf);
       frame.add(tf);
      frame.add(class1f);
       frame.add(ltf);
       frame.add(uf);
       frame.add(fee);
       frame.add(area);
       frame.add(fe);
       frame.add(ltro);
       frame.add(roll);
       frame.add(ftf);
       frame.add(fathf);
       frame.add(am);
       frame.add(ltam);
       frame.setVisible(true);
          
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     
        if(ae.getSource()==back){
        frame.dispose();
        
             Home moe=new Home();
        
        }
        
        
        if(ae.getSource()==pay){
        
        String id =itf.getText();
        String name=tf.getText();
        String father =ftf.getText();
        String Cate =fe.getText();
        String rol=ltro.getText();
        String clas=ltf.getText();
        String Amount=ltam.getText();
        
          area.setText("\n\n______________________________"+"\n\nDate: " +id + "\nName: " + name + "\nFather Name: " + father+ "\nFee Category: "  + Cate + "\nRoll No: " + rol + "\nClass: " + clas +
                  "\nTuition Fee " + Amount +"\n\n____________________________ ");
        }
    }

    void toFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
