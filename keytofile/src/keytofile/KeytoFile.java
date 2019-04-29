package keytofile;

import java.io.*;

import java.io.BufferedReader;

public class KeytoFile {

	public static void main(String[] args) throws IOException{
		String ofn = "C:\\home\\desktop\\output.txt";
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new FileWriter(ofn)));
		
		try {
			while( (str=br.readLine()) != null && !str.equals("EOF")) {
				System.out.println("key in :" + str);
				pw.println(str);
			}
			br.close();
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("End Of File...");
	}
}
