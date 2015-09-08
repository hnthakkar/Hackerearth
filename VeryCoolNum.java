import java.io.BufferedReader;
import java.io.InputStreamReader;


class VeryCoolNum {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String inputs[] = null;
		
		for (int j = 0; j < T; j++){
			int coolCount = 0, R =0, K=0;
			inputs = br.readLine().split(" ");
			R = Integer.parseInt(inputs[0]);
			K = Integer.parseInt(inputs[1]);
			for(int i = 0; i <=R; i++){
				int x = i;
				int local = 0;
				while(true){
					if(x % 8 == 5){
						local++;
						if(local == K){
							coolCount++;
							break;
						}
					}
					x >>= 1;
					if(x == 0)
						break;
				}
			}
			System.out.println(coolCount);
		}	
	}
}
