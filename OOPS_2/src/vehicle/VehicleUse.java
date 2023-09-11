package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		
//		Vehicle v= new Vehicle(15);
//		v.print();
//		v.color="Red";
//		v.setMaxSpeed(12);
		
		Vehicle v= new Car(10,20);
		v.print();
		
		Car c= new Car(10, 100);
		c.color="Grey";
//		c.setMaxSpeed(15);;
		c.print();
	}

}
