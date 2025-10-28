package Day1;

public class Typecasting {
	public static void main(String[] args) {
		// Implicit type casting
		int a = 30;
		float b = a;
		System.out.println(b);
		
		char c = 'A';
		int bb = c;
		System.out.println(bb);  // character type casting to int the result is ASCII Values
		
		// explicit type casting 
		
		double cc = 9.999515544521654;
		int dd = (int) cc;
		System.out.println(dd);

	}

}
