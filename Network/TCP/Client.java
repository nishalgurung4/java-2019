import java.io.IOException;
import java.net.Socket;
import java.io.DataOutputStream;
class Client
{
	public static void main(String[] args) throws IOException
	{
		Socket s = new Socket("127.0.0.1", 6666);

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		dout.writeUTF("Hello!");
		dout.flush();
		dout.close();

		s.close();
	}
}