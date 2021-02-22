package com.uu.dao;

import com.uu.entity.ActiveUserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActiveUserDao {
    Integer insert(ActiveUserDo userDo);

    List<ActiveUserDo> find(Integer limit);
}
