package com.jeffrey.springcloud.controller;

import com.jeffrey.springcloud.entitys.Dept;
import com.jeffrey.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;


    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        System.out.println("============");
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }
}
