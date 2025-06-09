package programsJava;

import java.net.URL;

public class getUrl {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.technolamror.com/java?page=1&form=8");

			
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());
			System.out.println("Path: " + url.getPath());
			System.out.println("Query: " + url.getQuery());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
