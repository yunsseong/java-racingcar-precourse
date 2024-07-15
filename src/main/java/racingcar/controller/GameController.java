package racingcar.controller;

import java.util.Arrays;
import java.util.List;

import racingcar.model.CarRacing;
import racingcar.view.Message;

public class GameController {
	private final CarRacing carRacing;
	private final Message message;
	private int trialNum;

	public GameController(CarRacing carRacing, Message message) {
		this.carRacing = carRacing;
		this.message = message;
	}

	public String getCarName() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		return message.scan();
	}

	public List<String> carNameToList(String carName) {
		return Arrays.asList(carName.split(","));
	}

	public void prepareCar() {
		String carName = getCarName();
		try {
			message.validateCarName(carName);
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
			this.prepareCar();
		}
		List<String> carNameList = carNameToList(carName);
		carRacing.generateCarList(carNameList);
	}

	private String getTrialNum() {
		System.out.println("시도할 횟수는 몇회인가요?");
		return message.scan();
	}

	public int prepareTrialNum() {
		String trialNum = getTrialNum();
		try {
			message.validateTrialNum(trialNum);
		} catch (Exception e) {
			System.out.println("[ERROR]" + e.getMessage());
			this.prepareTrialNum();
		}
		return Integer.parseInt(trialNum);
	}

	public void init() {
		prepareCar();
		trialNum = prepareTrialNum();
	}

	public void run() {
		System.out.println("실행 결과");
		for(int i = 0; i < trialNum; i++){
			carRacing.forwardCar();
			message.printRoundResult(carRacing.getCarList());
			System.out.println();
		}
		System.out.print("최종 우승자 : ");
		message.printWinner(carRacing.getWinnerList());
	}

}
