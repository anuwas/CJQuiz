package q5;

public class test {
	public static void main(String args[]) 
	{
		 for(int i = 0; i < 3; i++) 
		{
			for(int j = 3; j >= 0; j--)
			{
			    if(i == j) break;
			    System.out.println(i + " " + j);
			}
		    }
	 	}
}
