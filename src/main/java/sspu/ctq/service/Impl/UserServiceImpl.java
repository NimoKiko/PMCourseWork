package sspu.ctq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sspu.ctq.dao.UserDao;
import sspu.ctq.pojo.User;
import sspu.ctq.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void insertUser(User user) {
        userDao.InsertUser(user);
    }



}
