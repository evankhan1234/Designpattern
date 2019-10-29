package anywhere.com.designpattern;

public class Plane implements Vehicle {
    @Override
    public int wheels() {
        return 230;
    }

    @Override
    public int passengers() {
        return 50;
    }

    @Override
    public boolean gas() {
        return false;
    }
}
