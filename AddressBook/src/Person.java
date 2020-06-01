import javax.swing.JOptionPane;

public class Person {
	
	private String firstName;
	private String lastName;	
	 String address;
	 String city;
	 String state;
	 String phone;
	
	 String zipCode;

	public Person(String firstName, String lastName, String address, String city, String state, String phone,
			String zipCode) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	//Using to String to print Person details
	public String toString() {
	return this.firstName+" "+this.lastName+" "+this.address+" "+this.city+" "+this.state+" "
			+this.phone+" "+this.zipCode;
	
	}
	
	
	public void display() {
		JOptionPane.showMessageDialog(null, "Name:" + firstName+" Address "+address+" "+city+" "+state+" "+phone+ "ZipCode: "+zipCode);
		
	}
	
	
	
	
	
	
}
