package observerDesignPattern;

import observerDesignPattern.interfaces.Observer;
import observerDesignPattern.model.EmailTopic;
import observerDesignPattern.model.EmailTopicSubscriber;

public class ObserverDesignPattern {
	public static void main(String[] args) {
		EmailTopic topic = new EmailTopic();
		
		// Observers
		Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
        
        // Register Observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        
        // Attach Subject to Observer
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        
        // Check for Update
        firstObserver.update();
        
        // Post Message
        topic.postMessage("Hello Subscribers !!");
        
        // Unsubscribe 
        topic.unRegister(firstObserver);
        
        topic.postMessage("Hello Subscribers. Welcome Back !!");
        
	}
}
