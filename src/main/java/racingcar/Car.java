package racingcar;

public class Car {
    private int position;
    private final String name;
    private final Moving moving;

    public Car(String name, Moving moving) {
        this.name = name;
        this.moving = moving;
        position = 0;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void moveForward() {
        if (moving.canMove()) {
            this.position++;
        }
    }
}
