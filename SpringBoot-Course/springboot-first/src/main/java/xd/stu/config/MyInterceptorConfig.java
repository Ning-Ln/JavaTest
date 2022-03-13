package xd.stu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xd.stu.Interceptor.LoginInterceptor;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建需要的拦截器对象
        HandlerInterceptor interceptor=new LoginInterceptor();
        //拦截的地址
        String path []={"/**"};
        //放行的地址
        String excludePath [] = {"/some.do"};
        registry.addInterceptor(interceptor).addPathPatterns(path).
                excludePathPatterns(excludePath);
    }
}
