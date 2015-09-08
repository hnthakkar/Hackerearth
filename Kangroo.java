import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        StringBuffer st = new StringBuffer();
        long a = 0l, b = 0l, m=0l;
        String[] input = null;
        for (int i = 0; i < N; i++) {
        	input = br.readLine().split(" ");
        	a = Long.parseLong(input[0]);
        	b = Long.parseLong(input[1]);
        	m = Long.parseLong(input[2]);
        	st.append((b/m) - ((a-1)/m)).append("\n");
        }
        System.out.println(st);
	}

}
