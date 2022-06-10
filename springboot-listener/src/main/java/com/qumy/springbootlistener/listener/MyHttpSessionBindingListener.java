package com.qumy.springbootlistener.listener;

import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author qumy
 * @since 2022/6/10 17:43
 */
public class MyHttpSessionBindingListener implements javax.servlet.http.HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("MyHttpSessionBindingListener.valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("MyHttpSessionBindingListener.valueUnbound");
    }
}
