    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
     
     
    public class LongestIncreasingPath {
    	
    	static int[][] adjMat;
    	static int[][] stateMat;
    	
    public static int maxDist()
    {
    	
    	for(int i=0;i<adjMat.length;i++)
    	{
    		for(int j=0;j<adjMat[i].length;j++)
    		{
    			
    			
    				if(i-1>=0&&j-1>=0&&adjMat[i-1][j]<adjMat[i][j]&&adjMat[i][j-1]<adjMat[i][j])
    				{
    					if(stateMat[i][j-1]>1||stateMat[i-1][j]>1)
    					stateMat[i][j]=1+Math.max(stateMat[i-1][j], stateMat[i][j-1]);
    				}else if(i-1>=0&&adjMat[i-1][j]<adjMat[i][j])
    				{
    					if(i-1==0&&j==0)
    					stateMat[i][j]=1+stateMat[i-1][j];
    					else if(stateMat[i-1][j]>1)
    					{
    					stateMat[i][j]=1+stateMat[i-1][j];
    					}
    				}else if(j-1>=0&&adjMat[i][j-1]<adjMat[i][j])
    				{
    					if(j-1==0&&i==0)
    					stateMat[i][j]=1+stateMat[i][j-1];
    					else if(stateMat[i][j-1]>1)
    					stateMat[i][j]=1+stateMat[i][j-1];
    				}
    			
    		}
    	}
    	int max=0;
    	for(int k=0;k<stateMat.length;k++)
    	{
    		for(int l=0;l<stateMat[k].length;l++)
    		{
    			if(max<stateMat[k][l])
    			{
    				max=stateMat[k][l];
    			}
    		}
    	}
    	
    	return max;
    }
    	/**
    	 * @param args
    	 */
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
     
    		int testcases=0;
    		int m=0;
    		int n=0;
    		
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		try {
    			testcases = Integer.parseInt(br.readLine());
    			
    			for(int i=0;i<testcases;i++)
    			{
    				StringTokenizer st = new StringTokenizer(br.readLine()," ");
    				
    				n=Integer.parseInt(st.nextToken());
    				m=Integer.parseInt(st.nextToken());
    				
    				adjMat = new int[n][m];
    				stateMat = new int[n][m];
    				
    				for(int j=0;j<n;j++)
    				{
    					StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    					for(int k=0;k<m;k++)
    					{
    						adjMat[j][k]=Integer.parseInt(st1.nextToken());
    						stateMat[j][k]=1;
    					}
    				}
    				
    				
    					
    				
    				System.out.println(maxDist());
    				
    			}
    		} catch (NumberFormatException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    		
    		
    		
    	}
     
    }

