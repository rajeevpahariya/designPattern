package factoryDesignPattern.factory1;

import factoryDesignPattern.factory1.interfaces.HamburgerStore;
import factoryDesignPattern.factory1.model.CheeseBurger;
import factoryDesignPattern.factory1.model.Hamburger;
import factoryDesignPattern.factory1.model.JamHamburgerstore;
import factoryDesignPattern.factory1.model.MozHamburgerStore;

public class Main {

    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );

        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");




    }
}
