package qa.com.singleresp;

public class cRunner {
	public static void main(String[] args) {
		Car myCar = new Car("Blue", "Ford", 5000);
		
		
		Mechanic myMechanic = new Mechanic();
		driver myDriver = new driver();
		
		System.out.println(myCar.getMileage());
		System.out.println(myMechanic.CheckCar(myCar, 5000));
		System.out.println(myDriver.driver (100));
	}
}
