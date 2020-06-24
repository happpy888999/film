package cn.test.mybatis.test;

import cn.test.mybatis.pojo.User;
import cn.test.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUser {
    @Test
    public void t1() {
        SqlSession session = MyBatisUtil.getSession();
        List<User> findAllUser = session.selectList("test.user.findAllUser");
        for(User user : findAllUser) {
            System.out.println(user);
        }
        MyBatisUtil.closeSession();
    }
}
