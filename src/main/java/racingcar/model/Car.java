package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(){
        if(4 <= Randoms.pickNumberInRange(0,9))
            position++;
        System.out.println(name + " : " + "-".repeat(position));
    }
}
