package q1;

//************************************************************
//TelephonePanel.java
//
//Lays out a (functionless) GUI like a telephone keypad with a title.
//Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel {

	public TelephonePanel() {

		//set BorderLayout for this panel
		super(new BorderLayout());

		final int gridX = 3;
		final int gridY = 4;
		final int nums = 9;
		final int total = 12;
		final int star = 10;
		final int zero = 11;
		final int hash = 12;

		//create a JLabel with "Your Telephone" title
		JLabel label = new JLabel("Your Telephone");

		//add title label to north of this panel
		JPanel labelPanel = new JPanel();
		labelPanel.add(label);
		add(labelPanel, BorderLayout.NORTH);

		//create panel to hold keypad and give it a 4x3 GridLayout
		JPanel buttons = new JPanel(new GridLayout(gridY, gridX));

		//add buttons representing keys to key panel
		for (int i = 1; i <= total; ++i) {
			if (i <= nums) {
				buttons.add(new JButton("" + i));
			} else {
				switch(i) {
				case star: 
					buttons.add(new JButton("*"));
					break;
				case zero:
					buttons.add(new JButton("0"));
					break;
				case hash:
					buttons.add(new JButton("#"));
					break;
				}
			}
		}

		//add key panel to center of this panel
		add(buttons, BorderLayout.CENTER);
	}
}