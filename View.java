// @author AMANUEL T TADDESSE
// @Version 1.0
//
package Lab2;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
/*
 @param the biggest view method we have
 */
public class View extends JFrame {

// Accesories for the widgets 
	private ImageIcon image_a;
	private JLabel label1;
	JButton encode = new JButton("Encode");
	JButton binary = new JButton("Decode Binary");
	JButton hex = new JButton("Decode Hexadecimal");
	
	JTextField machine = new JTextField();
	JTextField inputB = new JTextField();
	JTextField inputH = new JTextField();
	public static JTextField error = new JTextField();
	
	JLabel labelA = new JLabel("ARM7 Intructions");
	JLabel labelH = new JLabel("Hexadecimal Instructions");
	JLabel labelB = new JLabel("Binary Instructions");
	JLabel empty = new JLabel();
	JLabel problem = new JLabel("Error Message:");
	Image snow;
	ImageIcon ic;
	
	
/* @param 
 * The method that will execute as soon as the program starts
 * 
 */
	public static void main(String[] args)
	{ new View(); }
	JPanel pn = new JPanel(new GridLayout(1,2));
	JPanel pc = new JPanel(new GridLayout(6,2));
	public View() {
		 
		setLayout(new BorderLayout());
		   add(pn, BorderLayout.NORTH);
		 
		 
		   
// Adding the initialized objects onto the JFrame in the proper order.
		snow =  Toolkit.getDefaultToolkit().getImage("images/D81.JPG");
		 ic =  new ImageIcon(snow);
         label1 = new JLabel(ic);
    pn.add(label1);
    add(pc, BorderLayout.CENTER);
	pc.add(machine);
	pc.add(encode);
	pc.add(labelA);
	pc.add(empty);
	pc.add(inputB);
	pc.add(inputH);
	pc.add(labelB);
	pc.add(labelH);
	pc.add(binary);
	pc.add(hex);
	pc.add(problem);
	pc.add(error);

	// Modifying the size, title and look of the JFrame.
	
	binary.setBackground(Color.RED);
	hex.setBackground(Color.RED);
	encode.setBackground(Color.RED);
	
	labelA.setBackground(Color.RED);
	labelB.setBackground(Color.RED);
	labelH.setBackground(Color.RED);
	
	error.setEditable(false);
	setBackground(Color.GREEN);
	 setBounds(50, 50, 800, 1000);
	setTitle("LAB 2");
	setBackground(Color.GREEN);
	setVisible(true);
	
// The end of the View class.	
	}
}
	
	


	