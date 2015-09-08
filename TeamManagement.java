import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TeamManagement {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] input = null;
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int[] len = new int[n];
			for (int j = 0; j < n; j++){
				len[j] = br.readLine().length();
			}
			Arrays.sort(len);
			boolean possible = true;
			for(int x = 0; x < n; x++){
				if(len[x] == len[x+k-1]){
					x+=k-1;
					continue;
				} else {
					possible = false;
					break;
				}
			}
			
			if(possible)
				System.out.println("Possible");
			else
				System.out.println("Not possible");
		}
	}
}
