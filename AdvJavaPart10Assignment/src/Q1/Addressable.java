package Q1;

public interface Addressable {
	public String getState();
	public String getCity();
	default public String getFullAddress(){
		
		return getCity()+","+getState();
		
	}
}
