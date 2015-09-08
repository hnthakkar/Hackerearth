
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass7 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        String inputs[] = br.readLine().split(" ");
		int[] intArray = new int[T];
		for(int j = 0; j < inputs.length; j++){
			intArray[j] = Integer.parseInt(inputs[j]);
		}
		
		for(int i = 0; i < T; i++){
			boolean cond = false;
			for(int k = 1; k <= intArray[i]; k++){
				cond = false;
				if(k%3 == 0){
					System.out.print("Fizz");
					cond = true;
				}	
				if(k%5 == 0){
					System.out.print("Buzz");
					cond = true;
				}
				if(!cond)
					System.out.print(k);
				System.out.print("\n");
			}
		}
    }
}
