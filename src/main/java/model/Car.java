package model;

/**
 * This interface represents car and its required functionalities.
 *
 * @author kozlojak
 *
 * @see ElectricCar
 * @see GasCar
 */

public interface Car {
    void turnOnVehicle();
    void turnOffVehicle();
    void fillUpFuel(Double amountOfFuelToFillUp);
    void drive(Double distance);
}
