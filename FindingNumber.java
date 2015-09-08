import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		long Z=0, M=0, N=0, count=0;
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			Z = Long.parseLong(input[0]);
			M = Long.parseLong(input[1]);
			N = Long.parseLong(input[2]);
			count = 0;
			for(long j = 1; j <= (long)Math.sqrt(Z); j++){
				if(j>M || j>N)
					break;
				long a=0,b=0;
				if(Z % j == 0){
					a = j;
					b = Z/a;
					if(a <= M && b <= N){
						count++;
					}
					
					if(a != b && b <= M && a <= N){
						count++;
					}
					
				}
			}
			System.out.println(count);
		}
	}
}
