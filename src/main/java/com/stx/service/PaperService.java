package com.stx.service;

import com.stx.domain.Paper;

import java.util.List;

public interface PaperService {
    List<Paper> getAllPaper();

    void addPaper(Paper paper);

    Paper getPaperById(int id);

    void delPaper(int id);

    void updatePaper(Paper paper);
}
