package cn.zql.pojo;

import cn.zql.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
}