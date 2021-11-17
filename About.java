/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class About extends JFrame implements ActionListener{
    
    private JPanel contentPane;
    JButton back;
    About(){
    
        setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); 
            setResizable(false);
            
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

              back=new JButton("Back");
        back.setBounds(2,5,70,25);
        back.addActionListener(this);
         back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        Cursor yb =new Cursor(Cursor.HAND_CURSOR);
        back.setCursor(yb);
        back.setFocusable(false);
        //back.setOpaque(false);
        contentPane.add(back);
        
        
         /*  JLabel l1 = new JLabel();
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("image.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);
*/

            JLabel l3 = new JLabel("School");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v8.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Abdul Razaque ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            l6.setForeground(Color.WHITE);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Roll Number - 20SW103");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            l7.setForeground(Color.WHITE);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Contact : abdulrazaquerajput9@gmail.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            l8.setForeground(Color.WHITE);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - Software Engineering (Muet)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            l9.setForeground(Color.WHITE);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +92 9999 999999");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            l10.setForeground(Color.WHITE);
            contentPane.add(l10);
                
                setVisible(true);
            contentPane.setBackground(Color.BLACK);

    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==back){
        
        dispose();
        Home tr=new Home();
        }
    }
}
