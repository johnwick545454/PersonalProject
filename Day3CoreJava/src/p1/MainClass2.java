package p1;

class Animal{
	public void doEat(){}
}

class Dog extends Animal{
	public void playGames(){}
}

class Cat extends Animal
{
	public void doHunting()
	{}
}



public class MainClass2 {

	public static void main(String[] args) {
		
		Animal a = new Dog();		
		a.doEat();
		
		Dog d = (Dog)a;
		d.playGames();
		
		
	}
}








