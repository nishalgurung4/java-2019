import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
public class FontInformation extends Applet
{
	public void paint(Graphics g)
	{
		Font font = new Font("Sans Serif", Font.BOLD + Font.ITALIC, 18);
		g.setFont(font);
		
		// Font f = g.getFont();
		//font methods
		System.out.println("Family = " + font.getFamily());
		System.out.println("Size = " + font.getSize());
		System.out.println("Name = " + font.getName());
		System.out.println("isItalic? " + font.isItalic());
		System.out.println("isBold? " + font.isBold());
		System.out.println("isPlain? " + font.isPlain());
		System.out.println("Style = " + font.getStyle());


		
		g.drawString("Hello World", 20, 50);

	}

}

