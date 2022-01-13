import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
class GridLayoutDemo extends JFrame
{
	public GridLayoutDemo()
	{
		JButton firstBtn, secondBtn, thirdBtn, fourthBtn;

		firstBtn = new JButton("First");
		secondBtn = new JButton("Second");
		thirdBtn = new JButton("Third");
		fourthBtn = new JButton("Fourth");

		add(firstBtn);
		add(secondBtn);
		add(thirdBtn);
		add(fourthBtn);

		setSize(900, 900);
		setVisible(true);

		setLayout(new GridLayout(2, 1));
	}

	public static void main(String[] args)
	{
		new GridLayoutDemo();
	}

}