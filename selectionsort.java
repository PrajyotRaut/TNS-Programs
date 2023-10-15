public class selectionsort 
{
	public static void main(String[] args) 
	{
		int a[] = {45,98,79,65,40};
		
		sortArray(a);
		
		System.out.println("The Sorted Array Is : ");
		
		printArray(a);	
	}

	static void sortArray(int a[])
	{
		int len = a.length;
		
		for(int i = 0; i<len-1; i++)
		{
			int min = i;
			
			for(int j = i+1; j<len; j++)
			{
				if(a[j] < a[min])
					
					min = j;
				
				int temp = a[min];
				
				a[min] = a[i];
				
				a[i] = temp;	
			}	
		}
	}
		
	static void printArray(int a[])
	{
		int len = a.length;
		
		for(int i = 0; i<len; i++)
			
			System.out.print(a[i] + " ");
		
		System.out.println();	
	}	
}
