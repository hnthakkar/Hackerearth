import java.io.BufferedReader;
import java.io.InputStreamReader;


class CoolNumber {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int Q = Integer.parseInt(line);
		String inputs[] = null;
		StringBuilder b = new StringBuilder();
		char indexChar = '0';
		int coolCount = 0, match =0, R =0, K=0;
		for (int j = 0; j < Q; j++){
			inputs = br.readLine().split(" ");
			R = Integer.parseInt(inputs[0]);
			K = Integer.parseInt(inputs[1]);
			b.setLength(0);
			b.append('1');
			coolCount = 0;
			for(int i = 1; i < R; i++){
				match = 0;
				char carry = '1';
				int index = 0;
				while(carry == '1'){
					indexChar = b.charAt(index);
					if(indexChar == '0'){
						b.replace(index, index+1, "1");
						carry = '0';
					} else {
						carry = '1';
						b.replace(index, index+1, "0");
						if(index == b.length()-1)
							break;
						index++;
					}
				}
				if(carry == '1')
					b.append('1');
				
				for(int x = b.length()-1; x > 1; x--){
					if(b.charAt(x) == '1' && b.charAt(x-1) == '0' && b.charAt(x-2) == '1'){
						if(++match >= K){
							coolCount++;
							break;
						}	
					}	
				}
			}
			System.out.println(coolCount);
		}	
	}

}
