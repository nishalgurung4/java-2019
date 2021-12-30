import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
class BufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("filewriter.txt"));
		String line = br.readLine();
		while (line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}