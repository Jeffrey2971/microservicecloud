package com.jeffrey.springcloud.dao;


import com.jeffrey.springcloud.entitys.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    /**
     * 添加部门
     * @return
     */
    public boolean addDept(Dept dept);

    /**
     * 查找一个用户
     * @param id
     * @return
     */
    public Dept findById(Long id);

    /**
     * 查找部门
     * @return
     */
    public List<Dept> findAll();
}
