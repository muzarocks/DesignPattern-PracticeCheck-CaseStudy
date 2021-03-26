package AbstractFactoryPatternPractice;

public class CarFactory {

	public Car buildCar(CarType model, Location location)
	{
		
		if(location == Location.INDIA)
		{
			return new IndianCarFactory().makeCar(model, location);
		}else if(location == Location.USA)
		{
			return new USACarFactory().makeCar(model, location);
		}
		else 
		{
			return new DefaultCarFactory().makeCar(model, location);
		}
	}
}
