import java.net.InetAddress;
class InetAddressDemo
{
	public static void main(String[] args)
	{
		try {
			InetAddress inetAddress = InetAddress.getByName("www.nishalgurung.name.np");

			System.out.println("Host Name: " + inetAddress.getHostName());
			System.out.println("IP address: " + inetAddress.getHostAddress());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}