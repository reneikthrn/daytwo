package com.groundgurus.day2;

/**
 *
 * @author penguin
 */
public class WineShop extends Shop {
    private boolean areMinorsAllowed;

    public WineShop(String name, String[] items, 
            String address, int numberOfEmployees, boolean areMinorsAllowed) {
        super(name, items, address, numberOfEmployees);
        this.areMinorsAllowed = areMinorsAllowed;
    }

    public boolean isAreMinorsAllowed() {
        return areMinorsAllowed;
    }

    public void setAreMinorsAllowed(boolean areMinorsAllowed) {
        this.areMinorsAllowed = areMinorsAllowed;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Are Minors Allowed: " + areMinorsAllowed);
    }
}
