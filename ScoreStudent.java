package First_Package;

public class ScoreStudent 
{
	int finalscore;
	Student s1 = new Student();
	
	public void getScore() 
	{
		s1.setUid(100);
	    s1.setSname("Prajyot");
	    finalscore=87;

	    System.out.println(s1.toString() + " and score is " + finalscore);
	}
}
