/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


class TestClass {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String N_R[] = br.readLine().split(" ");
			//int N = Integer.parseInt(N_R[0]);
			int R = Integer.parseInt(N_R[1]);
			String inputs[] = br.readLine().split(" ");
			ArrayList<Integer> intArray = new ArrayList<Integer>();
			for(int j = 0; j < inputs.length; j++){
				intArray.add(Integer.parseInt(inputs[j]));
			}
			int RCount = 0;
			int index = 0;
			int current = 0, next = 0;
			while(!intArray.isEmpty() && RCount < R && index < (intArray.size()-1)){
				current = intArray.get(index);
				next = intArray.get(index + 1);
				if(current < next){
					intArray.remove(index);
					if(index > 0 ) 
						index--;
					RCount++;
					continue;
				}
				//current  = next;
				index++;
			}
			if(RCount == 0){
				intArray.remove(intArray.size() -1);
			}
			
			for(int j = 0; j < intArray.size(); j ++){
				System.out.print(intArray.get(j) + " ");
			}
		}	

	}

}  

*/

/*import java.io.*;
 
public class RemoveFrnds {
    public static void main(String args[] ) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test,N,K,i;
		boolean deleteFriends = false;
		test = Integer.parseInt(br.readLine());
		while (test > 0) {
			test = test - 1;
			String s[] = br.readLine().split(" ");
			N = Integer.parseInt(s[0]);
			K = Integer.parseInt(s[1]);
			String s1[] = br.readLine().split(" ");
			int friends[] = new int[N];
			for(i=0;i<N;i++) 
				friends[i] = Integer.parseInt(s1[i]);
			for(i=0;i<N-1 && K > 0;i++) {
				if(friends[i] < friends[i+1]) {
					friends[i] = -1;
					deleteFriends = true;
					K = K - 1;
					int j = i - 1;
					int temp = i + 1;
					while(j >= 0 && K != 0) {
						if(friends[j] >= friends[temp] && friends[j] != -1)
							break;
						else if(friends[j] < friends[temp] && friends[j] != -1) {
							friends[j] = -1;
							K = K - 1;
						}
						j--;
					}
				}
			}
			if(deleteFriends == false)
				friends[N - 1] = -1;
			for(i=0;i<N;i++) {
				if(friends[i] != -1)
					System.out.print(friends[i] + " ");
			}
			System.out.println();
		}
	}
}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class RemoveFrnds {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String N_R[] = br.readLine().split(" ");
			int N = Integer.parseInt(N_R[0]);
			int R = Integer.parseInt(N_R[1]);
			String inputs[] = br.readLine().split(" ");
			int[] intArray = new int[N];
			for(int j = 0; j < inputs.length; j++){
				intArray[j] = Integer.parseInt(inputs[j]);
			}
			int RCount = 0;
			int jlow = 0, jhigh = 1;
			
			while(RCount < R && jhigh < N) {
				if(intArray[jlow] != -1 && intArray[jlow] < intArray[jhigh]){
					intArray[jlow] = -1;
					RCount++;
					if(jlow > 1)
						jlow--;
					while(jlow > 0 && intArray[jlow] == -1){
						jlow--;
					}	
				} else {
					jlow++;
					if(intArray[jlow] != -1 || jlow == jhigh)
						jhigh++;
					
				}
			}
			
			/*int printCount = 0;
			if(RCount == 0){
				printCount = intArray.length -1; 
			} else {
				printCount = intArray.length; 
			}*/
			
			for(int j = 0; j < intArray.length - (R - RCount); j ++){
				if(intArray[j] != -1)
					System.out.print(intArray[j] + " ");
			}
			
			if(intArray.length - (R - RCount) == 0)
				System.out.println("");
		}	
 
	}
}

    /*import java.util.Scanner;
    public class RemoveFrnds {
        public static void main(String args[] ) throws Exception {
        	Scanner s = new Scanner(System.in);
            int testCases = s.nextInt();
            while(testCases-->0){
            	int N = s.nextInt();
            	int K = s.nextInt();
            	int popularity[] = new int[N];
            	for(int i=0;i<N;i++){
            		popularity[i] = s.nextInt();
            	}
            	int index = 0;
            	outer:
    	        	while(K-->0){
    	        		for(int i=index;i<N-1;i++){
    	        			if(popularity[i]==-1){
    	        				continue;
    	        			}
    	        			int nextPopular = -1;
    	        			for(int j=i+1;j<N;j++){
    	        				if(popularity[j]!=-1){
    	        					nextPopular = popularity[j];
    	        					break;
    	        				}
    	        			}
    	        			if(popularity[i] < nextPopular){
    	        				popularity[i] = -1;
            					for(int j=i-1;j>=0;j--){
            						if(popularity[j]!=-1){
            							index = j;
            							 break;
            						}
            					}
    	        				continue outer;
    	        			}
    	            	}
    	        		index = N-1;
    	        		do{
    	        			for(int j=index;j>=0;j--){
    	        				if(popularity[j]!=-1){
    	        					popularity[j] = -1;
    	        					index = j;
    	        					break;
    	        				}
    	        			}
    	        		}while(K-->0);
    	        	}
            	StringBuilder output = new StringBuilder();
            	for(int i=0;i<N;i++){
            		if(popularity[i]!=-1){
            			output = output.append(popularity[i]).append(" ");
            		}
            	}
            	System.out.println(output.toString().trim());
            }
            s.close();
        }
    }*/