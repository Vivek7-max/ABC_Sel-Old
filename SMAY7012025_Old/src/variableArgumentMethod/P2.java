package variableArgumentMethod;

public class P2 {
	
	public static void add(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum = sum + a;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		add(new int[] {10,20,30});
		add(new int[] {10,20,30,40,50,60});
		add(new int[] {10,20,30,40,50,60,40,80,60,70,200});
	}

}
//after JDK 1.5
//VariableArgumentMethod