import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter expression");
		Calculator c = new Calculator();
		String expression = sc.nextLine();
		
		int a,b;
		if(expression.contains("/"))
		{
			String[] arr = expression.split("\\/");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			c.division(a, b);
		}
		else if(expression.contains("+"))
		{
			String[] arr = expression.split("\\+");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			c.addition(a, b);
		}
		else if(expression.contains("-"))
		{
			String[] arr = expression.split("\\-");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			c.subtraction(a, b);
		}
		else if(expression.contains("*"))
		{
			String[] arr = expression.split("\\*");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			c.multiplication(a, b);
		}
		sc.close();
	}

}
