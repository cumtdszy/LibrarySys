package model;

import java.time.LocalDateTime;

public class Loan {
	private String Id;
	private java.time.LocalDateTime LoanDate;
	private java.time.LocalDateTime DateForReturn;
	private java.time.LocalDateTime ReturnDate;
	private Book Book;
	private Member Member;
	/**
	 * 是否已被归还
	 * @return
	 */
	public boolean HasNotBeenReturned(){
		return ReturnDate == null;
		
	}
	/**
	 * 设置归还时间
	 */
	public void MarkAsReturned(){
		ReturnDate = LocalDateTime.now();
	}
	public final String getId() {
		return Id;
	}
	public final void setId(String id) {
		Id = id;
	}
	public final java.time.LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public final void setLoanDate(java.time.LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public final java.time.LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public final void setDateForReturn(java.time.LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public final java.time.LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public final void setReturnDate(java.time.LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}

}
