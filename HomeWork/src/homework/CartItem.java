package homework;
import java.util.ArrayList;
public class CartItem {
	private ArrayList<String> itemBook;
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	public CartItem() {
		itemBook = new ArrayList<String>();
	}
	
	public CartItem(ArrayList<String> book) {
		this.setItemBook(book);
        this.setBookID(book.get(0));
		this.setQuantity(1);
		updateTotalPrice();
	}

	public ArrayList<String> getItemBook() {
		return itemBook;
	}

	public void setItemBook(ArrayList<String> itemBook) {
		this.itemBook = itemBook;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itemBook.get(2))* this.quantity;
	}
	
	
	
}
