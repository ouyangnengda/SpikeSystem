package cn.ouyangnengda.spikesystem.service.impl;

import cn.ouyangnengda.spikesystem.service.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {

    @Autowired
    private LoginService loginService;

    /**
     * @Method：comparePassword
     * @Description: 测试密码比较功能
     * @Date: 2019/9/9 15:30
     */
    @Test
    public void comparePassword() {

        //构造一个User并插入进数据库
        /*User user = new User();
        user.setName("小李");
        user.setBalance(5000);
        String salt = UUID.randomUUID().toString().substring(0, 5);
        user.setSalt(salt);
        user.setPassword(MD5Util.string2MD5("1234567" + salt));
        loginService.insertUser(user);*/

        //应该找得到
        Assert.assertTrue(loginService.comparePassword("小李", "1234567"));

        //应该找不到
        Assert.assertFalse(loginService.comparePassword("小王", "1234567"));
        Assert.assertFalse(loginService.comparePassword("", "1234567"));
        Assert.assertFalse(loginService.comparePassword("小王", ""));
        Assert.assertFalse(loginService.comparePassword("", ""));
        Assert.assertFalse(loginService.comparePassword("小李", ""));
        Assert.assertFalse(loginService.comparePassword("小李", "12"));
    }
}