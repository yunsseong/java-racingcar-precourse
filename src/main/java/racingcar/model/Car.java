package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public void forward() {
		if (Randoms.pickNumberInRange(0, 9) >= 4)
			position++;
	}

	public String getName(){
		return name;
	}

	public int getPosition(){
		return position;
	}
}
