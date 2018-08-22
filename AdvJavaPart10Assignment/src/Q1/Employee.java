package Q1;

public class Employee implements Addressable {
String state;
String city;
public Employee(String state, String city) {
	super();
	this.state = state;
	this.city = city;
}
@Override
public String getState() {
	
	return state;
}
@Override
public String getCity() {
	
	return city;
}


}
