package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.entity.Book;
import com.springboot.service.BookService;

@Controller
@RequestMapping("/")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/addbook")
	public ModelAndView takeAddForm()
	{
		ModelAndView mAndView=new ModelAndView("addbook");
		mAndView.addObject("book",new Book());
		return mAndView;
	}
	
	
	
	
	@PostMapping("/savebook")
	public String addBook( Book book)
	{
		bookService.addBook(book);
		return "redirect:/booklist";
	}
	
	@GetMapping("/booklist")
	public ModelAndView getListOfBook()
	{
		ModelAndView mvnAndView=new ModelAndView();
		
		List<Book> allBook = bookService.getAllBook();
		mvnAndView.addObject("books", allBook);
		mvnAndView.setViewName("bookView");
		return mvnAndView;
	}
	
	
	@GetMapping("/edit/{id}")
	public ModelAndView editBook(@PathVariable Integer id)
	{
		Optional<Book> book = bookService.findById(id);
		ModelAndView modelAndView=new ModelAndView("editBook");
		modelAndView.addObject("book", book);
		return modelAndView;
	}
	
	
	@PostMapping("editBook")
	public String updatedBook( Book book)
	{
		 bookService.updateBook(book);
		 return"redirect:/booklist";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBookbyId(@PathVariable Integer id)
	{
		 bookService.deleteBook(id);
		return "redirect:/booklist";
	}
	
}
