package javaConcepts;

import java.util.HashSet;
import java.util.Set;

public class P01_PracticeSet1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Vivek");
		set.add("Sheela");
		set.add("Teena");
		
		for(String name : set) {
			System.out.println(name);
		}
	}
}
