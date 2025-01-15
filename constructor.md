package constructor;

 class construct {
	construct()
	{
		System.out.println(" construct called");
	}
}
class constructor1 extends construct {
	constructor1()
	{
		System.out.println(" constructor1 called");
	}
}
	class constructor2 extends constructor1 {
		constructor2()
		{
			System.out.println(" constructor2 called");
		}
	}


	class constructor {
	public static void main(String[] args) {
		constructor2 c2= new constructor2();
		constructor1 c1=new constructor1();
		construct c= new construct();
			}
	}


o/p

 construct called
 constructor1 called
 constructor2 called
 construct called
 constructor1 called
 construct called

