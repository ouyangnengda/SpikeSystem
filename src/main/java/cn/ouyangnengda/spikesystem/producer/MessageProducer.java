package cn.ouyangnengda.spikesystem.producer;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:32:00
 **/
public interface MessageProducer {

    void send(String msg);
}
