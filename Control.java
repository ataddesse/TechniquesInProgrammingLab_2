/* @author AMANUEL T TADDESSE
 @Version 1.0
*/
package Lab2;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class Control extends View implements ActionListener  {

/* @param Creating strings here:
 */	
	private String valueHex;
	private String valueBinary;
	private String valueMachine;
	private String hex1;
	private String machine1;
	private String binary1;
	
// @param Now, we will start declaring models.
	Model m = new Model();
	
// @paramThis is the model 	
	public static void main(String[] args)
	{ new Control(); }
	
	public Control()  {
// @param Adds the action methods to the buttons for the desired actions to take place.		
    encode.addActionListener(this);
    binary.addActionListener(this);
    hex.addActionListener(this);
    
	}
// @param Assigns the proper methods to each of the buttons to be executed when they are pressed.
	public void actionPerformed(ActionEvent e) {
		
	Object w = e.getSource();
	
	if( w == encode )encode();
	if( w == binary )binaryOp();
	if( w == hex )hexOp();
	
	}
	
// @param Creates the method used for encoding the hexadecimal and the binary code.
//@param The method uses the machine instructions for encoding.
	public void encode()  {
		System.out.println("@encode");
	machine1 = machine.getText();
		
	if(machine1 != null) {
		
	valueBinary = m.convertBinary(machine1);
		showBinary(valueBinary);
		
	valueHex = m.convertHex(valueBinary);
		showHex(valueHex);
		
		
	
	}
	
}
// @param Creates the process that is used for decoding the binary code back into the original machine instructions.
	public void binaryOp() {
		
	binary1 = inputB.getText();
	if(binary1 != null) {
	
	valueMachine = m.binMachine(binary1);
	showMachine(valueMachine);
	}
	
}
/*@param Creates the method that is used for decoding the hexadecimal code back into the original machine instructions.	
 *Reads the hexadecimal and runs it back through the "hexMachine" method in the model to 
 *@return decode the hexadecimal format back into machine instructions.
	*/
	public void hexOp() {
	
	hex1 = inputH.getText();
	if(hex1 != null) {
	
	valueMachine = m.hexMachine(hex1);
	showMachine(valueMachine);

	
	}
}
// Creates the method used for returning the machine instructions back into the view.
	public void showMachine(String w) {
		
	machine.setText(w);

	}
// Creates the method used for returning the binary code back into the view.	
	public void showBinary(String b) {
		
	inputB.setText(b);
	
	}
/* 
 * @param Creates the method used 
 * @return  returning the hexadecimal code back into the view.
	*/
	public void showHex(String h) {
		
	inputH.setText(h);

// The end of the Lab2Control Class.
}
}
