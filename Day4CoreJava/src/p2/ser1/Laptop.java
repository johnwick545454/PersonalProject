package p2.ser1;

import java.io.Serializable;

public class Laptop implements Serializable 
{

	private int cost;
	private String brand;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int cost, String brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", brand=" + brand + "]";
	}
	
	
}
