package racingcar.view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Util;
import racingcar.validator.Validator;

public class View {
	private Validator validator = new Validator();
	private Util util = new Util();

	public List<String> getRacingCarNames() {
		String input = "";
		do{
			System.out.println(Message.INPUT_RACING_CAR_NAMES);
			input = Console.readLine();
		} while (validator.isEmpty(input) || validator.isOneRacingCar(input));
		return util.commaSplit(input);
	}
}
