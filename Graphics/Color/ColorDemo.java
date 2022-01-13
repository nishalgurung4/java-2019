import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class ColorDemo extends Applet
{
	public void paint(Graphics g) 
	{
		/*
		//constructor
		1. Color(int red, int green, int blue);

		2. Color (int rgbValue);

		3. Color(float red, float green, float blue)
		 */
		Color red = new Color(255, 0, 0);


		System.out.println(red.getRed());

		//methods of Color
		/*
		1. int getRed();
		2. int getGreen();
		3. int getBlue();
		 */

		g.setColor(red);

		g.drawString("Hello World", 20, 50);

		g.setColor(Color.BLUE);

		g.drawString("Hello World", 50, 90);

		System.out.println(g.getColor().getRed());


	}
		
}