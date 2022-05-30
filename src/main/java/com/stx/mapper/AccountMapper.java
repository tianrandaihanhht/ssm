package com.stx.mapper;

import com.stx.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {
    @Select("select * from account")
    List<Account> getAllAccount();
}
