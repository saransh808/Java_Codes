package lab12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JJ extends JFrame{
	   
	   
	   public JJ(){
		   
		   JFrame frame = new JFrame("JFrame Example");
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());
	        
	        
	        JLabel label = new JLabel("This is a label!");
	        JButton button = new JButton();
	        JTextField txt = new JTextField(10);
	        txt.setText("This is SWING");
	        panel.add(txt);
	        
	        button.setText("Press me");
	        panel.add(label);
	        panel.add(button);
	        frame.add(panel);
	        frame.setSize(300, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
	        frame.pack();
	        
	        
	       

		   
		   
	   }
	   
	   
	   public static void main(String args[]){
		   JJ obj = new JJ();
		   obj.setVisible(true);
	   }


}
