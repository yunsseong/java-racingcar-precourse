package racingcar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import racingcar.model.Car;
import racingcar.model.CarManager;
import racingcar.view.Message;

public class GameController {
	private final CarManager carManager;
	private final Message message;

	public GameController(CarManager carManager, Message message) {
		this.carManager = carManager;
		this.message = message;
	}

	public String getCarName() {
		String carName = "";
		do {
			try {
				carName = message.scan();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!message.validateCarName(carName));
		return carName;
	}

	public List<String> carNameToList(String carName){
		return Arrays.asList(carName.split(","));
	}

	public void init() {
		String carName = getCarName();
		List<String> carNameList = carNameToList(carName);
	}

	public void run() {
	}

}
