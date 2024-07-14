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

	public String getCarName(){
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return message.scan();
	}

	public List<String> carNameToList(String carName) {
		return Arrays.asList(carName.split(","));
	}

	public void init() {
		String carName = getCarName();
		try {
			message.validateCarName(carName);
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
			this.init();
		}
		List<String> carNameList = carNameToList(carName);
	}

	public void run() {
	}

}
