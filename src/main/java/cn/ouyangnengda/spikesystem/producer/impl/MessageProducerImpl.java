package cn.ouyangnengda.spikesystem.producer.impl;

import cn.ouyangnengda.spikesystem.config.RabbitMQConfig;
import cn.ouyangnengda.spikesystem.producer.MessageProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:34:00
 **/
@Service
public class MessageProducerImpl implements MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String msg) {
        rabbitTemplate.convertAndSend(msg);
        System.out.println("send: " + msg);
    }
}
