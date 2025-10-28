package Day4;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accessing different package class 
				Base b = new Base();
				// private data members, methods are not accessible from Executor class even though both classes are in same package 
				b.methodDefault();
				b.methodProtected();
				b.methodPublic();
				

	}

}
