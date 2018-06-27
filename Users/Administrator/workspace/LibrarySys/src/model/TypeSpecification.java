package model;

public class TypeSpecification implements ISpecification<Book>{
	private String type;

	public TypeSpecification(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}


	@Override
	public boolean IsSatisfiedBy(Book book) {
		// TODO Auto-generated method stub
		return (book.getType().equals(type));
	}
	

}
