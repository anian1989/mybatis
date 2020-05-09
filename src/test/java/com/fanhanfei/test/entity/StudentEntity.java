package com.fanhanfei.test.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhangjunshuai
 * @date 2020/4/29
 * @description
 **/
@Data
@ToString
public class StudentEntity implements Serializable {

    // 学号
    private Integer id;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 班级
    private String className;

}
