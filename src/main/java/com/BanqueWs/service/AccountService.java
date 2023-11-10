package com.BanqueWs.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BanqueWs.entitys.Account;
import com.BanqueWs.repository.AccountRepo;



@Service

public class AccountService {
	@Autowired
	private AccountRepo accountRepo;
	
public Account CreateAccount(Long id ,String fullName, Double solde) {
	if (accountRepo.existsById(id)) {
		return null;
	}else {
		Account account;
		 account=new Account();
		 account.setId(id);
		 account.setFullName(fullName);
		 account.setSolde(solde);
		 account.setDateCreate(new Date());
	     return accountRepo.save(account);
		
	}
 
}

public double getallmontant() {
	
	return 0;
	
	
}

	
	public Optional<Account> getAccount(Long id) {
		
		return accountRepo.findById(id);
	}
	
	public double convert(double count) {
		return count*3.14;
	}
	
	public Account withdrow(Long id,double amount) {
		if (accountRepo.existsById(id)) {
			Account current;
			current = accountRepo.findById(id).orElseThrow();
			if (amount<=current.getSolde()) {
				current.setSolde(current.getSolde()-amount);
				return accountRepo.save(current);
			}
			return null;
			
			
		}else {
			return null;
		}
		
		
		
		
	}
	
	public Account Deposit(Long id,double amount) {
		if (accountRepo.existsById(id)) {
			Account current;
			current = accountRepo.findById(id).orElseThrow();
			current.setSolde(current.getSolde()+amount);
			return accountRepo.save(current);
			
		}else {
			return null;
		}
		
		
	}
	
	public List<Account> getAll() {
		if (accountRepo.count()==0) {
			return null;
		}else {
			return accountRepo.findAll();
		}
		
	}
	

}
