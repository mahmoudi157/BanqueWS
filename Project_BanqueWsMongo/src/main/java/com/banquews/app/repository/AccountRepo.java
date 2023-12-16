package com.banquews.app.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.banquews.app.document.Account;




@Repository
public interface AccountRepo  extends MongoRepository<Account, String>{
	

}
