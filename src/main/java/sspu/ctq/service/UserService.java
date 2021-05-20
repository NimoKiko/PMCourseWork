package sspu.ctq.service;


import sspu.ctq.pojo.User;

import java.util.List;

public interface UserService {

    //查询全部用户
    public List<User> findAll();
    //插入新用户
    public void insertUser(User user);

}
