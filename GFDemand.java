/*import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class GFDemand {
	
	public static void main(String[] args) throws Exception{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out =new PrintWriter(new OutputStreamWriter(System.out));
		String inpFile = "inp.txt";
		String noFile = "out.txt";
		FileReader fileReader = new FileReader(inpFile);
		BufferedReader br = new BufferedReader(fileReader);
		FileOutputStream out = new FileOutputStream(noFile);
		String line = br.readLine();	
		String yes = "YES\n";
		byte[] ybuf = yes.getBytes();
		String no = "NO\n";
		byte[] nbuf = no.getBytes();
		//char[] line = br.readLine().toCharArray();
		//int len = line.length;
		int len = line.length();
		int N = Integer.parseInt(br.readLine());
		String[] ip = null;
		int A =0, B=0;
		for(int i = 0; i < N; i++){
			ip = br.readLine().split(" ");
			A = (int)((Long.parseLong(ip[0])-1)%len);
			B = (int)((Long.parseLong(ip[1])-1)%len);
			if(line.charAt(A) == line.charAt(B)){
				out.write(ybuf);
			} else {
				out.write(nbuf);
			}
		}	
		out.close();
		br.close();
	}
}*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
 
 
public class GFDemand {
    public static void main(String args[] ) throws Exception {
    	String inpFile = "inp.txt";
		String noFile = "out.txt";
		FileReader fileReader = new FileReader(inpFile);
		BufferedReader br = new BufferedReader(fileReader);
		FileOutputStream out = new FileOutputStream(noFile);
		String yes = "YES\n";
		byte[] ybuf = yes.getBytes();
		String no = "NO\n";
		byte[] nbuf = no.getBytes();
		
        String s = br.readLine();
        int n = s.length(); 
        int T = Integer.parseInt(br.readLine());
        //StringBuffer sb = new StringBuffer(); 
        for (int i = 0; i < T; i++) {
        	String[] aStr = br.readLine().split(" ");  
        	
        	long a = Long.parseLong(aStr[0]) - 1;
        	long b = Long.parseLong(aStr[1]) - 1;
 
			int a1 = (int) (a % n); int b1 = (int) (b % n);
			
        	if (s.charAt(a1) == s.charAt(b1)) out.write(ybuf);
        	else out.write(nbuf);
        }
        //System.out.println(sb.toString());
        out.close();
		br.close();
    }
 
}

/*
 import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
     
    public class GFDemand {
    	
    	public static void main(String[] args) throws Exception{
    		String inpFile = "inp.txt";
    		String noFile = "out.txt";
    		FileReader fileReader = new FileReader(inpFile);
    		BufferedReader br = new BufferedReader(fileReader);
    		FileOutputStream out = new FileOutputStream(noFile);
    		String yes = "YES\n";
    		byte[] ybuf = yes.getBytes();
    		String no = "NO\n";
    		byte[] nbuf = no.getBytes();
    			
    		char[] line = br.readLine().toCharArray();
    		int len = line.length;
    		int N = Integer.parseInt(br.readLine());
    		String[] ip = null;
    		int A =0, B=0;
    		for(int i = 0; i < N; i++){
    			ip = br.readLine().split(" ");
    			A = (int)((Long.parseLong(ip[0])-1)%len);
    			B = (int)((Long.parseLong(ip[1])-1)%len);
    			if(line[A] == line[B]){
    				out.write(ybuf);
    			} else {
    				out.write(nbuf);
    			}
    		}
    		out.close();
    		br.close();
    		
    	}
    }*/

