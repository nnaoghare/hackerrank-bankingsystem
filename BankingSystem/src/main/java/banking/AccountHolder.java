package banking;

public abstract class AccountHolder {
	private int idNumber;

	/**
	 * @param idNumber The government-issued ID used during account setup.
	 */
	public AccountHolder(int idNumber){
		this.idNumber = idNumber;
	}

	/**
	 * @return private int {@link AccountHolder#idNumber}
	 */
	public int getIdNumber() {
		// complete the function
        return idNumber;
	}
}
