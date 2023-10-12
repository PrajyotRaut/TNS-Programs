package Default;

public class Person 
{
	private String pname;
	private int income;
	private float tax;
	private String pemail;
	
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	public int getIncome() 
	{
		return income;
	}
	public void setIncome(int income) 
	{
		this.income = income;
	}
	public float getTax() 
	{
		return tax;
	}
	public void setTax(float tax) 
	{
		this.tax = tax;
	}
	public String getPemail() 
	{
		return pemail;
	}
	public void setPemail(String pemail) 
	{
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", income=" + income + ", tax=" + tax + ", pemail=" + pemail + "]";
	}
	
	

}
