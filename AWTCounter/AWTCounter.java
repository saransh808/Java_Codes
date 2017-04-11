package lab12;

import java.awt.*; 
import java.awt.event.*;
public class AWTCounter extends Frame implements ActionListener {
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount; 
	private int count = 0;
	
	
	public AWTCounter () {
		
		
	setLayout(new FlowLayout());
	
	
	
	tfCount = new TextField("0", 5);
	tfCount.setEditable(false);
	add(tfCount);
	btnCount = new Button("Count");
	add(btnCount);
	btnCount.addActionListener(this);
	setTitle("AWT Counter");
	setSize(200, 200);
	setVisible(true);
	}
	
	
	public static void main(String[] args) {
		AWTCounter app = new AWTCounter();
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		++count;
		tfCount.setText(count + ""); 
	}
}