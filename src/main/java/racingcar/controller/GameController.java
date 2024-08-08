package racingcar.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import racingcar.model.Car;
import racingcar.view.View;

public class GameController {

	private View view = new View();

	private List<String> racingCarNameList;
	private int trialCount;
	private List<Car> racingCarList;

	public void init() {
		racingCarNameList = view.getRacingCarNames();
		trialCount = view.getTrialCount();
	}

	public void generate() {
		for (String carName : racingCarNameList) {
			racingCarList.add(new Car(carName));
		}
	}

	public void run() {
		for (int i = 0; i < trialCount; i++) {
			for (Car car : racingCarList) {
				car.move();
			}
			System.out.println();
		}
	}

	// public void showResult() {
	//
	//
	// }
	//
	// private List<String> getWinner() {
	// 	int max = 0;
	// 	for (Car car : racingCarList) {
	// 		if (max < car.getPosition()) {
	// 			max = car.getPosition();
	// 		}
	// 	}
	//
	// 	for (Car car : racingCarList) {
	// 		if(car.getPosition() == max){
	//
	// 		}
	// 	}
	// }

}
