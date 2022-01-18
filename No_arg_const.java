package constructor;

public class No_arg_const {
	int i;
	private No_arg_const() {
		i=5;
		System.out.println("Constructor is called");
	}

	public static void main(String[] args) {
		No_arg_const obj=new No_arg_const();
		System.out.println("Value of i:"+obj.i);

	}

}
