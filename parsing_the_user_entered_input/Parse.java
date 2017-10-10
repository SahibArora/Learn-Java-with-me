// in this program we are going to learn how we can get input at runtime and parse it according to the need;

import java.io.*;

class Parse
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Parsing of integer values...");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a,b,c;
			System.out.print("Enter the 1st value: ");
			a = Integer.parseInt(br.readLine());                     // this is the function which parses the string into integer.
			System.out.print("Enter the 2nd value: ");
			b = Integer.parseInt(br.readLine());			// this is the function which parses the string into integer.
			c = a + b;
			System.out.println("Sum of " + a + " + " + b + " = " + c);	
			
			System.out.println("Parsing of float values...");
			
			float a1,b1,c1;
			System.out.print("Enter the 1st value: ");
			a1 = Float.parseFloat(br.readLine());					// this is the function which parses the string into float.
			System.out.print("Enter the 2nd value: ");
			b1 = Float.parseFloat(br.readLine());					// this is the function which parses the string into float.
			c1 = a1 + b1;
			System.out.println("Sum of " + a1 + " + " + b1 + " = " + c1);	
			
			System.out.println("Parsing of double values...");
			
			double a2,b2,c2;
			System.out.print("Enter the 1st value: ");
			a2 = Double.parseDouble(br.readLine()); 					// this is the function which parses the string into double.
			System.out.print("Enter the 2nd value: ");
			b2 = Double.parseDouble(br.readLine());						//// this is the function which parses the string into double.
			c2 = a2 + b2;
			System.out.println("Sum of " + a2 + " + " + b2 + " = " + c2);
		}
		catch(Exception e)
		{
			System.out.println("Error!!!!!!");
		}
	}
}