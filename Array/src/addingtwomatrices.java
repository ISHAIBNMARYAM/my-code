
public class addingtwomatrices {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
	int A[][]= {{3,5,9},{7,6,2},{4,3,5}};
	int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
	
	int C[][]=new int[3][3];
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{
			C[i][j]=A[i][j]+B[i][j];
		}
	}
	
	for(int x[]:C)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println("");
	}
	
	}}

