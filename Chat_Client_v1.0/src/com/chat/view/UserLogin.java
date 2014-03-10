/**
 *
 * @author root
 *	this is the user login interface
 */
package com.chat.view;
import java.awt.*;
import javax.swing.*;
public class UserLogin extends JFrame {
	
	JPanel jp1,jp2,jp3,jp4;
	JLabel jl1,jl2;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb1,jb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin ul = new UserLogin();
	}
	
	public void CenterPanel(){
		
		jp1 = new JPanel(new GridLayout(2,1));
		jp3 = new JPanel();
		jp4 = new JPanel();
		jl1 = new JLabel("  UserId:  ");
		jl2 = new JLabel("Password:");
		jtf = new JTextField(10);
		jpf = new JPasswordField(10);
		
		jp3.add(jl1);
		jp3.add(jtf);
		jp4.add(jl2);
		jp4.add(jpf);
		
		jp1.add(jp3);
		jp1.add(jp4);
		
		this.add(jp1,"Center");
		
	}
	
	public void SouthPanel(){
		
		jp2 = new JPanel();
		jb1 = new JButton("submit");
		jb2 = new JButton("cancel");
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		this.add(jp2,"South");
	}
	
	public UserLogin(){
		
		this.CenterPanel();
		this.SouthPanel();
		this.setTitle("User Login");
		this.setSize(250, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
