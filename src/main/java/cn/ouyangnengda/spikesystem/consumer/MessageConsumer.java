package cn.ouyangnengda.spikesystem.consumer;

import cn.ouyangnengda.spikesystem.config.RabbitMQConfig;
import cn.ouyangnengda.spikesystem.pojo.User;
import cn.ouyangnengda.spikesystem.service.LoginService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:44:00
 **/
@Service
@RabbitListener(queues = RabbitMQConfig.QUEUE)
public class MessageConsumer {

    @Autowired
    LoginService loginService;

    @RabbitHandler
    public void receive(String msg) {
        System.out.println("reveive: " + msg);
        User user = new User();
        user.setName(msg);
        System.out.println("result: " + loginService.insertUser(user));
    }
}
