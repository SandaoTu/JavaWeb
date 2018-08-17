package day1;
import java.net.*;
import java.io.*;

public class MyIE {
	public static void main(String args[]) {
		try {
			Socket s=new Socket("127.0.0.1",8080);
			
			OutputStream os =s.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			PrintWriter pw=new PrintWriter(osw,true);
			
			pw.println("GET /aaa.html HTTP/1.1");
			pw.println("Host: 127.0.0.1:8080");
			pw.println("Connection: keep-alive");
			pw.println("Upgrade-Insecure-Requests: 1");
			pw.println("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
			pw.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
			pw.println("Accept-Encoding: gzip, deflate, sdch, br");
			pw.println("Accept-Language: zh-CN,zh;q=0.8");
			pw.println("");
			
			//receive from tomcat
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			while(br.ready()) {
				System.out.println(br.readLine());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
