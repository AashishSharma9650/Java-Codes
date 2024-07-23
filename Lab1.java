	// --> Q 1 .

   class Object  // create 4 member variables
	  {
	String cdname;
	String cdunit;
	int cdage;
	int cdrgnum;

	public void show()  // method for show the values
	  {
	System.out.println(cdname+" "+cdunit+" "+cdage+" "+cdrgnum);
	}

	Object() // default constructor
	  {
	cdname="aashish";
	cdunit="asam";
	cdage= 23;
	cdrgnum=10;
	}
	Object(String a,String b,int c, int d)  // parametarized constructor.
	  {
	cdname=a;
	cdunit=b;
	cdage=c;
	cdrgnum=d;
	}
}
	
	class Lab1	// create main class 
	  {
	public static void main (String args[])
	  {
	Object d1 = new Object();	// object creation for call the method and paremetarized constructor.
	Object ob1 = new Object();
	ob1.show();
	Object ob2 = new Object();
	Object ob3 = new Object("ankit","madras",25,11);
	ob3.show();
	}	
}

--------------------------------------------------------------------------------------------------------------------------------------------------------
// ----> Q 2.
	public class Exampleset 
{
	
		private  String oname;  // create two member variables.
		private int omember;

		public void call()	// print them here through method call.
		{
			System.out.println(oname);
			System.out.println(omember);
		}
		public Exampleset() 	// create deafult constructor and assign them values personally.
		{
			this.oname = "eagle sword";
			this.omember =18;
			System.out.println(oname+"\n "+omember);
		}
		public Exampleset(String oname, int omember)   // create the seter and geter method for encapsulation and abstraction.
		{
			this.oname = oname;
			this.omember = omember;
		}
		public void setoname(String a) 
		{								
			oname=a;
		}	
		public void setomember(int b)
		{
			omember=b;
		}
		public String getoname()	
		{
			return oname;
		}
		public int getomember()
		{
			return omember;
		}
}
	// create a main class

	public class Main2 

	{
		public static void main(String args[])
		{
		Exampleset e1= new Exampleset("vijay",10);	// pass the argument to the constructor
		e1.call();
		Exampleset ob2 = new Exampleset(); // set the values for the called seter method
		ob2.setoname("prahar");
		ob2.setomember(15);
		System.out.println(ob2.getoname());	// get the assigned value bt the help of geter methdo
		System.out.println(ob2.getomember());
		
		}
}
