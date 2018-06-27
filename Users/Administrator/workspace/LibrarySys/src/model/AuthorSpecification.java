package model;

public class AuthorSpecification implements ISpecification<Book>{
	private String author;
	public AuthorSpecification(String author) {
		// TODO Auto-generated constructor stub
		this.author = author;
	}
	@Override
	public boolean IsSatisfiedBy(Book book) {
		// TODO Auto-generated method stub
		return (book.getAuthor().equals(author));
	}
	
	public final String getAuthor() {
		return author;
	}

	public final void setAuthor(String author) {
		this.author = author;
	}



}
