package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	
	BookRepository bookRepository;
	
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
