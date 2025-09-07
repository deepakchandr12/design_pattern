package observerDesignPattern;

public class Store {

	public static void main(String args[]) {
		IObservable iphoneObservable = new IphoneObservable();
		
		NotificationAlertObserver observer1= new EmailNotificationObserver("abc1@gmail.com", iphoneObservable);
		NotificationAlertObserver observer2= new EmailNotificationObserver("abc2@gmail.com", iphoneObservable);
		NotificationAlertObserver observer3= new EmailNotificationObserver("abc3@gmail.com", iphoneObservable);
		
		iphoneObservable.add(observer1);
		iphoneObservable.add(observer2);
		iphoneObservable.add(observer3);
		
		iphoneObservable.setStockCount(4);
	}

}
