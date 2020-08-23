package singleton.singleton1;

public class Singleton {

	// Eagerly creating singleton class
	// private static Singleton uniqueInstance = new Singleton();

	/*
	 * The Java volatile keyword is used to mark a Java variable as
	 * "being stored in main memory". More precisely that means, that every read of
	 * a volatile variable will be read from the computer's main memory, and not
	 * from the CPU cache, and that every write to a volatile variable will be
	 * written to main memory, and not just to the CPU cache.
	 */
	private volatile static Singleton uniqueInstance;
	String name;

	private Singleton() {
	}

	// Double-Check locking.
	// Synchronized used if multithread code is trying to get the object.
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized ((Singleton.class)) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}
}
