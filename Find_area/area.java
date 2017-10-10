// finding area

class data                               // its a class containing the data members and member functions
{
	int length;
	int breadth;                     // data members
	void getData(int l,int b)			// member function		
	{
		length = l;
		breadth = b;
	}
}
class area                 // main class
{
	public static void main(String[] args) 
	{
		data d = new data();          // making the object of data class and giving it memory dynamically 
		d.getData(10,20);             // calling the function of data class through its object.
		int area = d.length * d.breadth;
		System.out.println("Area of given Data is: " + area);      // printing output on screen through this funcion.  
	}
}