package org.irosier.myswing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayGrid extends JFrame {
	
	public DisplayGrid(int width, int height) {
		super();
		JLabel jb = new JLabel("hello");
		this.setLayout(new GridLayout(width, height));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for(int i=0; i<100; i++) {
			this.add(new JLabel("hello"));
		}
		
		this.pack();
		this.setVisible(true);
	}
	
}
