package model;

import java.time.LocalDateTime;

public class LoanFactory {

	public static Loan CreateLoan(Book book, Member member) {
		// TODO Auto-generated method stub
		Loan loan = new Loan();
		loan.setBook(book);
		loan.setMember(member);
		LocalDateTime now = LocalDateTime.now();
		loan.setLoanDate(now);
		loan.setDateForReturn(now.plusDays(10));
		return loan;
	}

}
