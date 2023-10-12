package College;

public class Model {

	public static void main(String[] args) 
	{
		Car c1 = new Car();
		
		System.out.println("The Model of Car is : "+ c1.Model);
		System.out.println("The Price of Car is : "+ c1.Price);
		
		c1.start();
		c1.stop();
		c1.move();
		
		Driver d1 = new Driver();
		
		System.out.println("The Name of Driver is : "+ d1.Name);
		System.out.println("The Age of Driver is : "+ d1.Age);
		d1.drive();
		
		
		
		
		
		
		

	}

}
