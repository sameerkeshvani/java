import java.io.*;
abstract class shape
{
	abstract void area(int r, int h);
	//abstract void volume();
}
class cone extends shape
{
	void area(int r, int h)
	{
		float area = (3.14f*r*h)+(3.14f*r*r);
		System.out.println("Area of cone: "+area);
	}
	void cyarea(int r, int h)
	{
		float area = (2*3.14f*r*h)+(2*3.14f*r*r);
		System.out.println("Area of Cylinder: "+area);
	}
}
class cylinder extends shape
{
	class c extends cone
	{
	void cyarea()
	{
	super.cyarea(int r, int h);
}
	}
}
class slip3_b
{
	public static void main(String arg[]) throws Exception
	{
		cone c1 = new c();
		c1.area(2,2);

	}
}