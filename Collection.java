package Collections_frame_work;
import java.io.*;
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4};
		Vector <Integer> v= new Vector();
		Hashtable<Integer,String> h= new Hashtable();
		v.addElement(1);
		v.addElement(2);
		h.put(1, "Hello");
		h.put(2,"World");
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}

}
