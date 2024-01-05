public class Generic_Class_Demo 
{

	public static void main(String[] args) 
	{
		Generic_Class<String> stringObj=new Generic_Class<String>();
		stringObj.set("Hello World");
		System.out.println(stringObj.get());

		//GenericClass with Integer type of data member
		Generic_Class<Integer> integerObj=new Generic_Class<Integer>();
		integerObj.set(50);
		System.out.println(integerObj.get());

	}

}
