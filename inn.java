package innerclass;

public class inn {

		void outerMethod()
		{ 
			
			System.out.println("inside outerMethod");
			class Inner{
				void innerMethod()
				{
					System.out.println("inside innerMethod");
				}
			}
			Inner y = new Inner();
		}
	class GFG {
		public static void main(String[] args) {
			inn x = new inn();
			x.outerMethod();
		}
		
			
	}	

	





	}


