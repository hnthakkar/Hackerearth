/*import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FinalVoyage {
	
	public static void main(String[] str) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		int N = 0, WMax = 0;
		int[] WArray = null;
		int[] VArray = null;
		String[] tmp = null;
		int[][] k = null;
		for(int i = 0; i < T; i++){
			N = Integer.parseInt(br.readLine());
			WArray = new int[N];
			VArray = new int[N];
			WMax = Integer.parseInt(br.readLine());
			tmp = br.readLine().split(" ");
			for (int j = 0; j < N; j++ )
				WArray[j] = Integer.parseInt(tmp[j]);
			tmp = br.readLine().split(" ");
			for (int j = 0; j < N; j++ )
				VArray[j] = Integer.parseInt(tmp[j]);
			
			k = new int[N+1][WMax+1];
			for(int x = 0; x < N+1; x++){
				for(int y = 0; y < WMax+1; y++){
					if(x == 0 || y == 0 ){
						//System.out.print(0);
						k[x][y] = 0;
					} else if(x == 1 || y == 1){
						k[x][y] = VArray[0];
						//System.out.print(VArray[0]);
					} else if(y < WArray[x-1]){
						k[x][y] = k[x-1][y];
						//System.out.print(k[x-1][y]);
					} else {
						k[x][y] = Math.max(k[x-1][y], k[x-1][y- WArray[x-1]] + VArray[x-1]);
						//System.out.print(k[x][y]);
					}
				}
				//System.out.println();
			}
			System.out.println(k[N][WMax]);
		}
		System.out.println(sb.toString());
	}

}
*/



/*    import java.util.Scanner;
     
    class TestClass {
    	
    	public static void main(String[] str) {
    		Scanner sc=new Scanner(System.in);
    		int T = sc.nextInt();
    		for(int i = 0; i < T; i++){
    			int N=sc.nextInt();
    			int WMax = sc.nextInt();
    			int[] WArray = new int[N];
    			int[] VArray = new int[N];
    			
    			for (int j = 0; j < N; j++ )
    				WArray[j] = sc.nextInt();
    			
    			for (int j = 0; j < N; j++ )
    				VArray[j] = sc.nextInt();
    			
    			System.out.println(knapsack(N, WMax, WArray, VArray));
    			sc.close();
    		}
    	}
    	
    	private static int knapsack(int N, int WMax, int[] WArray, int[] VArray) {
    		int[][] k = new int[N + 1][WMax + 1];
    		     
    		for (int x = 0; x <= N; x++) {
    			for (int y = 0; y <= WMax; y++) {
    				if(x==0 || y==0){
    					k[x][y] = 0;
    				}else if (WArray[x - 1] <= y) {
    					k[x][y] = Math.max(k[x - 1][y], k[x - 1][y - WArray[x - 1]]	+ VArray[x - 1]);
    				} else {
    					k[x][y] = k[x - 1][y];
    				}
    			}
    		}
    		return k[N][WMax];
    	}
    }*/


    /*import java.util.Scanner;
    class TestClass {
       public static void main(String[] args) {
    	
    	  
    	 Scanner sc=new Scanner(System.in);
    	    int T=sc.nextInt();
    	    for(int i=0;i<T;i++)
    	    {
    	    	int N=sc.nextInt();
    	    	int W=sc.nextInt();
    	    	int[] wt=new int[N];
    	    	for(int j=0;j<N;j++)
    	    		wt[j]=sc.nextInt();
    	    	int[] val=new int[N];
    	    	for(int j=0;j<N;j++)
    	    		val[j]=sc.nextInt();
    	    	System.out.println(knapSack(val,wt,W,N));
    	    }
    	    
    	}
     
    	private static int knapSack(int[] val, int[] wt, int W, int n) {
    		int i, w;
    		   int K[][]=new int[n+1][W+1];
    		 
    		   // Build table K[][] in bottom up manner
    		   for (i = 0; i <= n; i++)
    		   {
    		       for (w = 0; w <= W; w++)
    		       {
    		           if (i==0 || w==0)
    		               K[i][w] = 0;
    		           else if (wt[i-1] <= w)
    		                 K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
    		           else
    		                 K[i][w] = K[i-1][w];
    		       }
    		   }
    		 
    		   return K[n][W];
    		
    	}
    }
    
*/
     import java.util.Scanner;
         
        class FinalVoyage {
        	
        	/*public static void main(String[] str) {
        		Scanner sc=new Scanner(System.in);
        		int T = sc.nextInt();
        		for(int i = 0; i < T; i++){
        			int N=sc.nextInt();
        			int WMax = sc.nextInt();
        			int[] WArray = new int[N];
        			int[] VArray = new int[N];
        			
        			for (int j = 0; j < N; j++ )
        				WArray[j] = sc.nextInt();
        			
        			for (int j = 0; j < N; j++ )
        				VArray[j] = sc.nextInt();
        			
        			System.out.println(knapsack(N, WMax, WArray, VArray));
        			sc.close();
        		}
        	}*/
        	
        	public static void main(String[] args) {
            	
          	  
           	 Scanner sc=new Scanner(System.in);
           	    int T=sc.nextInt();
           	    for(int i=0;i<T;i++)
           	    {
           	    	int N=sc.nextInt();
           	    	int W=sc.nextInt();
           	    	int[] wt=new int[N];
           	    	for(int j=0;j<N;j++)
           	    		wt[j]=sc.nextInt();
           	    	int[] val=new int[N];
           	    	for(int j=0;j<N;j++)
           	    		val[j]=sc.nextInt();
           	    	System.out.println(knapSack(val,wt,W,N));
           	    }
           	    
           	}
        	
        	private static int knapsack(int N, int WMax, int[] WArray, int[] VArray) {
        		int[][] k = new int[N + 1][WMax + 1];
        		     
        		for (int x = 0; x <= N; x++) {
        			for (int y = 0; y <= WMax; y++) {
        				if(x==0 || y==0){
        					k[x][y] = 0;
        				}else if (WArray[x - 1] <= y) {
        					k[x][y] = Math.max(k[x - 1][y], k[x - 1][y - WArray[x - 1]]	+ VArray[x - 1]);
        				} else {
        					k[x][y] = k[x - 1][y];
        				}
        			}
        		}
        		return k[N][WMax];
        	}
        	
        	private static int knapSack(int[] val, int[] wt, int W, int n) {
        		int i, w;
        		   int K[][]=new int[n+1][W+1];
        		 
        		   // Build table K[][] in bottom up manner
        		   for (i = 0; i <= n; i++)
        		   {
        		       for (w = 0; w <= W; w++)
        		       {
        		           if (i==0 || w==0)
        		               K[i][w] = 0;
        		           else if (wt[i-1] <= w)
        		                 K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
        		           else
        		                 K[i][w] = K[i-1][w];
        		       }
        		   }
        		 
        		   return K[n][W];
        		
        	}
        }