package banking;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		super(idNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	public String getFirstName() {
        return this.firstName;
	}

	public String getLastName() {
        return this.lastName;
	}
	
	public int getIdNumber()
	{
		return this.idNumber;
	}
}
