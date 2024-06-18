import java.io.*;
class circle
{
	void area(int r)
	{
		float a = 3.14f * r *r;
		System.out.println("Area of circle is "+a);
	}
}
class triangle extends circle
{
	void area(int b, int h)
	{
		int a = (b*h)/2;
		System.out.println("Area of triangle is "+a);
	}
}
class rectangle
{
	void rarea(int l, int w)
	{
		int a = l*w;
		System.out.println("Area of rectangle is "+a);
	}
}
class slip18_a
{
	public static void main(String arg[]) throws Exception
	{
		circle c = new circle();
		c.area(5);
		triangle t = new triangle();
		t.area(5,5);
		rectangle r = new rectangle();
		r.rarea(5,5);
	}
}
