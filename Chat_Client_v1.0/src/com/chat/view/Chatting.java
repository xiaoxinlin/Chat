/**
 * this is the chatting view
 */

package com.chat.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;


public class Chatting extends JFrame implements ActionListener{

	JPanel jp;
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	
	Socket s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chatting ct = new Chatting();
	}
	
	public void mainView(){
		
		jp = new JPanel();
		jta = new JTextArea(10, 20);
		jtf = new JTextField(20);
		jb = new JButton("send");
		jb.addActionListener(this);
		
		jp.add(jtf);
		jp.add(jb);
		
		this.add(jta,"Center");
		this.add(jp,"South");
		
	}
	
	public void ConnectServer(){
		
		try {
			s = new Socket("127.0.0.1", 9999);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	{	
		this.ConnectServer();
		
		this.mainView();
		this.setTitle("Chatting room");
		this.setSize(350, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jb){
			
			try {
				//output to s' OutputStream
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
				pw.println(jtf.getText());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
