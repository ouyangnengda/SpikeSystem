package cn.ouyangnengda.spikesystem.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: RabbitMQ配置类
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 16:37:00
 **/
@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE = "ouyangnengda.spikesystem.exchange";
    public static final String ROUTING_KEY = "ouyangnengda.spikesystem.routing_key";
    public static final String QUEUE = "ouyangnengda.spikesystem.queue";

    @Bean
    public Binding bindingExchangQueue(DirectExchange directExchange, Queue queue) {
        return BindingBuilder.bind(queue).to(directExchange).with(ROUTING_KEY);
    }

    @Bean
    public DirectExchange getDirectExchange() {
        return new DirectExchange(EXCHANGE, true, true);
    }

    @Bean
    public Queue getQueue() {
        return new Queue(QUEUE);
    }


}
