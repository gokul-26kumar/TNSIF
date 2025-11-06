package Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
		List list1=new ArrayList();
		list1.add(10);
		list1.add(200);
		list1.add(true);
		list1.add(false);
		list1.add("Hello");
		System.out.println("List is"+list1);
		System.out.println("List is"+list1.contains(15));
		list1.remove(false);
		System.out.println("List is"+list1);
		 
		
	}

}
