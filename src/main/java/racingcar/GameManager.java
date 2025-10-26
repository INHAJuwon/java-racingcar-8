package racingcar;

import java.util.List;

public class GameManager {
    private final Output output;
    private final Winner winners;

    public GameManager(Output output, Winner winners) {
        this.output = output;
        this.winners = winners;
    }

    public void run(CarDTO dto, int count) {
        List<Car> cars = dto.getCars();

        output.printStartMessage();

        for (int i = 0; i < count; i++) {
            eachRun(cars);
            output.printRoundResult(cars);
        }

        List<String> winner = winners.determine(cars);

        output.printWinners(winner);
    }

    private void eachRun(List<Car> cars) {
        for (Car car : cars) {
            car.moveForward();
        }
    }
}
