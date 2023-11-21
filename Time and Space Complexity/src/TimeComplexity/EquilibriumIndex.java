package TimeComplexity;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]= {8,2,0,5,3};
	    int EquIndex=FindEquilibriumIndex(arr);
	    if(EquIndex==-1)
	    	System.out.println("There is no EquiliriumIndex");
	    else
	    	System.out.println("Equilibirium Index is "+EquIndex);

	}
	static int FindEquilibriumIndex(int arr[])
	{
		int rightsum=0,leftsum=0,EquIndex=-1;
		for(int i=0;i<arr.length;i++)
			rightsum+=arr[i];
		for(int i=0;i<arr.length;i++)
		{
			rightsum-=arr[i];
			if(i>0)
				leftsum+=arr[i-1];
			if(rightsum==leftsum)
				EquIndex=i;	
		}
		return EquIndex;
	}

}
