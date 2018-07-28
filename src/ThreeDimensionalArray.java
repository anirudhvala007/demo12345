
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[4];
		int[][] b= new int[4][5];
		int[][][] c= new int [4][4][4];

	
	/*for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			for(int k=0;k<c.length;k++)
			{
				c[i][j][k]=i+j+k;
				System.out.print(" "+c[i][j][k]);
			}
		*/	
		
	
		for(int x[][]:c)
		{
			for(int y[]:x)
			{
				for(int z:y)
				{
					System.out.println(" "+ z);
				}
			}
		}
	}
}
