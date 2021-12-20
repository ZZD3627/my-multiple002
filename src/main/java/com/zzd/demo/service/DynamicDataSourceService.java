package com.zzd.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzd.demo.dao.StudentDao;
import com.zzd.demo.dao.UserDao;
import com.zzd.demo.entity.Student;
import com.zzd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DynamicDataSourceService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private StudentDao studentDao;

    public List<User> testMaster() {
        List<User> selectList = userDao.selectList(new QueryWrapper<User>());
        System.out.println(selectList.size());
        for (User d : selectList) {
            System.out.println(d);
        }
        return selectList;
    }

    public Page<Student>  testSlave() {
        Page<Student> p = new Page<Student>(2, 2);
        p = studentDao.selectPage(p, new QueryWrapper<Student>());
        System.out.println(p.getRecords().size());
        for (Student u : p.getRecords()) {
            System.out.println(u);
        }
        return p;
    }
}
