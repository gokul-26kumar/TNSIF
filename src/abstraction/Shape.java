package abstraction;

abstract class Shape {
	protected float area;
	abstract void callArea();
	void show()
	{
		System.out.println("Area of the shape"+area);
	}

}
