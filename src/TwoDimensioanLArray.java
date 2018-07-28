import java.util.Random;

public class TwoDimensioanLArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//to print all elements using forloop(this method is used only if we have equal columns)
int a[]= {12,23,4576,765};
int b[]= {123,456,784,1245};
int c[][]= {{12,23,4576,765}, {123,456,784,1245}};

/*for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
	{
System.out.print(c[i][j]+" ");
	}
	System.out.println(" ");
}
*/

for(int x[]:c)
{
	for(int y:x)
	{
		System.out.print(y+" ");
	}
	System.out.println(" ");
}


}
}