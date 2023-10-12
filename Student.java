package Default;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person() ;
		p1.setIncome(10000);
		p1.setPemail("prajyotraut");
		p1.setPname("Prajyot");
		p1.setTax(2.0f);

		String s  = p1.toString();
		System.out.println(s);

		

	}

}
