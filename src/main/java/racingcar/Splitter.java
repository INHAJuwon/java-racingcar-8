package racingcar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Splitter {
    final static String delimiter = ",";

    public Map<String, Integer> convertMap(String cars) {
        Map<String, Integer> carMap = new LinkedHashMap<>();
        String[] splitter= cars.split(delimiter);

        for (String car : splitter) {
            checkLength(car);
            carMap.put(car, 0);
        }

        return carMap;
    }

    private void checkLength(String car){
        if(car.length()>5)
            throw new IllegalArgumentException("이름 길이 5 초과");
    }
}
