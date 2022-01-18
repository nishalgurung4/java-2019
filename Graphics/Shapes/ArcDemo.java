import java.awt.Frame;
import java.awt.Graphics;
class ArcDemo extends Frame
{
	public ArcDemo()
	{
		super("Drawing Arc");
		setSize(900, 1000);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		//drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)

		// clockwise sweep ---> negative angle
		g.drawArc(115, 135, 80, 80, 0, -110);

		// anti clockwise --> positive angle
		g.fillArc(15, 35, 80, 80, 0, 110);
	}

	public static void main(String[] args)
	{
		new ArcDemo();
	}

}