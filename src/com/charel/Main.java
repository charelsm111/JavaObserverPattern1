package com.charel;

public class Main {

    public static void main(String[] args) {
	    System.out.println("***Observer Pattern Demo***");
	    Observer o1 = new Observer();
	    Subject sub1 = new Subject();

	    sub1.register(o1);
	    System.out.println("Setting flag = 5");
	    sub1.setFlag(5);

	    System.out.println("Setting flag = 25");
	    sub1.setFlag(25);

	    sub1.unregister(o1);
	    // No Notification this time to o1 since it is unregistered.

        System.out.println("Setting flag= 50");
        sub1.setFlag(50);
    }
}
