package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input=new Input();
        Splitter splitter=new Splitter();

        String cars=input.readCars();
        int count= input.readCount();

    }
}
