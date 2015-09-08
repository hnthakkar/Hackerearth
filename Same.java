import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Same {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] inp = new char[2][];
		inp[0] = br.readLine().toCharArray();
		inp[1] = br.readLine().toCharArray();
        
		if(inp[0].length != inp[1].length){
			System.out.println("NO");
			return;
		}	
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int tmp;
		boolean match = true;
        for (int i = 0; i < 2; i++){
        	for(int j = 0; j < inp[i].length; j++){
        		if(map.containsKey(inp[i][j])){
        			if( i == 0 ){
        				map.put(inp[i][j], map.get(inp[i][j])+1);
        			} else {
        				tmp = map.get(inp[i][j]) -1;
        				if(tmp == 0)
        					map.remove(inp[i][j]);
        				else
        					map.put(inp[i][j], tmp);
        			}
        		} else {
        			if( i == 0)
        				map.put(inp[i][j], 1);
        			else{
        				match = false;
        				break;
        			}
        		}
        	}
        }
        if(match && map.size() == 0)
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}

}
