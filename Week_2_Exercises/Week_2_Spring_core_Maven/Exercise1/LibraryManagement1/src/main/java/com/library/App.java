package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//loading the applicationContext.xml
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	BookRepository bookRepository=context.getBean("bookRepository", BookRepository.class);
    	bookRepository.test();
    	
    	BookService bookService=context.getBean("bookService", BookService.class);
    	bookService.test();
    }
}
