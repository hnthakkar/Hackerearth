import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LED {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int[] c = {6,2,5,5,4,5,6,3,7,6}; 
		int count = 0,index=0;
		for(int i = 0; i < line.length(); i++){
			index = (int)line.charAt(i);
			count = count + c[index-48];
		}
		System.out.println(count);
	}	
}
