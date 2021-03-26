package AbstractFactoryPatternPractice;

public class LuxuryCar extends Car {

	
	LuxuryCar(Location location)
	{
		super(CarType.LUXURY,location);
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to luxury Car");
	}
}
