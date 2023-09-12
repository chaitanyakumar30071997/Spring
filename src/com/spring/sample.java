package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sample {

	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");

		Emp obj = (Emp) ap.getBean("emp");

		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getCity());


	}

}
