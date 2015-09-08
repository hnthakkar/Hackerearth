import java.util.*;
public class ZeroShark {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[][][] dp = new int[5][2][2];
		//For 1 length, with bit as 0, the count of consecutive "00" is 0 for 1 time
		dp[1][0][0] = 1;
		//For 1 length, with bit as 1, the count of consecutive "00" is 0 for 1 time
		dp[1][1][0] = 1;
		//For 1 length, with bit as 0, the count of consecutive "00" is 1 for 0 time
		dp[1][0][1] = 0;
		//For 1 length, with bit as 1, the count of consecutive "00" is 1 for 0 time
		dp[1][1][1] = 0;
		
		for(int i =2; i<=4; i++){
			dp[i][0][0] = dp[i-1][1][0];
			dp[i][1][0] = (dp[i-1][0][0] + 	dp[i-1][1][0]);
			
			dp[i][0][1] = (dp[i-1][0][0] + dp[i-1][1][1]);
			dp[i][1][1] = (dp[i-1][0][1] + dp[i-1][1][1]);
			
		}
		
		for(int x = 0; x < 5 ; x++){
			for(int y = 0; y <2; y++){
				for(int z = 0; z < 2; z++){
					System.out.println("[" + x + "][" + y + "][" + z + "]:"+ dp[x][y][z]);
				}
			}
		}
		
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println((dp[n][0][1] + dp[n][1][1]));				
		}
    }
}