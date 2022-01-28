package java_project;

public class ThreadCreation {
		public void show() {
			for(int i=1 ; i<=5; i++) {
				System.out.println("ThreadCreation");
			   }
					
			}
		}
class Hello
{
	public void show()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);
			}
		
		catch(Exception e) {}
	}
}	
public class ThreadDemo{

	
	public static void main(String[] args) {
	ThreadCreation obj1=new ThreadCreation();
	Hello obj2= new Hello();
	
	obj1.show();
	obj2.show();
	

	}
}
}


	
