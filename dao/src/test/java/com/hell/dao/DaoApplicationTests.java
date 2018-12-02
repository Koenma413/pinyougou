package com.hell.dao;

import com.hell.dao.impl.User;
import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.hell.dao.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.hell.dao")
public class DaoApplicationTests {

	@Resource
	private UserMapper userMapper;

	@Test
	public void contextLoads() throws IOException {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);
	}
}
