package com.stx.service.impl;

import com.stx.domain.Account;
import com.stx.mapper.AccountMapper;
import com.stx.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public void save() {
        System.out.println("running....");
    }

    public List<Account> getAllAccount() {
        return accountMapper.getAllAccount();
    }

    /*  public List<Account> getAllAccount() {
        *//*加载mybatis核心配置文件*//*
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resourceAsStream).openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> allAccount = mapper.getAllAccount();
        return  allAccount;
    }*/
}
