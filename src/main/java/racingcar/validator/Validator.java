package racingcar.validator;

import racingcar.util.Util;

public class Validator {
	private Util util = new Util();

	public boolean isEmpty (String string){
		return string.isEmpty();
	}

	public boolean isOneRacingCar (String string){
		return util.commaSplit(string).size() == 1;
	}
}
