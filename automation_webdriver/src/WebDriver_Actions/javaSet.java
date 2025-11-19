package WebDriver_Actions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class javaSet {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		System.out.println("size of set " + s.size());

		s.add("London");
		s.add("Delhi");
		s.add("Pune");
		s.add("Delhi");
		s.add("Nagpur");

		System.out.println("size of set " + s.size());

		Iterator<String> it = s.iterator();

//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

		while (it.hasNext()) { // check set/iterator holds the value or not
			
			System.out.println("values "+ it.next()); // returns the value

		}

	}

}
