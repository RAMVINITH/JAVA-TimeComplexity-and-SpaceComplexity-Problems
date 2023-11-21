package TimeComplexity;

public class FindUnqiueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,3,2,4,7};
		System.out.println("Unique Element in the array is "+UniqueElement(arr));
	}
	static int UniqueElement(int arr[])
	{
		int UniElement=0;
		for(int i=0;i<arr.length;i++)
			UniElement=UniElement^arr[i];
		return UniElement;
	}

}
