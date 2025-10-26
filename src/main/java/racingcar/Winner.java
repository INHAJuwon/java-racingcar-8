package racingcar;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class Winner {
    public List<String> determine(List<Car> cars) {
        if (cars.isEmpty()) {
            return List.of();
        }

        int maxPosition = findMaxPosition(cars);

        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (findWinner(car, maxPosition))
                winners.add(car.getName());
        }

        return winners;
    }

    private int findMaxPosition(List<Car> cars) {
        int maxDistance = 0;
        for (Car car : cars) {
            maxDistance = max(car.getPosition(), maxDistance);
        }

        return maxDistance;
    }

    private boolean findWinner(Car car, int max) {
        return car.getPosition() == max;
    }
}
