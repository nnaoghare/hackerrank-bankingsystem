package banking;

public class ConsumerAccount extends Account{
	private Person person;
	private Long accountNumber;
	private double currentBalance;
	
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		super(person, accountNumber, pin, currentBalance);
		this.person = person;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}

	public Person getPerson() {
		return person;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}


	public double getCurrentBalance() {
		return currentBalance;
	}
	
}
