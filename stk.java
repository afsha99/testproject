package stack;
import java.util.*;
public class stk {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Green");
		stack.push(" World");
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"");
		}
		System.out.println();
		stack.pop();
		itr=stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+"");
		}
		
		


	}

}
