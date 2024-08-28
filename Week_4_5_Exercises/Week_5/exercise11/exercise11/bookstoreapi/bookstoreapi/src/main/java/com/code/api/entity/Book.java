package com.code.api.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @NotNull(message = "Title null not allowed")
    @Size(
    		min = 10,
    		max=50,
    		message = "Title size should be between 10 to 50"
    		)
    
@Column(name="title",nullable = false,unique = true,length=20)
    private String title;
@Column(name="author",nullable = false,length=20)
    private String author;
@Min(value = 1,message="Price should be >1")
@Column(name="price",nullable = false)
    private double price;
@Size(
		max = 13,
		min = 13,
		message = "ISBN No should be of 13 character"
		)
@Column(name="isbn",nullable = false,unique = true,length=20)
    private String isbn;

@Version
private Long version;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public Long getVersion() {
	return version;
}

public void setVersion(Long version) {
	this.version = version;
}

public Book(int id,
		@NotNull(message = "Title null not allowed") @Size(min = 10, max = 50, message = "Title size should be between 10 to 50") String title,
		String author, @Min(value = 1, message = "Price should be >1") double price,
		@Size(max = 13, min = 13, message = "ISBN No should be of 13 character") String isbn, Long version) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.price = price;
	this.isbn = isbn;
	this.version = version;
}

}
