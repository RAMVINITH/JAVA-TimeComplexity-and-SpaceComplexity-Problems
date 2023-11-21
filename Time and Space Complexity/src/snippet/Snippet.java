package snippet;

public class Snippet {
	public static void quicksort(int a[],int si,int ei)
		{
			if(si>=ei)
				return;
			int pivotIndex=partition(a,si,ei);
	//		System.out.print(a[pivotIndex]+"->");
	//	    for(int i=0;i<a.length;i++)
	//	    	System.out.print(a[i]+" ");
	//	    System.out.println();
			quicksort(a,si,pivotIndex-1);
			quicksort(a,pivotIndex+1,ei);
		}
		public static int partition(int a[],int si,int ei)
		{
			int pivotElement=a[si];
			int smallcount=0;
			for(int i=si+1;i<=ei;i++)
			{
				if(a[i]<pivotElement)
					smallcount++;
			}
	//		System.out.println(smallcount);
			int temp=a[si+smallcount];
			a[si+smallcount]=a[si];
			a[si]=temp;
			int i=si;
			int j=ei;
			while(i<j)
			{
				if(a[i]<pivotElement)
					i++;
				else if(a[j]>=pivotElement)
					j--;
				else
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				}
			}
			return si+smallcount;
		}
}

