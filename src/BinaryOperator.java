
public class BinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;            //Binary format of 12=1100
int b=58;            //Binary format of 58=111010
int c=a&b;           //The combination of 12 & 58 is 8.The Binary format of 8=1000

System.out.println(Integer.toBinaryString(a));
System.out.println(Integer.toBinaryString(b));
System.out.println(Integer.toBinaryString(c));
System.out.println(c);
	}

}
//similarly same will be applied for OR operations. int c=a|b