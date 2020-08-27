package com.jeffrey.springboot.controller;


import com.jeffrey.springcloud.entitys.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptControllerConsumer {
    // 消费者不应该调用 service 层，吃蛋糕不做蛋糕

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 	•	使用 RestTemplate 访问 RESTFUL 接口十分简单
     * 	    ◦	URL：Rest 请求地址
     * 	    ◦	requestMap：请求参数
     * 	    ◦	ResponseBean.class：HTTP 响应转换成的对象类型
     */

    @Autowired
    private RestTemplate restTemplate;

    // Dept 并不在当前子工程内，能够使用的原因是当前的 pom 文件引用了 api ，做到了一处定义多处使用

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/consumer/dept/list")
    public List<Dept> list(Dept dept){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    // 测试 @EnableDiscoveryClient，消费端可以调用服务端
    @GetMapping(value = "consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }

}
