package com.springboot.service;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Book;
import com.springboot.repo.BookRepository;

@Service
public class BookImplService implements BookService
{
	@Autowired
	private BookRepository bookRepository;
	
	
	
	@Override
	public List<Book> getAllBook() 
	{
		 List<Book> list = bookRepository.findAll();
		 
		 return list;
		
	}
	@Override
	public void addBook(Book book) 
	{
		bookRepository.save(book);
		
	}
	@Override
	public Optional<Book> findById(Integer id) {
		return bookRepository.findById(id);
	}
	@Override
	public void updateBook(Book book) {
		bookRepository.save(book);
		
	}
	@Override
	public void deleteBook(Integer id)
	{
		bookRepository.deleteById(id);
		
	}
	
}
