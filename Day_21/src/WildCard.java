import java.util.*;

public class WildCard 
{
	public void showData(List<? extends Number> al)
	{
		for(Object o : al)
		{
			double k = ((Number) o).doubleValue();
			System.out.println(k*k);		
		}
	}
}