package model;

import lombok.extern.log4j.Log4j2;

/**
 * Implementation of Car interface that uses Gasoline. It assumes that the class is stateless so it
 * does not contain current status of the car.
 *
 * @see model.Car
 * @author kozlojak
 */
@Log4j2
public class GasCar implements Car{

    @Override
    public void turnOnVehicle() {
        //place logic here
        log.info("The gas car has been turned on.");
    }

    @Override
    public void turnOffVehicle() {
        //place logic here
        log.info("The gas car has been turned off.");
    }

    @Override
    public void fillUpFuel(Double amountOfFuelToFillUp) {
        //place logic here
        log.info("The gas car has been filled up.");
    }

    @Override
    public void drive(Double distance) {
        //place logic here
        log.info("The distance has been driven.");
    }
}
