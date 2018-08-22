package Q4;

public class CalculateSalary {

	public static void main(String[] args) {
		IsSalary sl1=(int days,int salPerDay)->{
			int result=days*salPerDay;
			return result;
		};
		
		IsSalary sl2=new IsSalary() {
			
			@Override
			public int calculateSalary(int days, int salPerDay) {
				int result=days*salPerDay;
				return result;
			}
		};
		System.out.println(sl1.calculateSalary(5,400));
		System.out.println(sl2.calculateSalary(10, 1100));

	}

}
