
public class Executor 
{

	public static void main(String[] args) 
	{
		Phone p1 = Phone_Factory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = Phone_Factory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}

}
