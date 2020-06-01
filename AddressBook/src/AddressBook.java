import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AddressBook {
	
 ArrayList<Person> persons;
 
 
public AddressBook() {
	
	 persons =new ArrayList<Person>();
	 
}

 // add new
	public void addPersons() {
	 String firstName = JOptionPane.showInputDialog("Enter the FirstName: ");
	 String lastName = JOptionPane.showInputDialog("Enter Last Name");
	 String address=JOptionPane.showInputDialog("Enter address");
	 String city=JOptionPane.showInputDialog("Enter City");
	 String state=JOptionPane.showInputDialog("State :");
	 String phone=JOptionPane.showInputDialog("Enter Phone number");
	 String zipCode=JOptionPane.showInputDialog("Enter Zip Code");
	 Person p = new Person(firstName, lastName, address, city, state, phone, zipCode);
	 persons.add(p);
	 
			 
	}
	public void search( String sr) {
		for(int i =0; i<persons.size();i++) {
			Person p =(Person) persons.get(i); 
			if(sr.equals(p.getLastName())) {
				p.display();
			}
		}
	}
	
	public void delete(String del) {
		for (int i =0 ;i<persons.size();i++) {
			Person p = (Person)persons.get(i);
			if(del.equals(p.getLastName())) {
				p.display();
				persons.remove(i);
				System.out.println("After removing");
				p.display();
			}
		}
	}
	
	
}
