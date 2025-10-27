package racingcar;


import java.util.ArrayList;
import java.util.List;

public class Splitter {
    private final static String delimiter = ",";
    private final Moving moving;

    public Splitter(Moving moving) {
        this.moving = moving;
    }

    public List<Car> convertList(String cars) {
        List<Car> carList = new ArrayList<>();
        String[] splitter = cars.split(delimiter);

        for (String car : splitter) {
            car = car.trim();
            checkLength(car);
            carList.add(new Car(car, moving));
        }

        return carList;
    }

    private void checkLength(String car) {
        if (car.length() > 5)
            throw new IllegalArgumentException("이름 길이 5 초과");
    }
}
