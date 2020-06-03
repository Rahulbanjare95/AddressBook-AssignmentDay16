import java.util.Comparator;

public class SortByZip implements Comparator<Person>{
	
	public int compare(Person a, Person b) {
		return a.getZipCode().compareTo(b.getZipCode());
		
	}

	
}
