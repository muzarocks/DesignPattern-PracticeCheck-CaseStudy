package ObserverPatternPractice;

public interface INotificationService {

	public void addSubscriber(INotificationObserver observer);
	
	public void removeSubscriber(INotificationObserver observer);
}
