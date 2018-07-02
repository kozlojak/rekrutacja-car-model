package domain;

import model.Car;
import model.ElectricCar;
import model.GasCar;
import shared.EngineType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static shared.EngineType.ELECTRIC;
import static shared.EngineType.GAS;

/**
 * Factory pattern to create  objects of Car interface implementations- GasCar and ElectricCar.
 *
 * @author kozlojak
 */

public final class CarFactory {

    private final static Map<EngineType, Supplier<Car>> map;

    static {
        map = new HashMap<>();
        map.put(ELECTRIC, ElectricCar::new);
        map.put(GAS, GasCar::new);
    }


    public static Car getCar(EngineType engineType) {
        Supplier<Car> car = map.get(engineType);
        return car.get();
    }
}
