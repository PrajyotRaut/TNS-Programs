
public class Array_Index 
{

	public static void main(String[] args) 
	{
		try {
            int[] arr = new int[5];
            int value = arr[11];
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}	
		