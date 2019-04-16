package q8;

public class Test {
	public static void main(String [] args)
	{
		//Compilation error for this line
		//new thread(new Test()).start();
	}
	public void run(Thread t)
	{
	System.out.println("Running...");
	}
	
}
