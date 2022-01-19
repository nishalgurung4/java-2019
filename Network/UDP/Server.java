import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
class Server
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket(9999);

		//assigning meessage into th empty byte array
		
		byte[] emptyByte = new byte[1024];


		DatagramPacket dp = new DatagramPacket(emptyByte, emptyByte.length);

		ds.receive(dp);

		System.out.println("Message : " + new String(dp.getData(), 0, dp.getLength()));

		ds.close();
	}
}