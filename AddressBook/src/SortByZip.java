import java.util.Comparator;

public class SortByZip implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
		return p1.getZipCode().compareTo(p2.getZipCode());
		
	}

	
}
