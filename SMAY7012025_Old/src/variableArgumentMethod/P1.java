package variableArgumentMethod;

public class P1 {
	
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum: "+sum);
	}
	
	public static void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum: "+sum);
	}
	public static void add(int a, int b, int c, int d) {
		int sum = a+b+c+d;
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String[] args) {
		add(30,50);
		add(40,50,60);
		add(10,20,30,40);

	}

}
