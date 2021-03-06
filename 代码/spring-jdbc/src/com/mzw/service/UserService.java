package com.mzw.service;

import com.mzw.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 增删改查
     */
    public int insert(User user);
    public int update(User user);
    public int deleteById(int id);
    public User selectById(int id);
    public int[] insertBatch(List<User> userList);
    public List<User> selectList();
    public int count();
}
