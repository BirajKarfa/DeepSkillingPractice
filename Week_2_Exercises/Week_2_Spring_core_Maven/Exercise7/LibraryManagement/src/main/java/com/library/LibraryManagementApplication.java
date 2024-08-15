package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

/**
 * Hello world!
 *
 */
public class LibraryManagementApplication 
{
    public static void main( String[] args )
    {
    	//loading the applicationContext.xml
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//using getBean() method
    	//BookRepository bookRepository=context.getBean("bookRepository", BookRepository.class);
    	BookService bookService=context.getBean("bookService", BookService.class);
    	
    	
    	bookService.test();
    	bookService.injectionTest();
   
    }
}
