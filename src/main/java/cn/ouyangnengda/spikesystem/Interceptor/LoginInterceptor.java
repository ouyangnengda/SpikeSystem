package cn.ouyangnengda.spikesystem.Interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月09日 14:25:00
 **/
public class LoginInterceptor implements HandlerInterceptor {
    private static final Logger logger = LogManager.getLogger(LoginInterceptor.class);

    /**
     * @Method：preHandle
     * @Description: 访问每一个页面之前进行登陆检测，如果没登陆那就跳到登陆界面再跳回来。
     * @param request
     * @param response
     * @param handler
     * @return: boolean
     * @Date: 2019/9/9 14:29
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
