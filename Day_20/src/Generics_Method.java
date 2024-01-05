public class Generics_Method 
{
	public <D> void printData(D[] data) 
	{
		
		for (D data1 : data) 
		{
			System.out.println(data1);
		}
	}

}
