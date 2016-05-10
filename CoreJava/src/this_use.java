
public class this_use {
	int a = 5 ;
	public void var(int a){
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int a = 5;
		this_use var_obj = new this_use();
		var_obj.var(10);
		
	}

}
