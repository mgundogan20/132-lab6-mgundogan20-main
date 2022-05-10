package main;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import computer.Computer;

public class ComputerStore extends JFrame{
	private ArrayList<Computer> computers;
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JTextField field;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final int TEXT_FIELD_WIDTH = 20;
	
	//Constructor for ComputerStore also initializes JFrame objects
	public ComputerStore() {
		computers = new ArrayList<Computer>();
		
		frame = new JFrame("my window");
		label = new JLabel();
		panel = new JPanel();
		field = new JTextField(TEXT_FIELD_WIDTH);

		field.addActionListener(new TextFieldHandler());
		label.setText("Please press Enter after you write the filter name (wearable or portable)");
		panel.add(label);
		panel.add(field);
		frame.add(panel);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public void listComputers() {
		for(Computer computer: computers) {
			System.out.println(computer);
		}
	}
	
	//TextFieldHandle handles events at the JTextField field
	private class TextFieldHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			listDev(field.getText());
			field.setText("");
		}
	}
	
	//listDev lists all the Computers according to the given keyword or displays an error message
	private void listDev(String keyword) {
		switch(keyword) {
		case "wearable":
			System.out.printf("Wearable computers:%n%n");
			for(Computer computer : computers) {
				if(computer.isWearable())
					System.out.println(computer);
			}
			break;
		case "portable":
			System.out.printf("Portable computers:%n%n");
			for(Computer computer : computers) {
				if(computer.isPortable())
					System.out.println(computer);
			}
			break;
		default:
			System.out.printf("Unknown command%n");
				
		}
		System.out.println();
	}
}












