package com.common.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
//实现序列化的目的是为了保证流传输不出问题
public class Dept implements Serializable {

    private long deptno;    //主键

    private String dname;

    //这个数据存在哪个数据库
    private  String db_source;

    /**
     * 链式写法
     * dept.setDeptNo(11).setDname('sss').setDb_source()
     */
}
