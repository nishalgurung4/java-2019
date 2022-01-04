import java.awt.Frame;
import java.awt.Button;
class FrameWithInheritance extends Frame
{
	public static void main(String[] args)
	{
		FrameWithInheritance fw = new FrameWithInheritance();
		Button button = new Button("Click Me!");
		button.setBounds(30,100,80,30);
		fw.add(button);

		fw.setSize(900, 900);
		fw.setLayout(null);
		fw.setVisible(true);
	}
}