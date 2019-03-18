package cn.zql.service;

import cn.zql.pojo.User;
import cn.zql.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;


    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
        System.out.println("--------------------------UserService构造函数");
    }




    public UserMapper getUserMapper() {
        return userMapper;
    }

    public List<User> selectUser() {
        return userMapper.selectUser();
    }



    /*
     在@Transactional注解中如果不配置rollbackFor属性,那么事务只在RuntimeException的时候才会回滚,
     加上rollbackFor=Exception.class,可以让事务在遇到任意异常时都回滚
     */
//    @Transactional(rollbackFor = Exception.class)
//    public void insertUser(List<User> userList) throws Exception {
//        for (User user : userList) {
//            userMapper.insertUser(user);
//        }
//    }
}

