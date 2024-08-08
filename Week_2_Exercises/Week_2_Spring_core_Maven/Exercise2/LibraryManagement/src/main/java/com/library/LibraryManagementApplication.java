package com.library;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication 
{
    public static void main( String[] args ){
    	
    	//loading the applicationContext.xml
    	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
    		//using getBean() method
			BookService bookService=context.getBean("bookService", BookService.class);
			
			//verification
			bookService.test();
			bookService.injectionTest();
			
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
    }
}
