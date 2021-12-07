class StaticDemo
{
	static int counter=0;
	int count;

	public void increment()
	{
		counter++;
	}

	public static int getCounter()
	{
		count++;
		//staticMethod();
		//nonStaticMethod();
		// this.nonStaticMethod();
		return counter;
	}

	public static void staticMethod()
	{
		System.out.println("Static Method");
	}

	public void nonStaticMethod()
	{
		System.out.println("Non - Static Method");
	}

	public static void main(String[] args)
	{
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		obj1.increment();
		System.out.println(StaticDemo.getCounter());
		obj2.increment();
		System.out.println(StaticDemo.getCounter());
	}
}