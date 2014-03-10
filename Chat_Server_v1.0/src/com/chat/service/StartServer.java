
package com.chat.service;

import java.net.*;
import java.security.*;
import java.io.*;

import javax.net.SocketFactory;
public class StartServer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartServer ss = new StartServer();
	}
	
	public StartServer(){
		Socket s;
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("Server beginning!!");
			while(true){
				s = ss.accept();
				System.out.println("somebody connect me !!"+s);
				
				ClientThread ct = new ClientThread(s);
				Thread t = new Thread(ct);
				t.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


//create a ClientThread class
class ClientThread implements Runnable{
	
	Socket s;
	public ClientThread(Socket s){
		
		
		this.s = s;
	}

	@Override
	public void run() {
		try{
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			System.out.println("data is come again!!"+s);
			while((str = br.readLine()) != null){
				
				System.out.println(s);
				System.out.println(str);
	
			}
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
