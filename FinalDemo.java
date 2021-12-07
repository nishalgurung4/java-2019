class FinalDemo
{
	final int PI;

	public FinalDemo()
	{
		PI = 1;
	}

	public void increment()
	{
		System.out.println("PI = " + PI);
	}
	
	public static void main(String[] args)
	{
		FinalDemo obj = new FinalDemo();
		obj.increment();
	}


}