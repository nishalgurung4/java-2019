import java.io.IOException;
import java.io.FileReader;
class FileReaderSample
{
	public static void main(String[] args)
	{
		try {
			FileReader fr = new FileReader("filewriter.txt");
			int a = fr.read(); 
			while(a != -1) {
				System.out.println((char) a);
				a = fr.read();
			}
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}