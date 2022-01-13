import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
class BorderLayoutDemo extends JFrame
{
	public BorderLayoutDemo()
	{
		JButton northBtn, southBtn, eastBtn, westBtn, centerBtn;

		northBtn = new JButton("NORTH");
		southBtn = new JButton("South");
		eastBtn = new JButton("East");
		westBtn = new JButton("West");
		centerBtn = new JButton("Center");

		add(northBtn, BorderLayout.NORTH);
		add(southBtn, BorderLayout.SOUTH);
		add(eastBtn, BorderLayout.EAST);
		add(westBtn, BorderLayout.WEST);
		add(centerBtn, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);

		setLayout(new BorderLayout(10, 15)); //BorderLayout is default Layout 

	}

	public static void main(String[] args)
	{
		new BorderLayoutDemo();
	}

}