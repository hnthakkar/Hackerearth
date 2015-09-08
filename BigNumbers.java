import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BigNumbers {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        String inputs[] = br.readLine().split(" ");
        int[][] num = new int[2][];
        for(int x = 0; x < 2; x++){
        	for(int i = 0; i < inputs[x].length(); i++){
        		num[x][i] = Integer.parseInt(inputs[x].charAt(i) + ""); 
        	}
        }		
        System.out.println("sfvfd");

	}

}
