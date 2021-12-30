import java.io.IOException;
import java.io.PrintWriter;
class PrintWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("filewriter.txt");
		//write() -> int, string ,  char[], string
		pw.write(100);
		// pw.write(true);
		// print() -> char, int, boolean, string, char[]
		pw.println(100); 
		pw.println(true);
		pw.println('c');
		pw.println("GCES");
		pw.flush();
		pw.close();

	}
}