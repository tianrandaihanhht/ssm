package com.stx.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Paper {
    private Integer id;
    private String paper_name;
    private Integer paper_num;
    private String paper_detail;
}
