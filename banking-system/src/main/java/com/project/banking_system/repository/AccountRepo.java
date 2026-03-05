package com.project.banking_system.repository;

import com.project.banking_system.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AccountRepo {

    @Autowired
    private JdbcTemplate template;

    public void createAccount(Account account){
        String sql = "insert into accounts (id, account_holder, balance) values (?, ?, ?)";
        int rows = template.update(sql, account.getId(), account.getAccount_holder(), account.getBalance());
        System.out.println(rows);
    }

    public Account getAccountById(int id){
        String sql = "select * from accounts where id = ?";
        return template.queryForObject(sql, new RowMapper<Account>() {

            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setAccount_holder(rs.getString("account_holder"));
                account.setBalance(rs.getDouble("balance"));

                return account;
            }
        }, id);
    }

    public void depositMoney(int id, double amount){
        String sql = "Update accounts set balance = balance + ? where id = ?";
        template.update(sql, amount, id);
    }

    public void withdraw(int id, double amount){
        String sql = "Update accounts set balance = balance - ? where id = ?";
        template.update(sql, amount, id);
    }
}
