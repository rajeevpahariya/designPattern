package bridgePattern.bridge1;

public class Make implements WorkShop {

    @Override
    public void make() {
        System.out.println("Making...");
    }
}
