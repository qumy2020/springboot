package com.qumy.springbootlistener.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听器
 *
 * @author qumy
 * @since 2022/6/10 10:32
 */
@Slf4j
public class MyListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener {

    public MyListener() {
        log.debug("Listener1......");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        /* 当servlet上下文初始化时 (当Web应用程序部署时) 调用此方法。 */
        log.debug("contextInitialized......：当servlet上下文初始化时 (当Web应用程序部署时) 调用此方法。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        /* 当取消部署servlet上下文或应用程序服务器关闭时，将调用此方法。 */
        log.debug("contextDestroyed......：当取消部署servlet上下文或应用程序服务器关闭时，将调用此方法。");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        /* 会话创建时调用。 */
        log.debug("sessionCreated......：会话创建时调用。");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        /* 会话销毁时调用。 */
        log.debug("sessionDestroyed......：会话销毁时调用。");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is added to a session. */
        /* 当将属性添加到会话时，将调用此方法。 */
        log.debug("attributeAdded......：当将属性添加到会话时，将调用此方法。");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is removed from a session. */
        /* 当从会话中删除属性时，将调用此方法。 */
        log.debug("attributeRemoved......：当从会话中删除属性时，将调用此方法。");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is replaced in a session. */
        /* 在会话中替换属性时调用此方法。 */
        log.debug("attributeReplaced......：在会话中替换属性时调用此方法。");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.debug("requestDestroyed......：请求销毁时调用。");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.debug("requestInitialized......：请求初始化时调用。");
    }
}
