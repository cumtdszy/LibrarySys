package test;

import model.Book;
import model.BookShelf;
import model.Loan;
import model.Member;

public class LibrarySysTest {
	public static void main(String[] arges) throws InterruptedException{
		Book book1 = new Book("小明","数学","1234","高等数学");
		Book book2 = new Book("小明","数学","1235","线性代数");	
		Book book3 = new Book("小明","数学","1236","概率论");
		Member member = new Member("测试");
		BookShelf shelf = new BookShelf("小明","数学");
		shelf.addBooks(book1);
		shelf.addBooks(book2);
		shelf.addBooks(book3);
		//借书
		for(Book book : shelf.getBooks()){
			if(book != null){
				Loan loan = member.Loan(book);
				book.setLoanTo(member);
				if(loan != null){
					System.out.println("借书成功\n"+"书名："+loan.getBook().getTitle()+"\n借书时间："+loan.getLoanDate());
				}
				else{
					System.out.println("该书已被借走");
				}
			}else{
				System.out.println("该书不存在");
			}
		}
		//还书
		member.Return(book3);
		System.out.println("还书成功\n"+"书名"+book3.getTitle());
	}	

}
