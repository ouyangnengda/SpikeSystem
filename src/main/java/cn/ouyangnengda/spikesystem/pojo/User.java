package cn.ouyangnengda.spikesystem.pojo;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:42:00
 **/
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
