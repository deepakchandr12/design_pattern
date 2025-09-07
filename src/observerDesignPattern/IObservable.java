package observerDesignPattern;

public interface IObservable {
	public void add(NotificationAlertObserver Observer);
	public void remove(NotificationAlertObserver Observer);
	public void notifySubscribers();
	public void setStockCount(int newStockAdded);
	public int getStockCount();
}
