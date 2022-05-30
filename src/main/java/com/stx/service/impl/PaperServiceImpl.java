package com.stx.service.impl;

import com.stx.domain.Account;
import com.stx.domain.Paper;
import com.stx.mapper.AccountMapper;
import com.stx.mapper.PaperMapper;
import com.stx.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperMapper paperMapper;

    public List<Paper> getAllPaper() {
        return paperMapper.getAllPaper();
    }

    @Override
    public void addPaper(Paper paper) {
        paperMapper.addPaper(paper);
    }

    @Override
    public Paper getPaperById(int id) {
        return paperMapper.getPaperById(id);
    }
    @Transactional
    @Override
    public void delPaper(int id) {
        paperMapper.delPaper(id);
        int i= 1/0;
        //todo
    }

    @Override
    public void updatePaper(Paper paper) {
        paperMapper.updatePaper(paper);
    }

}
