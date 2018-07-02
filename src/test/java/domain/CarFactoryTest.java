package domain;

import model.Car;
import model.ElectricCar;
import model.GasCar;
import org.junit.Test;
import shared.EngineType;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author kozlojak
 */
public class CarFactoryTest {


    @Test
    public void whenCallGetCarFunctionWithEngineTypeELECTRIC_thenCreateElectricCar() {
        //when
        Car actual=CarFactory.getCar(EngineType.ELECTRIC);
        //then
        assertThat(actual).isInstanceOf(ElectricCar.class);
    }

    @Test
    public void whenCallGetCarFunctionWithEngineTypeGAS_thenCreateGasCar() {
        //when
        Car actual=CarFactory.getCar(EngineType.GAS);
        //then
        assertThat(actual).isInstanceOf(GasCar.class);
    }
}