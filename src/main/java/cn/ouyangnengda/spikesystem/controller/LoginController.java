package cn.ouyangnengda.spikesystem.controller;

import cn.ouyangnengda.spikesystem.consumer.MessageConsumer;
import cn.ouyangnengda.spikesystem.pojo.User;
import cn.ouyangnengda.spikesystem.producer.MessageProducer;
import cn.ouyangnengda.spikesystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:27:00
 **/
@RestController
public class LoginController {

    @Autowired
    MessageProducer messageProducer;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login() {
        messageProducer.send("小红");

    }

}
