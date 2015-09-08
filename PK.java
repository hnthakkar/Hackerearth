import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class PK {

	private static final HashMap<Integer, ArrayList<Integer>> preElemMap = new HashMap<Integer, ArrayList<Integer>>();
	private static long counter = 0l;
	private static int length = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] input = new int[26][26];

		for (int i = 0; i < 26; i++) {
			String[] tmp = br.readLine().split(" ");
			int[] tmpIntArray = new int[26];
			for (int j = 0; j < 26; j++) {
				tmpIntArray[j] = Integer.parseInt(tmp[j]);
			}
			input[i] = tmpIntArray;
		}
		
		for (int i = 0; i < 26; i++){
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			for (int j = 0; j < 26; j++){
				if(input[j][i] == 1)
					list.add(j);
			}
			preElemMap.put(i, list);
		}
		
		for(int x = 0; x < 26; x++){
			System.out.println(x + ":" + preElemMap.get(x).size() + ":" + preElemMap.get(x));
		}
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			counter = 0l;
			String[] tmp = br.readLine().split(" ");
			int endChar = tmp[0].charAt(0);
			length = Integer.parseInt(tmp[1]);
			ArrayList<Integer> stack = new ArrayList<Integer>();
			stack.addAll(preElemMap.get(endChar-97));
			getPKString(stack);
			System.out.println(counter%1000000007);
		
		}
	}
	
	private static void getPKString(ArrayList<Integer> stack){
		if(stack.size() == length){
			counter++;
			return;
		}
		
		if(stack.size() > 0){
			int top = stack.get(stack.size() -1);
			ArrayList<Integer> adj = preElemMap.get(top);
			for(int i = 0; i < adj.size(); i++){
				stack.add(adj.get(i));
				getPKString(stack);
				stack.remove(stack.size() - 1);
			}
		}
	}
}


