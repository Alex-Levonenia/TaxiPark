package TaxiPark;

import Cars.Car;
import Cars.Minivan;
import TypesOfCars.Type;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


class TaxiParkTest {

    TaxiPark taxiPark = new TaxiPark();
    Car car1 = new Car(Type.Petrol, 9000, 210, 10);
    Car car2 = new Car(Type.Electric, 40000, 250,0);
    Car car3 = new Minivan(Type.Diesel, 10000, 180, 7, 12);


    public void add() {
        taxiPark.addCar(car1);
        taxiPark.addCar(car2);
        taxiPark.addCar(car3);
    }

    @Test
    void addAllCarsPrice() {
        add();
        assertEquals(59000, taxiPark.addAllCarsPrice());
    }

    @Test
    void sortBySpeed() {
        add();
        List<Car> actual = taxiPark.sortByEconomy();
        List<Car> expected = new ArrayList<>();
        expected.add(car2);
        expected.add(car1);
        expected.add(car3);
        assertEquals(expected,actual);
    }

    @Test
    void sortByEconomy() {
        add();
        List<Car> actual = taxiPark.sortBySpeed(200, 230);
        List<Car> expected = new ArrayList<Car>();
        expected.add(car1);
        assertEquals(actual, expected);
    }
}