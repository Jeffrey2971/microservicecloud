package com.jeffrey.springcloud.service.impl;

import com.jeffrey.springcloud.dao.DeptDao;
import com.jeffrey.springcloud.entitys.Dept;
import com.jeffrey.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean add(Dept dept) {
        return false;
    }

    @Override
    public Dept get(Long id) {
        return null;
    }

    @Override
    public List<Dept> list() {
        return null;
    }
}
