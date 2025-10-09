package variableArgumentMethod;

public class P3 {
	public static void add(int... arr) {
		int sum = 0;
		for(int a : arr) {
			sum = sum + a;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		add();
		add(10,20,30);
		add(10,20,30,40,50);
	}
	
	public static void test(CharSequence... arg) {
		
	}

}
