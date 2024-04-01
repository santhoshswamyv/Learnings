package javaassignment10.question3.library.transactions;

public class Transaction {
	private String transactionId;
	private String memberId;
	private String bookId;
	private String dueDate;

	public Transaction(String transactionId, String memberId, String bookId, String dueDate) {
		this.transactionId = transactionId;
		this.memberId = memberId;
		this.bookId = bookId;
		this.dueDate = dueDate;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Transaction{" + "transactionId='" + transactionId + '\'' + ", memberId='" + memberId + '\''
				+ ", bookId='" + bookId + '\'' + ", dueDate='" + dueDate + '\'' + '}';
	}
}