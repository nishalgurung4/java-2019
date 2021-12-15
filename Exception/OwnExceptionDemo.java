//Creating own Exception subclass
class MyException extends Exception
{
	private int detail;

	MyException(int detail, String errorMessage)
	{
		super(errorMessage);
		this.detail = detail;
	}

	public String toString()
	{
		return "MyException [" + detail + "]";
	}

}

class OwnExceptionDemo
{
	public static void main(String[] args) //throws MyException
	{
		OwnExceptionDemo ownExceptionDemo = new OwnExceptionDemo();
		
		try {
			ownExceptionDemo.test();

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void test() throws MyException
	{
		throw new MyException(404, "My Exception message");
	}
}