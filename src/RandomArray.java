import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//To pick random number we use random function
	Random r=new Random();
	

int a[]= new int[20];
for(int i=0;i<20;i++)
{
a[i]=r.nextInt(100);
	
	System.out.println(a[i]);
	}

}
}
