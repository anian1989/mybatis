package com.fanhanfei.test.entity;

import lombok.Data;

/**
 * @author zhangjunshuai
 * @date 2020/4/29
 * @description
 **/
@Data
public class Clazz {
    private int classId;

    private String className;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Class{");
        sb.append("classId=").append(classId);
        sb.append(", className='").append(className).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
