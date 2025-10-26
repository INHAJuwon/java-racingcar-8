package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomValueCalculator implements Moving {
    @Override
    public boolean canMove() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }
}
