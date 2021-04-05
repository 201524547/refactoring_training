package observer_pattern_practice.subject;

import java.util.ArrayList;
import java.util.List;

import observer_pattern_practice.observer.Observer;

public abstract class RecordSubject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	protected void _notify() {
		for(Observer observer : observers) observer.update();
	}
}
