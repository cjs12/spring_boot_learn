/**
 * FileName: DruidMonitorConfigurer
 * Author:   Administrator
 * Date:     2018/5/18 21:31
 */
package com.zero.developstudy.core.configurer;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description Druid监控配置
 */
@Configuration
public class DruidMonitorConfigurer {

    /**
     * 猪儿侧ServletConfigurationBena
     * @return
     */
    @Bean
    public ServletRegistrationBean registrationBean() {
        ServletRegistrationBean bean =
                new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        /**
         * 初始化配置 initParams
         */
        // 白名单 多个Ip都好隔开
        bean.addInitParameter("allow","127.0.0.1");
        // IP黑名单（存在共同时，deny优先于allow）：如果满足于deny的话提示
        // you are not permitted to view this page
        bean.addInitParameter("deny", "192.168.1.118");
        // 登录查看信息的账号密码
        bean.addInitParameter("loginUsername", "admin");
        bean.addInitParameter("loginPassword", "admin");
        // 是否能够重置数据
        bean.addInitParameter("resetEnable","false");
        return bean;
    }

    @Bean
    public FilterRegistrationBean druidStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(
                new WebStatFilter()
        );
        // 添加过滤规则
        bean.addUrlPatterns("/*");
        // 添加不需要忽略的格式信息
        bean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return bean;
    }
}
