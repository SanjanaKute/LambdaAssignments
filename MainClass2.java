package core.Lambda;

import java.util.Arrays;
import java.util.List;
class Orders
{
	int price;

	public Orders(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Orders [price=" + price + "]";
	}
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Orders>o=Arrays.asList(new Orders(3000),new Orders(50000),new Orders(4000));
		o.stream().filter(t->t.getPrice()>10000).forEach(t-> System.out.println("Orders are accepted :"+t));

	}

}
