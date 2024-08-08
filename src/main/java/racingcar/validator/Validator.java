package racingcar.validator;

import racingcar.util.Util;

public class Validator {
	private Util util = new Util();

	public boolean isEmpty(String string) {
		return string.isEmpty();
	}

	public boolean isOneRacingCar(String string) {
		return util.commaSplit(string).size() == 1;
	}

	public boolean isNumber(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isOverZero(String string){
		try {
			return Integer.parseInt(string) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
