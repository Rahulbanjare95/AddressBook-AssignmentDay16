
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AddressRunner {

	public static void main(String[] args) {
		
		AddressBook a= new AddressBook();
		
		String box;
		while(true) {
			box = JOptionPane.showInputDialog("Enter 1 to add " + "\n Enter 2 to search " + "\n Enter 3 to Delete"+ "\n Enter 4 to Quit");
			
			int option=Integer.parseInt(box);
			String c;
			switch (option) {
			case 1:
				a.addPersons();
				break;
			case 2:
				c =JOptionPane.showInputDialog("Enter Name to search");
				a.search(c);
				break;
			case 3:
				c =JOptionPane.showInputDialog("Enter Name to Delete");
				a.delete(c);
				break;
			case 4:	
				System.exit(0);
				break;
			default:
				break;
			}
		}
				
	}
	
	
}
