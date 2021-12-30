import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("filewriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a', 'b', 'c', 'd'};
		bw.write(ch);
		// bw.write(true);
		bw.newLine();
		bw.write("GCES");
		bw.newLine();
		bw.write("Software");
		bw.flush();
		bw.close(); //it automatically close internal FileWriter
	}
}