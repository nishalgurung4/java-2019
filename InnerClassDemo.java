class Outer
{
	private void outerMethod()
	{
		System.out.println("outerMethod");
	}

	public void test()
	{
		Inner inner = new Inner();
		inner.innerMethod();
	}


	public class Inner
	{
		void innerMethod()
		{
			System.out.println("Inner Method");
			outerMethod();
		}
	}
	
}

class InnerClassDemo
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		outer.test();
	}
}