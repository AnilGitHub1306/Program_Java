package programsJava;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class OpenNotepad {

	public static void main(String[] args) throws UnknownHostException {
		
		Runtime rs = Runtime.getRuntime();
		 try {
			 
		 rs.exec("notepad");
		 }
		 catch (IOException e) {
		 System.out.println(e);
		 }

	}

}
