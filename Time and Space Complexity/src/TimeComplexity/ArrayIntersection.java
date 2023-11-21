package TimeComplexity;
import java.util.*;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextInt();
		
		FindIntersection(arr1,arr2);

	}
	public static void FindIntersection(int arr1[],int arr2[])
	{
		quicksort(arr1,0,arr1.length-1);
		quicksort(arr2,0,arr2.length-1);
//		for(int i=0;i<arr1.length;i++)
//			System.out.print(arr1[i]+" ");
//		System.out.println();
//		for(int i=0;i<arr2.length;i++)
//			System.out.print(arr2[i]+" ");
//		System.out.println();
		
		
		int i=0,j=0;
		System.out.print("Common Elements in both Arrays is -> ");
		
		while(i<arr1.length && j<arr2.length)
		{
//			System.out.println(arr1[i]+"......."+arr2[j]);
			if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr1[i])
				j++;
			else 
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			
		}	
	}
	public static void quicksort(int arr[],int si,int ei)
	{
		if(si>=ei)
			return;
		int pivotIndex=partition(arr,si,ei);
		quicksort(arr,si,pivotIndex-1);
		quicksort(arr,pivotIndex+1,ei);
	}
	public static int partition(int arr[],int si,int ei)
	{
		int pivotElement=arr[si];
		int smallcount=0;
		for(int i=si+1;i<=ei;i++)
		{
			if(arr[i]<pivotElement)
				smallcount++;
		}
		int temp=arr[si+smallcount];
		arr[si+smallcount]=arr[si];
		arr[si]=temp;
		
		int i=si,j=ei;
		while(i<j)
		{
			if(arr[i]<pivotElement)
				i++;
			else if(arr[j]>=pivotElement)
				j--;
			else
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return si+smallcount;
	}
}
