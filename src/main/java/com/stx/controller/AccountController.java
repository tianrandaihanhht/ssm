package com.stx.controller;

import com.stx.domain.Account;
import com.stx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    //测试
    @RequestMapping(value = "/hello")
    public ModelAndView save19() {
        accountService.save();
        ModelAndView modelAndView = new ModelAndView();
        //设置域对象属性值
        modelAndView.addObject("hh", "hello111");
        //设置页面名称
        modelAndView.setViewName("/test.jsp");
        return modelAndView;
    }
    //获取全部列表
    @RequestMapping(value = "/getAll")
    public ModelAndView getAll() {
        List<Account> allAccount = accountService.getAllAccount();
        ModelAndView modelAndView = new ModelAndView();
        //设置域对象属性值
        modelAndView.addObject("allAccount", allAccount);
        //设置页面名称
        modelAndView.setViewName("/test.jsp");
        return modelAndView;
    }
    //xueJLchangeallmaomoa
}
