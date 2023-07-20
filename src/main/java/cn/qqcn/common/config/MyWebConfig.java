package cn.qqcn.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier(value = "loginInterceptor") //指定注入的拦截器,首字母是小写
    private HandlerInterceptor handlerInterceptor;

    @Override
    //注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration
                   = registry.addInterceptor(handlerInterceptor);
        // 拦截请求,这里拦截所有
        registration.addPathPatterns("/**");
        // 放行请求
        registration.excludePathPatterns(
                "/login",    //跳转登录页,
                "/captcha",     //发送验证码
                "/user/login",  //发送登录请求
                "/user/logout", //发送注销请求
                //以下为内部引用,也全部放行
                "/layui/**",
                "/lib/**",
                "/webjars/**",
                "/api/**",
                "/css/**",
                "/js/**",
                "/images/**"
        );
    }
}
