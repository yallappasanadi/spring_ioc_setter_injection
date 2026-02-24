package spring_ioc2.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
                 
	Car car =(Car)applicationContext.getBean("c1");
	   car.callMethod();
	}

}
