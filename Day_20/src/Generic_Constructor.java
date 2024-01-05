public class Generic_Constructor 
{		
		private double v;
		
		public <T extends Number> Generic_Constructor(T t)
		{
			v = t.doubleValue();	
		}
		
		void show() 
		{
			System.out.println("Value of v in double type is :" +v);
		}

}
