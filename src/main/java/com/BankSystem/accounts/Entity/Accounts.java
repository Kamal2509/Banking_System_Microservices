package com.BankSystem.accounts.Entity;

import jakarta.persistence.Id;

public class Accounts extends BaseEntity {
	
	private Long customerId;
	
	@Id
	private Long accountNumber;
	
	private String accountType;
	
	private String branchAddress;
	

}
