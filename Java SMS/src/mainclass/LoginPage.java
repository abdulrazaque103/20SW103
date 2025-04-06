/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.HashMap;
import javax.swing.*;
/**
 *
 * @author HP
 */
class LoginPage implements ActionListener{
    
    
	JFrame frame = new JFrame();
	JButton b1,b2,b3;
	JTextField userIDField ;
	JPasswordField userPasswordField ;
	JLabel user, Password,head,line ;
	JLabel messageLabel = new JLabel();
        
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
                frame.setTitle("Login Page");
                frame.setSize(500,500);
		frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                
                ImageIcon img =new ImageIcon("login2.jpg");
                Image i2=img.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i3=new ImageIcon(i2);
                
                JLabel ll=new JLabel("",i3,JLabel.CENTER);
                ll.setBounds(0,0,500,500);
                 frame.add(ll);
                 
                 head=new JLabel("Login Page");
                Font f=new Font("Algerian",Font.BOLD,35);
                head.setBounds(145,50,300,100);
                head.setForeground(Color.MAGENTA);
                head.setFont(f);
        
                line=new JLabel("________________________________");
                line.setBounds(145,100,230,20);
                line.setForeground(Color.MAGENTA);
		
                user = new JLabel("UserID:");
                Font fe=new Font("Times New Roman",Font.BOLD,20);
                user.setBounds(100,150,100,60);
                user.setForeground(Color.MAGENTA);
                user.setFont(fe);
                
                userIDField = new JTextField();
                userIDField.setBounds(200,165,170,30);;
                
                Password = new JLabel("Password:");
                Font fp=new Font("Times New Roman",Font.BOLD,20);
                Password.setBounds(100,220,100,60);
                Password.setForeground(Color.MAGENTA);
                Password.setFont(fp);
		
		/*messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));*/
		
                userPasswordField = new JPasswordField();
		userPasswordField.setBounds(200,235,170,30);
		
                
                b1 = new JButton("Login");
                b1.setBounds(110,320,100,30);
		b1.setFocusable(false);
		b1.addActionListener(this);
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.MAGENTA);
                Cursor c1 =new Cursor(Cursor.HAND_CURSOR);
                b1.setCursor(c1);
                
		
                b2 = new JButton("Reset");
		b2.setBounds(260,320,100,30);
		b2.setFocusable(false);
		b2.addActionListener(this);
                 b2.setBackground(Color.WHITE);
                 b2.setForeground(Color.MAGENTA);
                Cursor c2 =new Cursor(Cursor.HAND_CURSOR);
                b2.setCursor(c2);
               
                 b3 = new JButton("Exits");
		b3.setBounds(185,380,100,30);
		b3.setFocusable(false);
		b3.addActionListener(this);
                 b3.setBackground(Color.WHITE);
                 b3.setForeground(Color.MAGENTA);
                Cursor c8 =new Cursor(Cursor.HAND_CURSOR);
                b3.setCursor(c8);
               ll.add(b3);
                
                ll.add(head);
                ll.add(line);
		ll.add(user);
		ll.add(Password);
		ll.add(messageLabel);
		ll.add(userIDField);
		ll.add(userPasswordField);
		ll.add(b1);
		ll.add(b2);
		
		frame.setVisible(true);
		
	}

        public void close()
	{
		WindowEvent clswin=new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clswin);
	}
        
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==b2) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==b1) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
                            
				if(logininfo.get(userID).equals(password)) {
					
					frame.dispose();
					//WelcomePage welcomePage = new WelcomePage(userID);
                                       Home homePage = new Home();
				}
				else {
					messageLabel.setForeground(Color.darkGray);
					messageLabel.setText("Wrong password");
				}

			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("username not found");
			}
		}
                
             if(e.getSource()==b3) {   
                 close();
                
             }
    
        }

   
}