
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Reverse {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        char[] input = null; 
        StringBuffer st = new StringBuffer();
        for (int i = 0; i < N; i++) {
            input = br.readLine().trim().toCharArray();
            for(int j =input.length-1; j>=0; j--){
            	st.append(input[j]);
            }
            st.append("\n");
        }
        System.out.println(st);
	}
}
