import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FindTheRing {

	public static void main(String[] str) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());
		String[] input = null;
		int ringGlass = 0, swaps = 0;
		
		for(int i=0; i < N; i++){
			input = br.readLine().split(" ");
			ringGlass = Integer.parseInt(input[0]);
			swaps = Integer.parseInt(input[1]);
			for(int j = 0; j < swaps; j++){
				if(ringGlass == 0)
					ringGlass = 1;
				else
					ringGlass = ringGlass - 1;
			}
			sb.append(ringGlass + "\n");
		}
		System.out.println(sb.toString());
	}
}
