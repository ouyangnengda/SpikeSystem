package cn.ouyangnengda.spikesystem.producer.impl;

import cn.ouyangnengda.spikesystem.config.RabbitMQConfig;
import cn.ouyangnengda.spikesystem.producer.MessageProducer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:34:00
 **/
@Service
public class MessageProducerImpl implements MessageProducer {
    private static final Logger logger = LogManager.getLogger(MessageProducerImpl.class);


    private final RabbitTemplate rabbitTemplate;

    public MessageProducerImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void send(String msg) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, msg);
        logger.info("send: " + msg);
    }
}
