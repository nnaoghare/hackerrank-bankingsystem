package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts = new LinkedHashMap<Long, Account>();

	/*Added new comment for testing github*/
	public Bank() {
		super();
	}

	private Account getAccount(Long accountNumber) {
		System.out.println("Im here with "+accountNumber);
        return accounts.get(accountNumber)!=null ? accounts.get(accountNumber): null;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		long newAccountNumber = openNewAccountNumber();
		accounts.put(newAccountNumber, new CommercialAccount(company, newAccountNumber, pin, startingDeposit));
		return newAccountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		long newAccountNumber = openNewAccountNumber();
		accounts.put(newAccountNumber, new ConsumerAccount(person, newAccountNumber , pin, startingDeposit));
		return newAccountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
        return getAccount(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
        return getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		return getAccount(accountNumber).debitAccount(amount);
	}
	
	public long openNewAccountNumber()
	{
		int lastAccNo = accounts.size();
		
		return lastAccNo + 1;
	}
}
