public class Runnable_Ex implements Runnable
{
	@Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
