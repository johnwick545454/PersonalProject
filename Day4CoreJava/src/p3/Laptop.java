package p3;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	private String brand;
	private int cost;
	private transient Camera mp;
	
	
	
	public Laptop() {
		super();
	}



	public Laptop(String brand, int cost, Camera mp) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.mp = mp;
	}
	


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + ", mp=" + mp + "]";
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void printData(Laptop laptop){
		System.out.println(brand+cost+laptop.mp.getMp());
	}
	
	
}
