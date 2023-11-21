package TimeComplexity;

public class PairCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,2,2};
		int num=4;
		System.out.print(CountpairsEqualToNum(arr,num));

	}
	static int CountpairsEqualToNum(int arr[],int num)
	{
		 quicksort(arr,0,arr.length-1);
	         for(int i=0;i<arr.length;i++)
	             System.out.print(arr[i]+" ");
	         System.out.println();
	        int paircount=0,i=0,j=arr.length-1;
//	        System.out.println("j"+j);
	        while(i<j)
	        {
	            // System.out.print(i+" "+j);
	            if(arr[i]+arr[j]<num)
	                i++;
	            else if(arr[i]+arr[j]>num)
	                j--;
	            else
	            {
	                if(arr[i]==arr[j])
	                {
	                    int count=(j-i)+1;
	                    count=((count)*(count-1))/2;
	                    paircount+=count;
	                    i=i+(count-2);
	                }
	                else
	                {
	                int x=1,y=1;
	                while(arr[i]==arr[i+1] && i<j)
	                {
	                    // System.out.print(i+" ");
	                    i++;
	                    x++;
	                    
	                }
	                while(arr[j]==arr[j-1] && i<j)
	                {
	                    j--;
	                    y++;
	                }
	                i++;
	                j--;
	                paircount=paircount+x*y;
	                }
	            }
	        }
	        return paircount;    
	}
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
