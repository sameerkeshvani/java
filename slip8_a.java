import java.io.*;
interface shape
{
	abstract void area();
}
final class circle implements shape
{
	int r;
	circle(int r)
	{
		this.r = r;
	}
	public void area()
	{
		double area = 3.14*r*r;
		System.out.println("Area of circle: "+area);
	}
}
final class sphere implements shape
{
	int r;
	sphere(int r)
	{
		this.r = r;
	}
	public void area()
	{
		double area = 4*3.14*r*r;
		System.out.println("Area of sphere: "+area);
	}
}
class slip8_a
{
	public static void main(String arg[]) throws Exception
	{
		circle c = new circle(5);
		c.area();
		sphere s = new sphere(10);
		s.area();
	}
}