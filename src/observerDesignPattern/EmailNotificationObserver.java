package observerDesignPattern;


public class EmailNotificationObserver implements NotificationAlertObserver {
	String email;
	IObservable observable;
	public EmailNotificationObserver(String email, IObservable observable) {
		this.email=email;
		this.observable=observable;
	}

	@Override
	public void update() {
		sendEmailNotificaion(email, "Product is in stock now");

	}
	public void sendEmailNotificaion(String email, String msg) {
		System.out.println("Email notification sent to: "+email+" = "+msg);
	}

}
