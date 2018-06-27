package model;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private String Author;
	private String Type;
	private List<Book> books;
	public BookShelf(String Author,String Type){
		this.Author = Author;
		this.Type = Type;
		books = new ArrayList<>();
	}
	/**
	 * 像书架中增加书
	 * @param book
	 */
	public void addBooks(Book book){
		if(validate(book)){
			books.add(book);
		}
	}
	/**
	 * 判断书的类型和作者与书架匹不匹配
	 * @param book
	 * @return
	 */
	private boolean validate(Book book) {
		// TODO Auto-generated method stub
		AuthorSpecification author = new AuthorSpecification(Author);
		TypeSpecification types = new TypeSpecification(Type);
		return (author.IsSatisfiedBy(book) && types.IsSatisfiedBy(book));
	}
	/**
	 * 获取书架上所有的书
	 * @return
	 */
	public List<Book> getBooks(){
		return books;
		
	}

}
