package Lab2;

import javax.imageio.ImageIO;
import javax.swing.*;



import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;

public class prolly extends JFrame  {
	protected JLabel imgLabel=  new JLabel("an image");
	
	protected JTextField hexInstruction =  new JTextField(20);
	
	JPanel pn = new JPanel(new GridLayout(1,2));
	JPanel pc = new JPanel(new GridLayout(6,2));
	public prolly() {
		
	   setLayout(new BorderLayout());
	   add(pn, BorderLayout.NORTH);
	   pn.add(imgLabel);
	 
	   add(pc, BorderLayout.CENTER);
	   
	   pc.add(hexInstruction);
	   
	   
	   pn.setBackground(Color.GREEN);
	   pc.setBackground(Color.RED);
	   setTitle("LAB 2");
	   setBounds(100, 100, 400, 500);
       setVisible(true);
	}

	 
	public static void main(String[] args) {new prolly(); }
	
}
