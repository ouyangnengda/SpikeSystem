package cn.ouyangnengda.spikesystem.config;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @Description: RabbitMQ配置类
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:37:00
 **/
@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE = "exchange";
    public static final String ROUTING_KEY = "routing_key";
    public static final String QUEUE = "queue";

    @Bean
    public DirectExchange bindingExchangeQueue(DirectExchange directExchange, Queue queue) {
        return new DirectExchange(EXCHANGE, true, true);
    }
}
