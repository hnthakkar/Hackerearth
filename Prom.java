import java.util.Arrays;
import java.util.Scanner;


class Prom {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
        	boolean willMatch = true;
        	int boys = scan.nextInt();
        	int girls = scan.nextInt();
        	
        	int[] bheight = new int[boys];
        	int[] gheight = new int[girls];
        	
        	for(int j = 0; j < boys; j++){
        		bheight[j] = scan.nextInt();
        	}
        	
        	for(int j = 0; j < girls; j++){
        		gheight[j] = scan.nextInt();
        	}
        	
        	Arrays.sort(bheight);
        	Arrays.sort(gheight);
        	
        	int index = 0;
        	while(index < boys){
        		if(bheight[index] > gheight[index]){
        			index++;
        		}else {
        			willMatch = false;
        			break;
        		}
        	}
        	if(willMatch){
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
        	
        }	
	}

}
