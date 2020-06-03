import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {

	
	public static void main(String[] args) throws IOException {
		
		int selector,i=0;
		Scanner sc =  new Scanner(System.in);
		AddressRunner ar =new AddressRunner();
		 	while(i==0) {
				System.out.println("    MENU       ");
				System.out.println("1: Add Person Info");
				System.out.println("2: Display Records");
				System.out.println("3: Edit inside AddressBook  ");
				System.out.println("4: Search in AddressBook");
				System.out.println("5: Delete information in AddressBook");
				System.out.println("6: Sort by Name");
				System.out.println("7: Sort by ZipCode");
				System.out.println("8: Exit");				
				int choice =sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Add Person Information ");
					ar.addPesonInfo();
					break;
				case 2:
					System.out.println("Address Book Diplayed");
					ar.display();
					break;
				case 3:
					System.out.println("Edit Person Address and Number ");
					ar.editPerson();
					break;
				case 4:
					System.out.println("Search in AddressBook");
					ar.search();
					break;
				case 5:
					System.out.println("Delete Person Information ");
					ar.removePerson();
					break;
				case 6:	
					System.out.println("Sorting by Name");
					ar.sortByName();
					break;
				case 7:
					System.out.println("Sorting by postal");
					ar.sortByZip();
					break;
				case 8:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Enter Correct Choice in Menu");
				}
						}
}

}