package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.entity.Book;

public interface BookService 
{
	public List<Book> getAllBook();
	public void addBook(Book book);
	public Optional<Book> findById(Integer id);
	public void updateBook(Book book);
	void deleteBook(Integer id);
}
