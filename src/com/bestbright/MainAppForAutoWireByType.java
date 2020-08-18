package com.bestbright;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppForAutoWireByType {


	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansByType.xml");
		TextEditor te=(TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
