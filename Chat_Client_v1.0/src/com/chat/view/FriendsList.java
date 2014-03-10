package com.chat.view;

import java.awt.*;
import javax.swing.*;
public class FriendsList extends JFrame{

	JLabel jl[] = new JLabel[20];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendsList fl = new FriendsList();
	}
	
	public void mainView(){
		
		for(int i = 0; i < jl.length;i++){
			
			jl[i] = new JLabel(Integer.toString(i));
			this.add(jl[i]);
		}
	}
	
	{
		
		this.setLayout(new GridLayout(20,1));
		
		this.mainView();
		
		this.setTitle("FriensList");
		this.setSize(200, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
