package com.security.init;

import com.security.config.ApplicationConfig;
import com.security.config.WebConfig;
import com.security.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 相当于web.xml的配置，在启动时加载spring容器和mvc容器，以及进行相应的url映射
 * AbstractAnnotationConfigDispatcherServletInitializer 是继承了   WebApplicationInitializer的
 * 想直到这个类和类里面的内容是如何被加载的，可以看一下有道云笔记里面的    Spring中WebApplicationInitializer的理解   这一篇内容
 *
 * @author Administrator
 * @version 1.0
 **/

public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //spring容器，相当于加载 applicationContext.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ ApplicationConfig.class, WebSecurityConfig.class };
    }

    //servletContext，相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
