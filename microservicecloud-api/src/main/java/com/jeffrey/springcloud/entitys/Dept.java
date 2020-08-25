package com.jeffrey.springcloud.entitys;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

// 表示全参构造函数
//@AllArgsConstructor
// 表示空参构造函数
@NoArgsConstructor
// 表示为所有属性添加 getter 和 setter
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    @SuppressWarnings("serial")

    // 部门主键
    private Long deptno;

    // 部门名称
    private String dname;

    // 来自哪个部门，因为微服务架构可以为一个服务对应一个数据库，同一个信息被存储到不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("RD").setDb_source("db01");
        System.out.println(dept);
    }
}
