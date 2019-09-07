package cn.ouyangnengda.spikesystem.consumer;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月07日 17:25:00
 **/
public interface MessageConsumer {

    void receive(String msg);
}
