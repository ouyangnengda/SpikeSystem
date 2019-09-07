package cn.ouyangnengda.spikesystem.controller;

import cn.ouyangnengda.spikesystem.producer.MessageProducer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:27:00
 **/
@RestController
public class LoginController {

    private final MessageProducer messageProducer;

    public LoginController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @RequestMapping(value = "/login", method = GET)
    public void login() {
        messageProducer.send("小红");

    }

}
