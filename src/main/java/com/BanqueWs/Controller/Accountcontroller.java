package com.BanqueWs.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BanqueWs.entitys.Account;
import com.BanqueWs.entitys.UpdateDto;
import com.BanqueWs.service.AccountService;

@RestController
@Validated
@RequestMapping("/account")
public class Accountcontroller {
	@Autowired
AccountService accountService;
	@PostMapping("/add")
	public ResponseEntity<Account>  CreateAccount(@RequestBody @Validated  Account act) {
		 return ResponseEntity.ok(accountService.CreateAccount(act.getId(),act.getFullName(), act.getSolde())) ;
		
	}
	
	@GetMapping("/{id}")
	public Optional<Account> getAccount(@PathVariable @Validated  Long id) {
		return accountService.getAccount(id);
	}
	
	
	@GetMapping("convert/{count}")
	public double convert(@PathVariable @Validated double count) {
		return accountService.convert(count);
	}
	
	@PutMapping("/withdrow")
	public ResponseEntity<Account> withdrow(@RequestBody @Validated UpdateDto tr) {
		return  ResponseEntity.ok(accountService.withdrow(tr.getId(), tr.getAmount()));
		 
	}
	
	@PutMapping("/deposit")
	public ResponseEntity<Account> deposit(@RequestBody @Validated  UpdateDto tr) {
		return  ResponseEntity.ok(accountService.Deposit(tr.getId(), tr.getAmount()));
		 
	}
	@GetMapping()
	public List<Account> getAll() {
		return accountService.getAll();
	}
	
	
	
}
