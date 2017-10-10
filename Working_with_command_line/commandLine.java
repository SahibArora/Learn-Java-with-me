// this will teach us about command line arguments (when we pass something when we execute the code, are the runtime arguments.
// for eg. I run this program 1. javac commanLine and then 2. java commandLine hello, this is sahib.)  hello, this is sahib. are my 4 runtime arguments 

class commandLine
{
	public static void main(String[] args)              // here string args is our hidden guy, storing all the run time arguments in an array
	{
		System.out.println("Lets play with command line arguments!!");   
		int count = args.length;       // here we found, how many run time (command line) arguments are given
		String s = " ";               // declaring a string s to show our run time arguments.
		for(int i = 0; i < count; i++)
		{
			s = s + ' ' + args[i];
			System.out.println(i+1 + " is " + args[i]);               // displaying our arguments one after the other.
		}
		System.out.println("All Arguments in one line: " + s);
		System.out.println("Finished, all arguments displayed");
		
	}
} 