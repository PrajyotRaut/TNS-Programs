
public class Main_1 
{

	public static void main(String[] args) 
	{
        Student1[] students = new Student1[10];

        for (int i = 0; i < students.length; i++)
        {
            students[i] = new Student1();
            students[i].setInfo("Student " + (i+1), i+20, "Address " + (i+1));
            students[i].printInfo();
        }
    }
}
