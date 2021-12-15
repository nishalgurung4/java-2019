class ThrowDemo
{
	public static void main(String[] args)
	{
		ThrowDemo throwDemo = new ThrowDemo();
		try {
			throwDemo.test(5);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	public void test(int a)
	{
		if (a < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		System.out.println("Inside test");
	}
}