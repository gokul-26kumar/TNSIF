package Days;

public class MyClass {
	
	private static MyClass obj = new MyClass();
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public MyClass()
	{
		System.out.println("MyClass object is created");
	}


}
