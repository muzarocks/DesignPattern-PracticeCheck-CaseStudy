package ObserverPatternPractice;

public class JohnObserver implements INotificationObserver{

	private String name ="John";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(name+" has recieved the Notification");

	}

}
