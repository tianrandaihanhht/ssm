package com.stx.controller;

import com.stx.domain.Account;

import com.stx.domain.Paper;
import com.stx.exception.MyException;
import com.stx.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/paper")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request) throws MyException {
        /*if(true){
            throw new MyException("出现错误了。。。");
        }*/
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        session.setAttribute("loginUser","zs");
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/getAll")
    public ModelAndView getAll() {
        List<Paper> allPaper = paperService.getAllPaper();
        System.out.println(allPaper);
        ModelAndView modelAndView = new ModelAndView();
        //设置域对象属性值
        modelAndView.addObject("list", allPaper);
        //设置页面名称
        modelAndView.setViewName("/allPaper.jsp");
        return modelAndView;
    }
    @RequestMapping(value = "/addPaper")
    public String addPaper(Paper paper) {
       paperService.addPaper(paper);
        return "redirect:/paper/getAll";
    }



    @RequestMapping(value = "/toUpdatePaper")
    public ModelAndView toUpdatePaper(int id) {
        Paper paper=paperService.getPaperById(id);
        System.out.println(paper);
        ModelAndView modelAndView = new ModelAndView();
        //设置域对象属性值
        modelAndView.addObject("paper", paper);
        //设置页面名称
        modelAndView.setViewName("/updatePaper.jsp");
        return modelAndView;
    }
    @RequestMapping(value = "/updatePaper")
    public String updatePaper(Paper paper) {
        paperService.updatePaper(paper);
        return "redirect:/paper/getAll";
    }
    @RequestMapping(value = "/del")
    public String delPaper(int id) {
        paperService.delPaper(id);
        return "redirect:/paper/getAll";
    }

}
