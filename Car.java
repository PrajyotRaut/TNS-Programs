public class Car 
{
	private int year;
	private String make;
	private double speed;
	
	public Car(int year, String make, double speed)
	{
		this.year = year;
		this.make = make;
		this.speed = speed;
	}

	public int getYear() 
	{
		return year;
	}

	public String getMake() 
	{
		return make;
	}

	public double getSpeed() 
	{
		return speed;
	}
	
	public static void main(String[] args)
	{
		Car c1 = new Car(2015,"Honda",85.0);
		System.out.println("The year of car is : " + c1.year);
		System.out.println("The make of car is : " + c1.make);
		System.out.println("The speed of car is : " + c1.speed);
		
		c1.getYear();
		c1.getMake();
		c1.getSpeed();
	}

	

}
