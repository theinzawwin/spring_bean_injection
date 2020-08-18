package com.bestbright;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppForAutowireByConstructor {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansByConstructor.xml");
		TextEditor te=(TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
