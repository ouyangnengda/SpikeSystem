package cn.ouyangnengda.spikesystem.pojo;

import lombok.Data;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:42:00
 **/
@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String salt;
    private int balance;
}
