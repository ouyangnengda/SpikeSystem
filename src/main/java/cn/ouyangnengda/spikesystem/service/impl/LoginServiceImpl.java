package cn.ouyangnengda.spikesystem.service.impl;

import cn.ouyangnengda.spikesystem.dao.UserDAO;
import cn.ouyangnengda.spikesystem.pojo.User;
import cn.ouyangnengda.spikesystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:46:00
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDAO userDAO;

    public boolean insertUser(User user) {
        if (userDAO.insertUser(user)) {
            return true;
        }
        return false;
    }

}