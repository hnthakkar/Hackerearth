import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Dhoom {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int oriKey = scan.nextInt();
		int lock = scan.nextInt();
		int N = scan.nextInt();
		long[] queue = new long[N];
		Set<Integer> numCheck = new HashSet<Integer>();
		int tmp = 0;
		int[] otherKey = new int[N];
		for(int i = 0; i < N; i++){
			otherKey[i] = scan.nextInt();
			tmp = (oriKey*otherKey[i])%100000;
			queue[i] = tmp;
			numCheck.add(tmp);
		}
		
        int counter = 1;
        boolean lockFound = false;
        while(queue[0] != 0){
        	long[] tmpArray = null;
        	int tmpArraySize = queue.length * N > 100005? 100005 : queue.length * N;
        	tmpArray = new long[tmpArraySize];
        	int tmpArrayIndex = 0;
	        for (int j = 0; j < queue.length; j++){
	        	if(queue[j] == 0)
	        		continue;
	        	
	        	int tmpValue = 0;
	        	for(int k = 0; k < N; k++){
	        		tmpValue = (int)((queue[j] * otherKey[k]) % 100000);
	        		if(tmpValue == 0 || numCheck.contains(tmpValue))
	        			continue;
	        		if(tmpValue == lock){
	        			lockFound = true;
	        			break;
	        		}
	        		tmpArray[tmpArrayIndex++] = tmpValue;
	        		numCheck.add(tmpValue);
	        	}
	        	if(lockFound)
		        	break;
	        }
	        counter++;
	        if(lockFound)
	        	break;
	        queue = tmpArray;
	    }
        if(lockFound)
        	System.out.println(counter);
        else
        	System.out.println(-1);
	}

}
