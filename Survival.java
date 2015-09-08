import java.util.Arrays;
import java.util.Scanner;


class Survival {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
        	boolean willSurvive = true;
        	int count = scan.nextInt();
        	int[] animals = new int[count];
        	int[] strength = new int[count];
        	
        	for(int j = 0; j < count; j++){
        		strength[j] = scan.nextInt();
        	}
        	
        	for(int j = 0; j < count; j++){
        		animals[j] = scan.nextInt();
        	}
        	
        	Arrays.sort(animals);
        	Arrays.sort(strength);
        	
        	for(int j = 0; j < count; j++){
        		if(strength[j] < animals[j]){
        			willSurvive = false;
        			break;
        		}	
        	}
        	if(willSurvive){
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
        }
    }
}
