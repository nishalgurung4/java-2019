import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class ActionEventOutsideClass extends Frame
{
	Button button;
	public ActionEventOutsideClass()
	{
		button = new Button("Click Me!");
		button.setBounds(30,100,80,30);
		add(button);

		button.addActionListener(new OutsideClass(this));

		setSize(900, 900);
		setLayout(null);
		setVisible(true);

	}

	public static void main(String[] args)
	{
		new ActionEventOutsideClass();
	}

	
}

class OutsideClass implements ActionListener
{
	ActionEventOutsideClass obj;
	public OutsideClass(ActionEventOutsideClass obj)
	{

		this.obj = obj;
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == obj.button) {
			obj.button.setVisible(false);
		}
		System.out.println(e);
	}
}