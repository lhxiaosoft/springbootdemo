package com.xlh.springboot.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
 
public class DemoListener implements ServletContextListener{
 
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("==>DemoListener启动");
		
	}
 
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
 
}
