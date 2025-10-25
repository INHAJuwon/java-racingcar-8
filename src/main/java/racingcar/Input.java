package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String readCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        return Console.readLine();
    }

    public int readCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String count = Console.readLine();
        return checkInteger(count);
    }

    private int checkInteger(String count) {
        try {
            return Integer.parseInt(count);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException("숫자 입력");
        }
    }
}

