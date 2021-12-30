import java.io.File;
import java.io.IOException;
class FileSample
{
	public static void main(String[] args)
	{
		File f = new File("gces.txt");
		File directory = new File("gces");

		directory.delete();

		if (f.exists()) {
			System.out.println("File exists");
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("File doesn't exists");
		}
	}
}