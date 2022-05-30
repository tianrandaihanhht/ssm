package com.stx.service;

import com.stx.domain.Account;

import java.util.List;

public interface AccountService {
    void save();
    List<Account> getAllAccount();
}
