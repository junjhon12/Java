public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("A", "B", "C", 1);
        Plane plane2 = new Plane("D", "E", "F", 2, 3);
        car1.move();
        car1.stop();
        plane2.move();
        plane2.stop();

        System.out.println(car1.getName());
        System.out.println(plane2.getColor());
    }
}

class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void move() {
        System.out.println(this.name + " moved.");
    }
    public void stop() {
        System.out.println(this.name + " stopped.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class Car extends Vehicle{
    private String model;
    private int doors;

    public Car(String name, String model, String color, int doors) {
        super(name, color);
        this.model = model;
        this.doors = doors;
    }

    
}

class Plane extends Vehicle{
    private String model;
    private int doors;
    private int engines;

    public Plane(String name,String model, String color, int doors, int engines) {
        super(name, color);
        this.model = model;
        this.doors = doors;
        this.engines = engines;
    }

    @Override
    public void move() {
        System.out.println("Moving with Override");
        super.move();
    }
}
