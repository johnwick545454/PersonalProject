package p1;

public class LaptopRecords {
	Laptop[] emp=new Laptop[1000];
	int count=-1;
	
	public void addLaptop(Laptop e){
		emp[++count]=e;
	}
	
	public void showLaptopSerial(int serial) {
		for(int i=0;i<count+1;i++){
			if(emp[i].getSerialNumber()==serial){
				System.out.println("Laptop serial:"+emp[i].getSerialNumber());
				System.out.println("Laptop name:"+emp[i].getBrandName());
				System.out.println("Laptop cost:"+emp[i].getCost());
			}
		}
	}
	
	public void showLaptopPrice(int low, int high) {
		for(int i=0;i<count+1;i++){
			if(emp[i].getCost()>=low && emp[i].getCost()<=high){
				System.out.println("Laptop serial:"+emp[i].getSerialNumber());
				System.out.println("Laptop name:"+emp[i].getBrandName());
				System.out.println("Laptop cost:"+emp[i].getCost());
			}
		}
	}
}
