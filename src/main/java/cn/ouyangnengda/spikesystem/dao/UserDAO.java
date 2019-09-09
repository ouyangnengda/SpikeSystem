package cn.ouyangnengda.spikesystem.dao;

import cn.ouyangnengda.spikesystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description: 对User操作的DAO集合
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:49:00
 **/
@Mapper
@Repository
public interface UserDAO {

    boolean insertUser(User user);

    User findUser(String name);

    User selectUserById(int id);

}
