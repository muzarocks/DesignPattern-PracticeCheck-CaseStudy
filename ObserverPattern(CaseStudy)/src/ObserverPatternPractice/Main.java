package ObserverPatternPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SteveObserver steveObserver = new SteveObserver();
		
		JohnObserver johnObserver = new JohnObserver();
		
		NotificationService notificationService = new NotificationService();
		
		
		notificationService.addSubscriber(steveObserver);
		notificationService.addSubscriber(johnObserver);
		
		notificationService.NotifySubscriber(); // both steve and john will receive the notification
		
		notificationService.removeSubscriber(johnObserver);
		
		notificationService.NotifySubscriber(); // only steve will recieve the notification
	}

}
