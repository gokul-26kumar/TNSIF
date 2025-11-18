package Generic;

public class GenericClass <E>
{
	E data;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
public class GenericTestClass {

	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<String>();
		obj.setData("hello");
		System.out.println(obj);
		//obj.setData(10);
		//obj.setData(12.3f);
		
		GenericClass<Integer> obj1 = new GenericClass<Integer>();
		obj1.setData(10);
		System.out.println(obj1);

	}

}
}