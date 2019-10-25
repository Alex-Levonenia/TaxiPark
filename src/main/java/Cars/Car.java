package Cars;

import TypesOfCars.Type;

public class Car {

    protected Type type;
    protected int maxSpeed ;
    protected int price;
    protected int fuelConsumption;

    public Car(Type type, int price, int maxSpeed, int fuelConsumption) {
        this.type = type;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;

    }

    public int getPrice() {
        return price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public String toString() {
        return this.type + ", " + this.maxSpeed + ", " + this.fuelConsumption + ", " + this.price;
    }
}
