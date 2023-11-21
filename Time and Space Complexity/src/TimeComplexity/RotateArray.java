package TimeComplexity;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int numberOfRotation=3;
		
//		rotateArray1(arr,numberOfRotation);
//		System.out.println("method1");
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
		
//		rotateArray2(arr,numberOfRotation);
//		System.out.println("method2");
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
		
		rotateArray3(arr,numberOfRotation);
		System.out.println("method3");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void rotateArray1(int arr[],int nor)
	{
		while(nor>0)
		{
			int temp=arr[0];
			for(int i=1;i<arr.length;i++)
				arr[i-1]=arr[i];
			arr[arr.length-1]=temp;
			nor--;
		}
	}
	public static void rotateArray2(int arr[],int nor)
	{
		int temp[]=new int[nor];
		for(int i=0;i<nor;i++)
			temp[i]=arr[i];
		for(int i=nor;i<arr.length;i++)
			arr[i-nor]=arr[i];
		int t=0;
		for(int i=arr.length-nor;i<arr.length;i++)
			arr[i]=temp[t++];
	}
	public static void rotateArray3(int arr[],int nor)
	{
		int i=0,j=arr.length-1,temp=0;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=0;
		j=(arr.length-1)-nor;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		i=arr.length-nor;
		j=arr.length-1;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	}

}
