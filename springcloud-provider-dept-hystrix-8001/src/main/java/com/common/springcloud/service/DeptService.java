package com.common.springcloud.service;

import com.common.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryId(Long id);

    public List<Dept> queryAll();
}
