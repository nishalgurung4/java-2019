class TryCatchDemo
{
	public static void main(String[] args)
	{
		TryCatchDemo tryCatchDemo = new TryCatchDemo();
		tryCatchDemo.test();
	}

	public String test()
	{
		int d, a;
		try {
		d = 0;
		a = 42 / d;
		System.out.println("The value of a =" + a);
		return "Inside try";
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return "Inside catch";
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally!!!");
		}
		
		System.out.println("Bye Bye");
		return "hi";
	}
}