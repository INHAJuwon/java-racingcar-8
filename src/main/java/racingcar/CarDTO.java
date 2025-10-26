package racingcar;

import java.util.List;

public class CarDTO {
    private final List<Car> cars;
    public CarDTO(List<Car> cars){
        this.cars=cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
