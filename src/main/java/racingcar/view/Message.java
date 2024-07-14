package racingcar.view;

import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	public String scan(){
		return Console.readLine();
	}

	public String[] nameSeparate(String userInput){
		return userInput.split(",");
	}

	public Boolean lengthOver(String string){
		return Arrays.stream(nameSeparate(string))
			.allMatch(s -> s.length() > 5);
	}

	public boolean validateCarName(String userInput){
		if(userInput.isEmpty())
			throw new IllegalArgumentException("자동차 이름을 입력해주세요");
		if(lengthOver(userInput))
			throw new IllegalArgumentException("자동차 이름을 5글자 이하로 입력해주세요");
		return true;
	}
}
