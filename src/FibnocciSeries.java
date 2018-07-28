import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i=1,j=1,k=0;
		System.out.println(i);
		System.out.println(j);
		while(k<=100)
		{
			k=i+j;
			System.out.print(k);
			i=j;
			j=k;
			System.out.println();
		}

			
			
			
		}
	}


