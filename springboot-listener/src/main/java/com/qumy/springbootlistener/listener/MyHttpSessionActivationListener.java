package com.qumy.springbootlistener.listener;

import javax.servlet.http.HttpSessionEvent;

/**
 * @author qumy
 * @since 2022/6/10 17:41
 */
public class MyHttpSessionActivationListener implements javax.servlet.http.HttpSessionActivationListener {

    @Override
    public void sessionWillPassivate(HttpSessionEvent event) {
        System.out.println("sessionWillPassivate");
    }
}
