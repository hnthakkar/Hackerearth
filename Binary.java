import java.io.BufferedReader;
import java.io.InputStreamReader;


class Binary {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int Q = Integer.parseInt(line);
		String inputs[] = null;
		
		int number = 0, coolCount;
		for (int i = 0; i < Q; i++){
			inputs = br.readLine().split(" ");
			number = Integer.parseInt(inputs[0]);
			coolCount = Integer.parseInt(inputs[1]);
			StringBuilder buf = new StringBuilder();
			while(number>1){
				if(number%2==0){
					buf.append("0");
				} else {
					buf.append("1");
				}
				number /= 2;
			}
			if(number == 1)
				buf.append("1");
			
			char[] charArray = buf.reverse().toString().toCharArray();
			int count = 0;
			for(int j = 0; j < charArray.length - 2; j++ ){
				if(charArray[j] == '1' && charArray[j+1] == '0' && charArray[j+2] == '1')
					count++;
				if(count >= coolCount)
					break;
			}
			
		}
	}

}
