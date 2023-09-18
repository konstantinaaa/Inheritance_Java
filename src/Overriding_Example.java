class Car
{
    public void start()
    {
        System.out.println("Car started.");
    }

    public void accelerate()
    {
        System.out.println("Car is accelerated.");
    }

    public void changeGear()
    {
        System.out.println("Car Gear Changed.");
    }
}

class LuxuryCar extends Car
{
    public void changeGear()
    {
        System.out.println("Automatic Gear.");
    }

    public void openRoof()
    {
        System.out.println("Sun roof is opened.");
    }
}

public class Overriding_Example {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();
        System.out.println();

        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();
        lc.openRoof();

        /*Car c = new LuxuryCar();
        c.start();
        c.changeGear();
        c.accelerate();*/

    }
}
