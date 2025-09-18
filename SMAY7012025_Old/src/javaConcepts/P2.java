package javaConcepts;

import java.util.HashSet;
import java.util.Set;

class Cookies{
	
	public String test() {
		return "Hi";
	}
}

public class P2 {
	public static void main(String[] args) {
		Set<Cookies> set = new HashSet<Cookies>();		
		set.add(new Cookies());
		set.add(new Cookies());
		set.add(new Cookies());
		
		for(Cookies c : set) {
			System.out.println(c);
		}
		
	}
}
