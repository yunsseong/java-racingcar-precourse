package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;

public class Message {
	private static final Pattern digitPattern = Pattern.compile("^[1-9]*$");
	public String scan() {
		return removeSpace(Console.readLine());
	}

	public String[] commaSeparate(String string) {
		return string.split(",");
	}

	public String removeSpace(String string){return string.replaceAll(" ", "");}

	public boolean lengthOver(String string) {
		return Arrays.stream(commaSeparate(string))
			.anyMatch(s -> s.length() > 5);
	}

	public boolean duplicateCheck(String string){
		List<String> stringList = Arrays.asList(commaSeparate(string));
		return stringList.stream().distinct().count() != stringList.size();
	}

	public void validateCarName(String string) throws IllegalArgumentException {
		if (string.isEmpty())
			throw new IllegalArgumentException("자동차 이름을 입력해주세요");
		if (lengthOver(string))
			throw new IllegalArgumentException("자동차 이름을 5글자 이하로 입력해주세요");
		if (duplicateCheck(string))
			throw new IllegalArgumentException("자동차 이름을 겹치지 않게 입력해주세요");
	}

	public void validateTrialNum(String userInput) throws IllegalArgumentException{
		if(userInput.isEmpty())
			throw new IllegalArgumentException("시도 횟수를 꼭 입력해야해요");
		if(!userInput.matches(digitPattern.pattern()))
			throw new IllegalArgumentException("시도 횟수로 숫자를 입력해주세요");
	}

	public void printDash(int count){
		for(int i = 0; i < count; i++){
			System.out.print("-");
		}
		System.out.println();
	}

	public void printRoundResult(List<Car> carList){
		carList
			.forEach(c -> {
				System.out.print(c.getName() + " : ");
				printDash(c.getPosition());
			});
	}

	public void printWinner(List<Car> winnerList){
		StringBuilder winner = new StringBuilder();
		for(int i = 0; i < winnerList.size(); i++){
			if(i == winnerList.size() - 1)
				winner.append(winnerList.get(i).getName());
			else
				winner.append(winnerList.get(i).getName()).append(", ");
		}
		System.out.println(winner);
	}
}
