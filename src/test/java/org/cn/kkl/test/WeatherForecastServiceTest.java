package org.cn.kkl.test;

import org.cn.kkl.ws.impl.IWeatherService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WeatherForecastServiceTest {
	
	private ApplicationContext applicationContext;
	private IWeatherService weatherServie;

	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext_cxf.xml");
		weatherServie = (IWeatherService) applicationContext.getBean("weatherClient");
	}
	
	@Test
	public void test(){
		System.out.println(weatherServie.info("bj"));
		System.out.println(weatherServie.info("nj"));
	}

}
