package com.uu;

import com.uu.dao.ActiveUserDao;
import com.uu.dao.UserDao;
import com.uu.entity.ActiveUserDo;
import com.uu.entity.UserDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ShardingDataBasesTest {

	@Autowired
	private UserDao userDao;


	/**
	 *  插入测试
	 */
	@Test
	public void insert() throws SQLException {
		for (int i = 10; i <= 20; i++) {
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

	/**
	 * 事务测试    【注：需要引入  jar】
	 */
	@Test
//	@Transactional(rollbackFor = Exception.class)
	//@ShardingTransactionType(TransactionType.XA)
	public void update() throws SQLException {
		UserDo userDo = new UserDo();
		userDo.setId(1);
		userDo.setProvince(1);
		userDo.setUserName("name_" + " 喜洋洋1");
		userDao.update(userDo);


		UserDo userDo2 = new UserDo();
		userDo2.setId(2);
		userDo2.setProvince(0);
		userDo2.setUserName("name_" + " 喜洋洋2");
		userDao.update(userDo2);

		userDao.insert(userDo2);
	}

	@Autowired
	private ActiveUserDao activeUserDao;


	/**
	 * 自定义分表策略
	 */
	@Test
	public void testCustomerAl(){
		ActiveUserDo activeUserDo = new ActiveUserDo();
		activeUserDo.setUserId(2);
		activeUserDo.setLastLoginTime(LocalDateTime.now());
		activeUserDo.setProvince(2);

		activeUserDao.insert(activeUserDo);
	}



}
