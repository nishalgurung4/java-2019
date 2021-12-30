import java.io.IOException;
import java.io.FileWriter;
class FileWriterSample
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("filewriter.txt", true);
		File f = new File("file_filewriter.txt");

		FileWriter fwf = new FileWriter(f, true);
		
		fw.write("Filewriter PU");
		fw.write("\n");
		fw.flush();
		fw.close();
	}
}