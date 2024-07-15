package racingcar.view;

import java.util.Arrays;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	private static final Pattern digitPattern = Pattern.compile("^[1-9]*$");
	public String scan() {
		return Console.readLine();
	}

	public String[] commaSeparate(String string) {
		return string.split(",");
	}

	public boolean lengthOver(String string) {
		return Arrays.stream(commaSeparate(string))
			.anyMatch(s -> s.length() > 5);
	}

	public void validateCarName(String userInput) throws IllegalArgumentException{
		if(userInput.isEmpty())
	public void validateCarName(String userInput) throws IllegalArgumentException {
		if (userInput.isEmpty())
			throw new IllegalArgumentException("자동차 이름을 입력해주세요");
		if (lengthOver(userInput))
			throw new IllegalArgumentException("자동차 이름을 5글자 이하로 입력해주세요");
	}

	public void validateTrialNum(String userInput) throws IllegalArgumentException{
		if(userInput.isEmpty())
			throw new IllegalArgumentException("시도 횟수를 꼭 입력해야해요");
		if(!userInput.matches(digitPattern.pattern()))
			throw new IllegalArgumentException("시도 횟수로 숫자를 입력해주세요");
	}
}
