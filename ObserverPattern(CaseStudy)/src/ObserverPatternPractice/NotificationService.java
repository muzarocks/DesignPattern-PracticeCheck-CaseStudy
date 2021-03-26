package ObserverPatternPractice;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	
   private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
		System.out.println("Total Susbscribers present "+observers.size());

		
		
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		
		observers.remove(observer);
		System.out.println("Total Susbscribers present "+observers.size());

	
		
		
	}
	
	
	public void NotifySubscriber()
	{
		for(INotificationObserver observer: observers)
		{
			observer.OnServerDown();
			
		}
	}
	
	
	
	
	
}
