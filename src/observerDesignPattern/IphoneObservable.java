package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements IObservable {

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount=0;
	
	@Override
	public void add(NotificationAlertObserver Observer) {
		observerList.add(Observer);

	}

	@Override
	public void remove(NotificationAlertObserver Observer) {
		observerList.remove(Observer);

	}

	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver ob:observerList) {
			ob.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount+= newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
