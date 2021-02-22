package com.uu;

import com.uu.dao.UserDao;
import com.uu.entity.UserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * @desc  普通 主从测试     【一主一从】
 * @author liuph
 * @date 2021/02/22 14:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MaterSlaveTest {
    @Autowired
    private UserDao userDao;

    /**
     *  插入测试
     */
    @Test
    public void insert() throws SQLException {
        for (int i = 20; i <= 30; i++) {
            UserDo userDo = new UserDo();
            userDo.setId(i);
            userDo.setUserName("name_" + i);
            userDo.setProvince(i%2 + 1);
            userDao.insert(userDo);
        }
    }

    /**
     * 查询测试
     */
    @Test
    public void testFind(){
        List<UserDo> entities = userDao.find(10);
        System.out.println(entities.toString());
    }
}
