package AbstractFactoryPatternPractice;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory carFactory = new CarFactory();
		
		
		System.out.println(carFactory.buildCar(CarType.MICRO, Location.USA)); // a micro car will be made in USA factory
		System.out.println(carFactory.buildCar(CarType.MINI, Location.INDIA)); // a mini car will be made in Indian factory
		System.out.println(carFactory.buildCar(CarType.LUXURY, Location.DEFAULT)); // a luxury car will be made in default location
		

	}

}
