

public class ExceptionHandling {

	public static void main(String args[])
	{
		// TODO Auto-generated method stub

		boolean bool= false;
		try
		{
			int num1= Integer.parseInt(args[0]);
			int num2= Integer.parseInt(args[1]);
			int num3;
			num3=num1/num2;
			System.out.println("Value is..." +num3);
			
		}
		 catch(Exception e)
		{
			  bool=true;
			  e.printStackTrace();
		}
		finally
		{
			if(bool)
			{
				return;
			}
			System.out.println("Application continues");
		}
	}

}
