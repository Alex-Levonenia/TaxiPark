package Cars;

import TypesOfCars.Type;

public class Minivan extends Car {

    private int numOfSeats;

    public Minivan(Type type, int price, int maxSpeed, int numOfSeats, int fuelConsumption) {
        super(type, price, maxSpeed, fuelConsumption);
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString(){
        return this.type + ", " + this.maxSpeed + ", "+ this.numOfSeats + this.fuelConsumption + ", " + this.price;
    }

}
