package sspu.ctq.dao;

import sspu.ctq.pojo.User;

import java.util.List;

public interface UserDao {
    //查询全部用户
    public List<User> findAll();
    //插入用户
    public void InsertUser(User user);
}
