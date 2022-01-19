import java.io.IOException;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
class Client
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket();

		String msg = "Hello Server";

		byte[] msgByte = msg.getBytes();

		InetAddress address = InetAddress.getLocalHost();

		DatagramPacket dp = new DatagramPacket(msgByte, msgByte.length, address, 9999);

		ds.send(dp);

		ds.close();	
	}
}