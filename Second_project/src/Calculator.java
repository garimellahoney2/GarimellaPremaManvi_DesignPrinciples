

public class Calculator {

	Log l = new Log();
	
	float ans = 0;
	public void division(int a,int b) {
		
		
		try
		{
			ans = a/b;
			System.out.println("result is:"+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			l.printing(a, b,"division");
			//logging this exception 
		}
	}
   public void multiplication(int a,int b)
   {
       try
		{
			ans = a*b;
			System.out.println("result is:"+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			l.printing(a, b,"multiplication");
			//logging this exception 
		} 
   }
   public void addition(int a,int b)
   {
       try
		{
			ans = a+b;
			System.out.println("result is:"+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			l.printing(a, b,"addition");
			//logging this exception 
		} 
   }
   public void subtraction(int a,int b)
   {
       try
		{
			ans = a-b;
			System.out.println("result is:"+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			l.printing(a, b,"subtraction");
			//logging this exception 
		} 
   }
}
