package methods;

public class Methods {
	int m1() {
		System.out.println("method m1");
		return 20;
	}
     float m2() {
    	 System.out.println("method m2");
    	 return 30f;
     }
     static char m3() {
     System.out.println("methood m3");
     return 'a';
     }
    
	public static void main(String[] args) {
		Methods m= new Methods();
		int x=m.m1();
		float y=m.m2();
		char ch= Methods.m3();
		System.out.println("Return value of m3()=" +ch);
		
		

	}

}
