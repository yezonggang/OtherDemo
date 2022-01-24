package com.yzg.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class StudentNew {
    public int ID;
    public String NAME;
    public int AGE;
    public String GENDER;
    public String CLASS;
}
