package racingcar.controller;

import java.util.List;

import racingcar.view.View;

public class GameController {

	private View view = new View();

	public void run() {
		List<String> racingCarList = view.getRacingCarNames();
		System.out.println(racingCarList.toString());
	}
}
