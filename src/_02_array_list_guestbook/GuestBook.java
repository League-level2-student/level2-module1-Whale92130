package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame("GuestBook");
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	JPanel panel = new JPanel();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook g = new GuestBook();
		g.run();
	}

	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == button1) {
			names.add(JOptionPane.showInputDialog("Insert Name."));
		}
		if (arg0.getSource() == button2) {
			String listOfNames = "";
			for (int o = 0; o < names.size(); o++) {
				int num = o+1;
				listOfNames += "Guest #" + num + ": " + names.get(o) + "\n";
				
			}
			JOptionPane.showMessageDialog(null, listOfNames);
		}
	}

}
