package TaxiPark;

import Cars.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TaxiPark {
    private static final Logger logger = LogManager.getLogger(TaxiPark.class);

    private List<Car> cars = new ArrayList<Car>();

    public List<Car> getList() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
        logger.info("Car added");
    }

    public int addAllCarsPrice() {
        int sum = 0;
        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        logger.info("All cars price added");
        return sum;
    }

    public List<Car> sortBySpeed(float min, float max) {
        List<Car> carSelection = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        logger.info("Cars are sorted by speed");
        return carSelection;
    }

    public List<Car> sortByEconomy() {
        List<Car> sortedCards = new ArrayList<Car>(this.cars);
        Collections.sort(sortedCards, Comparator.comparing(Car::getFuelConsumption));
        logger.info("Cars are sorted by economy");
        return sortedCards;
    }


}
