package com.hell.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class User implements IUserMapper {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @Override
    public void show() {
        System.out.println("id: " + id);
        System.out.println("name:" + name);
        System.out.println("age: " + age);
        System.out.println("email: " + email);
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int deleteById(Serializable serializable) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int delete(Wrapper<User> wrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> collection) {
        return 0;
    }

    @Override
    public int updateById(User user) {
        return 0;
    }

    @Override
    public int update(User user, Wrapper<User> wrapper) {
        return 0;
    }

    @Override
    public User selectById(Serializable serializable) {
        return null;
    }

    @Override
    public List<User> selectBatchIds(Collection<? extends Serializable> collection) {
        return null;
    }

    @Override
    public List<User> selectByMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public User selectOne(Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public List<User> selectList(Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public IPage<User> selectPage(IPage<User> iPage, Wrapper<User> wrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage<User> iPage, Wrapper<User> wrapper) {
        return null;
    }
}