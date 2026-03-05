package com.project.banking_system;

import com.project.banking_system.model.Account;
import com.project.banking_system.repository.AccountRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingSystemApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BankingSystemApplication.class, args);

        Account account1 = (Account) context.getBean(Account.class);
        account1.setId(101);
        account1.setAccount_holder("Dip Banerjee");
        account1.setBalance(10000);


        AccountRepo repo = (AccountRepo) context.getBean(AccountRepo.class);
        repo.createAccount(account1);
        repo.depositMoney(101, 10000);
        repo.withdraw(101, 5000);

        Account getAccount = repo.getAccountById(101);
        System.out.println(getAccount.toString());


	}

}
