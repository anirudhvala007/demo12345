
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse of same number is palindrome 121,12121.
		int i=123,r,s=0;
		
		while(i>0)
		{
		    r=i%10;
			i=i/10;
			s=s*10+r;
		}
		if(i==s)

			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
