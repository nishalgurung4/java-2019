import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class ActionEventWithinClass extends Frame implements ActionListener
{
	Button button;
	public ActionEventWithinClass()
	{
		button = new Button("Click Me!");
		button.setBounds(30,100,80,30);
		add(button);

		button.addActionListener(this);

		setSize(900, 900);
		setLayout(null);
		setVisible(true);

	}

	public static void main(String[] args)
	{
		new ActionEventWithinClass();
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button) {
			button.setVisible(false);
		}
		System.out.println(e);
	}
}