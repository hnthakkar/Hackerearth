import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class RK {
	
	public static void main(String[] str) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String line = br.readLine().trim();
		int N = Integer.parseInt(line);
		char[] input = null;
		int Rcount, len, Kcount, initRCount;
		ArrayList<Integer> adj = new ArrayList<Integer>();
		for (int i = 0; i < N; i++){
			adj.clear();
			input = br.readLine().toCharArray();
			len = input.length;
			Rcount = 0; Kcount = 0;initRCount = 0;
			int offset = 0;
			while(true){
				Rcount = 0; Kcount = 0;
				Rcount = getCount(offset, len, input, 'R');
				initRCount += Rcount;
				adj.add(Rcount);
				offset += Rcount; 
				Kcount += getCount(offset, len, input, 'K');
				adj.add(Kcount);
				offset += Kcount;
				if(Rcount== 0 && Rcount == Kcount)
					break;
			}
			
			int tmp = adj.size()-1;
			while(adj.get(tmp) == 0){
				adj.remove(tmp);
				tmp--;
			}
			
			if(adj.size() == 1){
				sb.append((adj.get(0)-1) + "\n");
				continue;
			}
			
			if(adj.size() == 2){
				sb.append((adj.get(0) + adj.get(1)) + "\n");
				continue;
			}
			
				
			int endInd=0, convCount = 0;
			for (int j = 1; j < adj.size()-1; j=j+2){
				if(adj.get(j) > adj.get(j+1)){
					if(convCount < adj.get(j)){
						convCount = adj.get(j); endInd = j;
						while(endInd < (adj.size()-2) && adj.get(endInd+2) > adj.get(endInd+1)){
							convCount += (adj.get(endInd+2) - adj.get(endInd+1));
							endInd += 2; 
						}
					}	
				}
			}
			sb.append((initRCount+convCount)+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int getCount(int offset, int len, char[] input, char ch){
		if(offset >= len)
			return 0;
		int count = 0;
		while(input[offset] == ch){
			count++;
			if(offset < len -1)
				offset++;
			else 
				break;
		}
		return count;
	}

}


