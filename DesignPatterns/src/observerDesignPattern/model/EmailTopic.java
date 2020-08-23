package observerDesignPattern.model;

import java.util.ArrayList;
import java.util.List;

import observerDesignPattern.interfaces.Observer;
import observerDesignPattern.interfaces.Subject;

public class EmailTopic implements Subject{
	
	private List<Observer> observers;
	private String message;
	
	public EmailTopic() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if(observer == null) throw new NullPointerException("Null Object/Observer");
		if(!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer obj : observers) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to my topic : " + msg);
        this.message = msg;
        notifyObservers();
	}

}
