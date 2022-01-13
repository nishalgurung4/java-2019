import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
public class FontMetricsDemo extends Applet
{
	public void paint(Graphics g)
	{
		Font font = g.getFont();
		
		//font metrics
        FontMetrics fm = getFontMetrics(font);
        g.drawString("Ascent Value : " + fm.getAscent(), 20, 80);
        g.drawString("Descent Value : " + fm.getDescent(), 20, 100);
        g.drawString("Leading Value : " + fm.getLeading(), 20, 120);
        g.drawString("Height Value : " + fm.getHeight(), 20, 140);
		
	}

}

