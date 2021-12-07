class LocalVariableDemo
{
	int a;
	public LocalVariableDemo()
	{
		boolean b=true; //inside method/constructor/block
		
		if (b) {
			int c=1;
			
		}
		System.out.println(c);
	}

	public void test()
	{
		
	}

	public static void main(String[] args)
	{
		LocalVariableDemo lvd = new LocalVariableDemo();

	}
}