// here we will learn how to inherit classes.
// try writting in front of parent class and see what happens.
// Final will not allow you to inherit the class.
// you can use final in front of data member or member function, where ever you will use it, that data will not be transfered to the child class. 

import java.io.*;

class parent
{
	int length;
	int breadth;
	void getData()            // this function will prompt user to enter the values of length and breadth.
	{
		try
		{
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			System.out.print("Enter Length: ");
			length = Integer.parseInt(br.readLine());
			System.out.print("Enter Breadth: ");
			breadth = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Error !!!!");
		}
	}
	int area()             // this function will calculate the area and return it.
	{
		int area = length * breadth;
		return area;
	}
	
}
class child extends parent            // here this class is inheriting all the properties of parent class, all ts data members and member functions
{
	int height;
	int volume()                 // function which will calculate the volume and return it.
	{
		int area = area();
		int volume = area * height;
		return volume;
	}
}
class inherit
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			child c = new child();          // here I created an object of class child.
			c.getData();                  // here I called the member function of parent class through child class object because of inheritance.
			System.out.print("Enter the height: ");
			c.height = Integer.parseInt(br.readLine()); 
			int area = c.area();                // same here, called area() member function of parent class through child's object.
			System.out.println("Area = " + area);
			int volume = c.volume();                 
			System.out.println("Volume = " + volume);
			
		}
		catch(Exception e)
		{
			System.out.print("Error !!!!");
		}
	}
}