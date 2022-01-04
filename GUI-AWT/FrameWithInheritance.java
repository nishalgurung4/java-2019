import java.awt.Frame;
import java.awt.Button;
class FrameWithInheritance extends Frame
{
	public FrameWithInheritance()
	{
		Button button = new Button("Click Me!");
		button.setBounds(30,100,80,30);
		add(button);

		setSize(900, 900);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new FrameWithInheritance();
		
	}
}