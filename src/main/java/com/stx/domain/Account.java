package com.stx.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Account {
    private Integer id;
    private String name;
    private Double money;
}