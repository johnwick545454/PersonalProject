package Q1;

public class Dish {
	int dishId;
	String dishName;
	int creationTime;
	
	public Dish(int dishId, String dishName, int creationTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.creationTime = creationTime;
	}
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", creationTime=" + creationTime + "]";
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}
	
}
