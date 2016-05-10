import Package1.Sample1;

public class Sample_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reading from other sub-source folders with different package names in the same project
		Sample1 obj = new Sample1();
		System.out.println("Variable for another source folder :"+obj.a);
		// Reading from other sub-source folders with same package names in the same project
		sample1 obj1 = new sample1();
		System.out.println("Variable for another source folder :"+obj1.a);
		//Accessing class variables from other source folders of different project
		System.out.println(Handling_Strings.str);
		

	}

}
