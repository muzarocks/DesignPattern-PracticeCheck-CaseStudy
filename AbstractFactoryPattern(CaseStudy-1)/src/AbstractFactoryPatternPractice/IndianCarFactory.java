package AbstractFactoryPatternPractice;

public class IndianCarFactory extends CarFactory{

	
	public Car makeCar(CarType model, Location location)
	{
		if(model==CarType.LUXURY)
		{
			return new LuxuryCar(location);
		}
		else if(model==CarType.MICRO)
		{
			return new MicroCar(location);
		}
		else
		{
			return new MiniCar(location);
		}
	}
	
	
	
}
