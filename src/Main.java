public class Main {

    public static void main(String args[]) {
        Car car1 = new Toyota(new FlyCar());
        Car car2 = new Tractor(new NonFlyable());

        car1.fly();
        car2.fly();
    }
}

interface Flyable {
    void fly();
}

class FlyCar implements Flyable {
    public void fly() {
        System.out.println("fly");
    }
}

class NonFlyable implements Flyable {
    public void fly() {
        System.out.println("cannot fly");
    }
}

abstract class Car {
    Flyable flyable;

    public Car(Flyable flyable) {
        this.flyable = flyable;
    }

    public abstract void run();

    public void stop() {
        System.out.println("stop");
    }

    public void fly() {
        flyable.fly();
    }
}

class Toyota extends Car {
    public Toyota(Flyable flyable) {
        super(flyable);
    }

    public void run() {
        System.out.println("run toyota");
    }
}

class Tractor extends Car {
    public Tractor(Flyable flyable) {
        super(flyable);
    }

    public void run() {
        System.out.println("run tractor");
    }
}
