public class Executing_Thread {

	public static void main(String[] args) {

			 //Thread1 t1 = new Thread1();
			 //t1.start();
			 
			 Runnable_Ex rex = new Runnable_Ex();
			    
			 Thread t = new Thread(rex);
			 t.start();

	}

}
