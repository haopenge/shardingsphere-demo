package com.uu.dao;

import com.uu.entity.UserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao{
    Integer insert(UserDo userDo);

    Integer update(UserDo userDo);

    List<UserDo> find(Integer limit);
}
