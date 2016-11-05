/**
 * This class is used to create the search UI
 */
package userInterface;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Yang
 *
 */
public class SearchUI extends JFrame implements UserInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -913373114766594L;
	
	/*WIDTH is the width of window*/
	private static final int WIDTH = 800;
	/*HEIGHT is the height of window*/
	private static final int HEIGHT = 600;
	
	/*the column names of search result, including "filename" and "folder"*/
	private static final Object[] COLUMNNAMES = {"Filename","Folder"};
	
	public void createUI()
	{
		
		
		JScrollPane content = new JScrollPane();
		
		DefaultTableModel tablemode = new DefaultTableModel(COLUMNNAMES,0){
			public boolean isCellEditable(int row, int column)
			{
				return false;
			}
		};
		
		JTable filelistview = new JTable(tablemode);
		initialTableStyle(filelistview);
		filelistview.doLayout();
		initialTable();
		
		content.setViewportView(filelistview);
		content.add(filelistview);
		
		
		JScrollPane jp = new JScrollPane(filelistview);
		//this.add(content);
		this.setContentPane(jp);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setVisible(true);
		
	}
	
	/*initial the data of table*/
	private void initialTable()
	{
		
	}
	
	/**/
	private void initialTableStyle(JTable j)
	{
		j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		j.setRowSelectionAllowed(true);
		j.setGridColor(Color.BLACK);
		j.setShowGrid(true);
		j.setShowHorizontalLines(true);
		j.setShowVerticalLines(true);
		j.setFillsViewportHeight(true);
		DefaultTableCellRenderer dc = new DefaultTableCellRenderer();
		dc.setHorizontalAlignment(JTextField.LEFT);
		j.setDefaultRenderer(Object.class, dc);
		//j.setColumnWidth(0, 50);
	}
}
