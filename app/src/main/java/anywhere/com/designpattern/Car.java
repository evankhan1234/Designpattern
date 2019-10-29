package anywhere.com.designpattern;

public class Car implements Vehicle {
    @Override
    public int wheels() {
        return 125;
    }

    @Override
    public int passengers() {
        return 80;
    }

    @Override
    public boolean gas() {
        return true;
    }
}