package cn.ouyangnengda.spikesystem.controller;

import cn.ouyangnengda.spikesystem.service.LoginService;
import com.google.common.base.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月04日 14:27:00
 **/
@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/")
    public String first() {
        return "login";
    }

    @RequestMapping(value = "/login", method = POST)
    public String login(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "password", required = false) String password) {
        if (Strings.isNullOrEmpty(name) || Strings.isNullOrEmpty(password)) {
            System.out.println("name: " + name + "password: " + password);
            return "login";
        }
        if (loginService.comparePassword(name, password)) {
            return "commodityList";
        } else {
            System.out.println("进入注册页面");
            return "register";
        }
    }

}
