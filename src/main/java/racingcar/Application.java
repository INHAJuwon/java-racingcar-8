package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input = new Input();
        Moving moving = new RandomValueCalculator();
        Splitter splitter = new Splitter(moving);
        String cars = input.readCars();
        CarDTO carsDTO = new CarDTO(splitter.convertList(cars));
        Output output = new Output();
        Winner winners = new Winner();


        int count = input.readCount();

        GameManager manager = new GameManager(output, winners);

        manager.run(carsDTO, count);
    }
}
