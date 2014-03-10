package com.chat.view;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class FriendsList extends JFrame implements MouseListener{

	JLabel jl[] = new JLabel[20];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendsList fl = new FriendsList();
	}
	
	public void mainView(){
		
		for(int i = 0; i < jl.length;i++){
			
			jl[i] = new JLabel(Integer.toString(i));
			jl[i].addMouseListener(this);
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

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// 
			if(arg0.getClickCount()==2){
				
				//new Chatting();
			}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for(int i = 0; i < jl.length;i++){
			if(arg0.getSource()==jl[i]){
				jl[i].setForeground(Color.red);
			}
		
		}
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for(int i = 0; i < jl.length;i++){
			if(arg0.getSource()==jl[i]){
				jl[i].setForeground(Color.BLACK);
			}
		
		}
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
