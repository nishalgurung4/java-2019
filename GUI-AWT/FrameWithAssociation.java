import java.awt.Button;
import java.awt.Frame;
class FrameWithAssociation
{
	public FrameWithAssociation()
	{
		Frame frame = new Frame("This is frame title");
		Button button = new Button("Click Me!");
		button.setBounds(30,100,80,30);  
		frame.setSize(900, 900);
		frame.add(button);

		frame.setLayout(null);
		frame.setVisible(true);

	}
	public static void main(String[] args)
	{
		new FrameWithAssociation();
	}

}