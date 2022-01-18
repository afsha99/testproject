package constructor;

public class ParaConst {
	String languages;
	ParaConst(String lang){
		languages = lang;
		System.out.println(languages +" Programing Language");
	}

	public static void main(String[] args) {
		
			ParaConst obj1 = new ParaConst("Java");
			ParaConst obj2 = new ParaConst("Python");
			ParaConst obj3 = new ParaConst("C");
	
		}

}
