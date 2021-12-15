import java.io.IOException;
class ThrowsDemo
{
	public static void main(String[] args) throws IOException
	{
		ThrowsDemo throwsDemo = new ThrowsDemo();
		// try {
			throwsDemo.test("abc.jp");
		// } catch (Exception e) {
			// System.out.println(e.getMessage());
		// }
	}

	public void test(String fileName) throws IOException
	{

		throw new IOException("File not found");
	}
}