package cn.ouyangnengda.spikesystem.service.impl;

import cn.ouyangnengda.spikesystem.Util.MD5Util;
import cn.ouyangnengda.spikesystem.dao.UserDAO;
import cn.ouyangnengda.spikesystem.pojo.User;
import cn.ouyangnengda.spikesystem.service.LoginService;
import com.google.common.base.Strings;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:46:00
 **/
@Service
public class LoginServiceImpl implements LoginService {

    private final UserDAO userDAO;

    public LoginServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * @Method：insertUser
     * @Description: 先要判断数据库中是否存在一个相同名字的用户，如果存在就返回。
     * @param user
     * @return: boolean
     * @Date: 2019/9/9 16:48
     */
    public boolean insertUser(User user) {
        return userDAO.insertUser(user);
    }

    /**
     * @param name
     * @param password
     * @Method：compareUser
     * @Description: 首先通过name获取到数据库中的用户实体。
     * 接着判断password加salt且MD5之后的值是否与数据中存储的password值相同。
     * @return: boolean
     * @Date: 2019/9/9 14:59
     */
    @Override
    public boolean comparePassword(String name, String password) {
        if (Strings.isNullOrEmpty(name) || Strings.isNullOrEmpty(password)) {
            return false;
        }
        User user = userDAO.findUser(name);
        if (user != null) {
            String hash = MD5Util.string2MD5(password + user.getSalt());
            return hash.equals(user.getPassword());
        }
        return false;

    }

}
