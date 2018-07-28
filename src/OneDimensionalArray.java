
public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		
for(int i=0;i<a.length;i++)                 //It is  forloop(we can specify how many elements we need)
{                                   //If we don't know no.of elements we have we can use for(int i=0;i<a.length ;i++)
	System.out.println(a[i]);
	}


for(int i:a)                       //It is Enhanced forloop(it works only on array and collections.we need to fetch all the elements)
	System.out.println(i);
	}

}

			                                       