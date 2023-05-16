import java.util.Date;


public class Order {

	private int number;
	private String item;
	private int price;
	private Date date;
	
	public Order() {
       
    }
	
	public Order(int number, String item, int price, Date date) {
        this.number = number;
        this.item=item;
        this.price=price;
        this.date=date;
    }
	
	public int getNumber() {
        return number;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}
