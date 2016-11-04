/**
 * This program is a test from SAP to achieve searching files which including two main functions
 * the first one is searching files by key words and the other is by conditions.
 * the main class is the class which used to start the program.
 * 
 *  This program used java swings to build the user interface
 */
package mainClass;

import java.awt.event.*;

import mainUI.*;
/**
 * @author Yang
 *
 */
public class Main {
	
	private static MainUI mainUI;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainUI = new OriginalMainUI();
		mainUI.createMainUI();
		
	}
	
	

}
