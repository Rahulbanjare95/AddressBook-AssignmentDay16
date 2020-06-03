
public class Address {

	
	String city;
	String State;
	
	int zipcode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
//	public int getZipcode() {
//		return zipcode;
//	}
//	public void setZipcode(int zipcode) {
//		this.zipcode = zipcode;
	
	public String toString() {
		return "\tCity"+city+"\n\tState"+State+"\n\t Zip"+zipcode;
		
	}
	

}
