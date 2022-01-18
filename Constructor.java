package constructor;

public class Constructor {
	private String name;
	Constructor()
	{
		System.out.println("Constructor called:");
		name="Program";
	}
	public static void main(String[] args) {
Constructor obj = new Constructor();
System.out.println("The name is"+ obj.name);


	}

}
