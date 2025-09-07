package observerDesignPattern;

public class MobileNotificationObserver implements NotificationAlertObserver {
	int mobileNo;
	IObservable observable;
	public MobileNotificationObserver(int no, IObservable obs) {
		this.mobileNo=no;
		this.observable=obs;
	}

	@Override
	public void update() {
		sendMobileNotification(mobileNo, "Product came to stock");

	}
	public void sendMobileNotification(int mobileN0, String msg) {
		System.out.println("Notification is sent to: "+mobileN0+" = "+msg);
	}

}
