// we should not give a class as static as they are common for all the functions/Methods in whole Java.
// Thats y we wn't be giving static in class name, we will be using public class classname.
public class static_Block {

//First block which gets executed before the main function is static block.
// Lets verify
	static{
		System.out.println("Static block is exectued first");
	}
	
// we can have only nested static class i.e class inside a class
	public static class str{
		int a = 5;
		public void string(){
			System.out.println("Static function inside a static class");
		}		
	}

// Creating a static function inside a non-static class
	static void foo(){
		System.out.println("Static function inside a non-static class");
	}

// Instance initialization block : Block which executes before the constructor. This block gets executed 
// as soon as the instance is created.
	{
		System.out.println("Instance block created");
	}
	
// Constructor created
	static_Block(){
		System.out.println("Constructor created");
		
	}
	
	
// Main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main function");
		//Creating object for a non-static class
		static_Block sblk = new static_Block();
		//Creating object for a static class
		static_Block.str str_obj = new static_Block.str();
		// calling a function available in the class using an object generated warning.
		// we should call a static class using the name of the class the static function is in.
		sblk.foo();//created warning...not advisable
		static_Block.foo();// correct way of calling a static function
		// Calling a function available in the static class
		str_obj.string();
		
	}

}
