import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Candies {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int Q = Integer.parseInt(line);
		String inputs[] = null;

		long N = 0l;
		int T = 0;
		
		for(int i = 0 ; i < Q ; i ++){
			inputs = br.readLine().split(" ");
			N = Long.parseLong(inputs[0]);
			T = Integer.parseInt(inputs[1]);
			for(int j = 0; j < T; j++ ){
				if(N%2 == 0)
					N = N/2;
				else
					N = N - (N+1)/2;
				
				N = N - (long)Math.floor((N/4));
			}
			System.out.println(N);
		}
	}
}
