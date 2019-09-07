package cn.ouyangnengda.spikesystem.consumer.impl;

import cn.ouyangnengda.spikesystem.config.RabbitMQConfig;
import cn.ouyangnengda.spikesystem.consumer.MessageConsumer;
import cn.ouyangnengda.spikesystem.pojo.User;
import cn.ouyangnengda.spikesystem.service.LoginService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:44:00
 **/
@Service
@RabbitListener(queues = RabbitMQConfig.QUEUE)
public class MessageConsumerImpl implements MessageConsumer {
    private static final Logger logger = LogManager.getLogger(MessageConsumerImpl.class);

    private final LoginService loginService;

    public MessageConsumerImpl(LoginService loginService) {
        this.loginService = loginService;
    }

    @RabbitListener(queues = "ouyangnengda.spikesystem.queue")
    @Override
    public void receive(String msg) {
        logger.info("reveive: " + msg);
        User user = new User();
        user.setName(msg);
        logger.info("result: " + loginService.insertUser(user));
    }
}
