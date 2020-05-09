package com.fanhanfei.test;

import org.apache.ibatis.annotations.Param;

/**
 * @author zhangjunshuai
 * @date 2020/4/29
 * @description
 **/
public interface ClassMapper {
    int updateClassName(@Param("name") String className, @Param("id") int id);
}
