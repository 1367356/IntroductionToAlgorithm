package chapter15.six;

import java.util.ArrayList;
import java.util.Random;

import chapter15.four.Generators;
import chapter15.three.Generator;

public class Store extends ArrayList<Aisle>{

	private ArrayList<CheckoutStand> checkoutStands=new ArrayList<CheckoutStand>();
	private Office office=new Office();
	public Store(int nAisles,int nShelves,int nProducts) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < nAisles; i++) {
			
			add(new Aisle(nShelves, nProducts));
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(Aisle a:this){
			for(Shelf s:a){
				for(Product p:s){
					sb.append(p);
					sb.append("\n");
				}
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}
/**
 * 创建一个商品类
 * @author admin
 *
 */
class Product{
	private final int id;
	private String description;
	private double price;
	public Product(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description
				+ ", price=" + price + "]";
	}
	public void priceChange(double change) {
		// TODO Auto-generated method stub
		price+=change;
	}
	//这是类的一个静态属性,Generator类型
	public static Generator<Product> generator=new Generator<Product>() {

		public Product next() {
			Random rand=new Random(47);
			// TODO Auto-generated method stub
			return new Product(rand.nextInt(100), "Test", Math.round(rand.nextDouble()*1000)+0.99);
		}
	};
}

/**
 * 货架，继承ArrayList,放置商品
 * @author admin
 *
 */
class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
	
}
/**
 * 走廊，每个周郎有nShelves个货架
 * @author admin
 *
 */
class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves,int nProducts) {
		for (int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}
class CheckoutStand{
	
}
class Office{
	
}