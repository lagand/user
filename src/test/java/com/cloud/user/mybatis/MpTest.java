package com.cloud.user.mybatis;

import com.cloud.user.dao.UserDao;
import com.cloud.user.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class MpTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test(){
        User user = new User();
        user.setNo("123123");
        user.setUserName("test1");
        user.setPassword("123123");
        user.setSalt("sergsf");
        int result  = userDao.insert(user);
        System.out.println(result);
    }

//    @Test
//     public void testDataSource() throws SQLException {
//        System.out.println(dataSource.getConnection());
//     }
}
