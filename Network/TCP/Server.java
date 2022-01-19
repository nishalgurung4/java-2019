import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
class Server
{
	public static void main(String[] args) throws IOException
	{
		//Step1 : 
		ServerSocket ss = new ServerSocket(6666);

		//Step 2:
		Socket s = ss.accept();

		//Step 3: Read/Write
		
		DataInputStream dis = new DataInputStream(s.getInputStream());


		System.out.println("Message from client: " + (String) dis.readUTF());

		ss.close();

	}
}