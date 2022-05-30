package com.stx.mapper;

import com.stx.domain.Account;
import com.stx.domain.Paper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PaperMapper {
    @Select("select * from paper")
    List<Paper> getAllPaper();
    @Insert("insert into paper values (#{id},#{paper_name},#{paper_num},#{paper_detail})")
    void addPaper(Paper paper);
    @Select("select * from paper where id =#{id}")
    Paper getPaperById(int id);
    @Delete("delete from paper where id =#{id}")
    void delPaper(int id);
    @Update("update paper set paper_name =#{paper_name},paper_num=#{paper_num},paper_detail=#{paper_detail} where id =#{id}")
    void updatePaper(Paper paper);
}
