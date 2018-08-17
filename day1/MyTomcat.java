package day1;
import java.sql.*;
import java.net.*;
import java.io.*;

public class MyTomcat {
	public static void main(String args[]) {
		try {
			ServerSocket ss=new ServerSocket(8080);
			System.out.println("server startup in 1238ms");
			
			Socket s=ss.accept();
			
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println(br.readLine());
			
			while(br.ready()) {
				System.out.println(br.readLine());
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
