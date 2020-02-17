// @author AMANUEL T TADDESSE
// @Version 1.0
//
package Lab2;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*;
import java.io.Serializable;
import java.util.Scanner;


public class Model {

 
 public Model() {
	 
 }

/*
 * @param Creating the method that is used for recognizing binary and converting it back into machine instructions.
 */

 public String machineR(String x) {
	 
 if(x.equals("0000")) return "r0";
 if(x.equals("0001"))return "r1";
 if(x.equals("0010"))return "r2";
 if(x.equals("0011"))return "r3";
 if(x.equals("0100"))return "r4";
 if(x.equals("0101"))return "r5";
 if(x.equals("0110"))return "r6";
 if(x.equals("0111"))return "r7";
 if(x.equals("1000"))return "r8";
 if(x.equals("1001"))return "r9";
 if(x.equals("1010"))return "r10";
 if(x.equals("1011"))return "r11";
 if(x.equals("1100"))return "r12";
 if(x.equals("1101"))return "r13";
 if(x.equals("1110"))return "r14";
 if(x.equals("1111"))return "r15";

// If nothing is placed in the textfield the program will return zero for the value.
 else return "0";
}
 
/*@param 
 * This is the method for the conversion of the machine instructions to the specific binary number.
 */
 public String binaryR(String y) {
 
// the values for the corresponding value in binary are listed.	 
 if(y.equals("R0"))return "0000";
 if(y.equals("R1"))return "0001";
 if(y.equals("R2"))return "0010";
 if(y.equals("R3"))return "0011";
 if(y.equals("R4"))return "0100";
 if(y.equals("R5"))return "0101";
 if(y.equals("R6"))return "0110";
 if(y.equals("R7"))return "0111";
 if(y.equals("R8"))return "1000";
 if(y.equals("R9"))return "1001";
 if(y.equals("R10"))return "1010";
 if(y.equals("R11"))return "1011";
 if(y.equals("R12"))return "1100";
 if(y.equals("R13"))return "1101";
 if(y.equals("R14"))return "1110";
 if(y.equals("R15"))return "1111";
		
 else return "0";
 
 }

/*@param
 * This method is used for converting machine code into the hexadecimal format.
 
 */
 public String codeH(String codeM) {

// The values for each of the hexadecimal characters are listed.	 
 if(codeM.equals("AND"))return "0";
 if(codeM.equals("EOR"))return "1";
 if(codeM.equals("SUB"))return "2";
 if(codeM.equals("RSB"))return "3";
 if(codeM.equals("ADD"))return "4";
 if(codeM.equals("ADC"))return "5";
 if(codeM.equals("SBC"))return "6";
 if(codeM.equals("RSC"))return "7";
 if(codeM.equals("TST"))return "8";
 if(codeM.equals("TEQ"))return "9";
 if(codeM.equals("CMP"))return "A";
 if(codeM.equals("CMN"))return "B";
 if(codeM.equals("ORR"))return "C";
 if(codeM.equals("MOV"))return "D";
 if(codeM.equals("BIC"))return "E";
 if(codeM.equals("MVN"))return "F";
		
 else return "0";	 
 }
 
/* @param
 * This is the method for converting binary into machine instructions. 
 * 
 */
 public String codeMachine(String codeR) {
	
/* @param
 * The corresponding value in binary will be taken to place the front part of the machine instructions.	 
 */
 if(codeR.equals("0000"))return "AND";
 if(codeR.equals("0001"))return "EOR";
 if(codeR.equals("0010"))return "SUB";
 if(codeR.equals("0011"))return "RSB";
 if(codeR.equals("0100"))return "ADD";
 if(codeR.equals("0101"))return "ADC";
 if(codeR.equals("0110"))return "SBC";
 if(codeR.equals("0111"))return "RSC";
 if(codeR.equals("1000"))return "TST";
 if(codeR.equals("1001"))return "TEQ";
 if(codeR.equals("1010"))return "CMP";
 if(codeR.equals("1011"))return "CMN";
 if(codeR.equals("1100"))return "ORR";
 if(codeR.equals("1101"))return "MOV";
 if(codeR.equals("1110"))return "BIC";
 if(codeR.equals("1111"))return "MVN";
		
 else return "0";	 
 }

/* @param
 * This method is used for converting the front part of the machine instructions to binary code.
 */
 public String codeBin(String codeB) {
	
//The corresponding machine instructions are matched with their binary equivalent.	 
 if(codeB.equals("AND"))return "0000";
 if(codeB.equals("EOR"))return "0001";
 if(codeB.equals("SUB"))return "0010";
 if(codeB.equals("RSB"))return "0011";
 if(codeB.equals("ADD"))return "0100";
 if(codeB.equals("ADC"))return "0101";
 if(codeB.equals("SBC"))return "0110";
 if(codeB.equals("RSC"))return "0111";
 if(codeB.equals("TST"))return "1000";
 if(codeB.equals("TEQ"))return "1001";
 if(codeB.equals("CMP"))return "1010";
 if(codeB.equals("CMN"))return "1011";
 if(codeB.equals("ORR"))return "1100";
 if(codeB.equals("MOV"))return "1101";
 if(codeB.equals("BIC"))return "1110";
 if(codeB.equals("MVN"))return "1111";
 
 else return "0";
 }
 
/* 
 * @param
 * This method is used for converting the hexadecimal values into binary.
 */
 public String HexB(String h) {

// The corresponding binary code values are listed with the hexadecimal values.
 if(h.equals("0"))return "0000";
 if(h.equals("1"))return "0001";
 if(h.equals("2"))return "0010";
 if(h.equals("3"))return "0011";
 if(h.equals("4"))return "0100";
 if(h.equals("5"))return "0101";
 if(h.equals("6"))return "0110";
 if(h.equals("7"))return "0111";
 if(h.equals("8"))return "1000";
 if(h.equals("9"))return "1001";
 if(h.equals("A"))return "1010";
 if(h.equals("B"))return "1011";
 if(h.equals("C"))return "1100";
 if(h.equals("D"))return "1101";
 if(h.equals("E"))return "1110";
 if(h.equals("F"))return "1111";
		
 else return "0";
 }
 
/*@param
 * Created a switch method to be use for converting binary code back to hexadecimal.
* Without creating the method and using integers, it would not work succesfully using strings.
 */
 public String BinH(int c) {
	 
 switch(c) {

// the case will switch when the instance of binary is parsed from the input JTextField.
 case 0: return "0";
 case 1: return "1";
 case 2: return "2";
 case 3: return "3";
 case 4: return "4";
 case 5: return "5";
 case 6: return "6";
 case 7: return "7";
 case 8: return "8";
 case 9: return "9";
 case 10: return "A";
 case 11: return "B";
 case 12: return "C";
 case 13: return "D";
 case 14: return "E";
 case 15: return "F";
 
 default: return "0";			
 }
 }
 
 /*
  * @param method for HEX strings
  */
 public String toMachine(String hex) {
	 
 if(hex.equals("0"))return "AND";
 if(hex.equals("1"))return "EOR";
 if(hex.equals("2"))return "SUB";
 if(hex.equals("3"))return "RSB";
 if(hex.equals("4"))return "ADD";
 if(hex.equals("5"))return "ADC";
 if(hex.equals("6"))return "SBC";
 if(hex.equals("7"))return "RSC";
 if(hex.equals("8"))return "TST";
 if(hex.equals("9"))return "TEQ";
 if(hex.equals("A"))return "CMP";
 if(hex.equals("B"))return "CMN";
 if(hex.equals("C"))return "ORR";
 if(hex.equals("D"))return "MOV";
 if(hex.equals("E"))return "BIC";
 if(hex.equals("F"))return "MVN";
 else return "0";
 
 
 
 }

/*@param
 * Creates the method that is used for converting the machine instructions into the binary code format.
* The code takes the input binary and already has an initial setting for the binary and makes the 
 String conversion.*/
 
 public String convertBinary(String B) {

	 
 String inputBinary = B.replaceAll("[ ,]", "");

 inputBinary = inputBinary.toUpperCase();
 
 String code = inputBinary.substring(0,3);
 
 String resultB = "1110000";
 
 if(codeBin(code).equals("0") )View.error.setText("Operation Code is invalid"); 
 	else resultB += codeBin(code);	resultB += "0";
 	
 String R1 = inputBinary.substring(5,7);
 
 if(binaryR(R1).equals("0")) View.error.setText("Operation Code is invalid");
 	else resultB += binaryR(R1);
 
 String DR = inputBinary.substring(3,5);
 
 if(binaryR(DR).equals("0")) View.error.setText("Operation Code is invalid");
 	else resultB += binaryR(DR); resultB += "00000000";
 	
 String R2 = inputBinary.substring(7,9);
 
 if(binaryR(R2).equals("0")) View.error.setText("Operation Code is invalid");
 	else resultB += binaryR(R2);
 
 return resultB;	 
 }
 
/* @param
 * Creates the method that is used for the converting of the hexadecimal code.
* Uses substring to tell the placement of the binary code that represents the corresponding hexadecimal code.
 The binary code is represented in pairs of "4"'s and that is how it is sub-stringed to convert back into hexadecimal.*/
 public String convertHex(String H) {
	 
// Substring will take each piece of the binary code in groups of 4.	 
 String h1 = H.substring(0,4);
 String h2 = H.substring(4,8);
 String h3 = H.substring(8,12);
 String h4 = H.substring(12,16);
 String h5 = H.substring(16,20);
 String h6 = H.substring(20,24);
 String h7 = H.substring(24,28);
 String h8 = H.substring(28,32);
 
// The method then has to parse the groups of 4 as integers to carry out the rest of the conversion. 
 int b1 = Integer.parseInt(h1,2);
 int b2 = Integer.parseInt(h2,2);
 int b3 = Integer.parseInt(h3,2);
 int b4 = Integer.parseInt(h4,2);
 int b5 = Integer.parseInt(h5,2);
 int b6 = Integer.parseInt(h6,2);
 int b7 = Integer.parseInt(h7,2);
 int b8 = Integer.parseInt(h8,2);
 
// The hexadecimal code is created by adding together the pieces created from the binary code that was
// inputed in the previous half of the method.
// The sections of binary code were split into 8 possible groups, which means that there
// needs to be 8 groups in order to convert the code properly.
 String resultHex = BinH(b1) + BinH(b2) + BinH(b3) + BinH(b4) + BinH(b5) + BinH(b6) + BinH(b7) + BinH(b8);
 
 	return resultHex;
 }

/* @param
 * Creates the method for converting hexadimal code back into the machine instructions.
* Takes the input the the hexadecimal input JTextField and runs it through to create the 
* corresponding machine instructions.*/
 
 public String hexMachine(String M) {
	 
 String hexBinary = "";
 for(int i=0; i<8; i++) {
 	hexBinary += HexB(M.substring(i,i+1));
 }
 	
 String machineResult = new String();
 
 String code = hexBinary.substring(7,11);
 
 String R1 = hexBinary.substring(12,16);
 
 String DR = hexBinary.substring(16,20);
 
 String R2 = hexBinary.substring(28,32);
 
 machineResult = codeMachine(code) + " " + machineR(DR) + "," + machineR(R1) + "," + machineR(R2);
 	return machineResult;
 }

/*@param
 * Creates the method that is used for the conversion of binary code into machine instructions.
* The method uses the input from the binary code JTextField and uses it to decode
* the binary input by the user back into the original machine instructions.*/
 public String binMachine(String M1) {
	 
 String machineResult2 = new String();
 
 String code = M1.substring(7,11);
 
 String R1 = M1.substring(12,16);
 
 String DR = M1.substring(16,20);
 
 String R2 = M1.substring(28,32);
 
 machineResult2 = codeMachine(code) + " " + machineR(DR) + "," + machineR(R1) + "," + machineR(R2);
 	return machineResult2;
// The end of the Lab2Model class.
 }
}
