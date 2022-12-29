package ltd.newbee.mall.config;

import ltd.newbee.mall.web.interceptor.AdminLoginInterceptor;
import ltd.newbee.mall.web.interceptor.NewBeeMallCartNumberInterceptor;
import ltd.newbee.mall.web.interceptor.NewBeeMallLoginInterceptor;
import ltd.newbee.mall.web.interceptor.RepeatSubmitInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private AdminLoginInterceptor adminLoginInterceptor;
    @Autowired
    private NewBeeMallLoginInterceptor newBeeMallLoginInterceptor;
    @Autowired
    private NewBeeMallCartNumberInterceptor newBeeMallCartNumberInterceptor;
    @Autowired
    private RepeatSubmitInterceptor repeatSubmitInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加一个拦截器，截拦以/admin为前缀的url路径（后台登陆拦截）
        registry.addInterceptor(adminLoginInterceptor)
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/login")
                .excludePathPatterns("/admin/dist/**")
                .excludePathPatterns("/admin/plugins/**");
        // 购物车中的数量统一处理
        registry.addInterceptor(newBeeMallCartNumberInterceptor)
                .excludePathPatterns("/admin/**")
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/logout");
        // 商城页面登陆拦截
        registry.addInterceptor(newBeeMallLoginInterceptor)
                .excludePathPatterns("/admin/**")
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/logout")
                .addPathPatterns("/goods/detail/**")
                .addPathPatterns("/shop-cart")
                .addPathPatterns("/couponList")
                .addPathPatterns("/myCoupons")
                .addPathPatterns("/coupon/**")
                .addPathPatterns("/seckill")
                .addPathPatterns("/seckillExecution/**")
                .addPathPatterns("/seckillSettle/**")
                .addPathPatterns("/shop-cart/**")
                .addPathPatterns("/saveOrder")
                .addPathPatterns("/orders")
                .addPathPatterns("/orders/**")
                .addPathPatterns("/personal")
                .addPathPatterns("/personal/updateInfo")
                .addPathPatterns("/selectPayType")
                .addPathPatterns("/payPage");
        // 防止重复提交拦截
        registry.addInterceptor(repeatSubmitInterceptor).addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/upload/**").addResourceLocations("file:" + ProjectConfig.getFileUploadPath());
        registry.addResourceHandler("/goods-img/**").addResourceLocations("file:" + ProjectConfig.getFileUploadPath());

    }
}
