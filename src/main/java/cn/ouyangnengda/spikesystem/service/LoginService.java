package cn.ouyangnengda.spikesystem.service;

import cn.ouyangnengda.spikesystem.pojo.User;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:30:00
 **/
public interface LoginService {

    boolean insertUser(User user);

    boolean comparePassword(String name, String password);

}
