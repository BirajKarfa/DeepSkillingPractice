package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
	
	BookRepository bookRepository;
	
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}



	//a method for testing
	public void test() { 
		
		System.out.println("Hello from BookService()");
		
		
	}
	
	//method to test Dependency Injection
	public void injectionTest() { 
		
		System.out.print("Injection Test :");	
		this.bookRepository.test();
			
	}

	
	

}
