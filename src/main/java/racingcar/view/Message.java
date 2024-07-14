package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	public String carNameScanner() {
		return Console.readLine();
	}

	public String[] nameSeparate(String userInput){
		return userInput.split(",");
	}
}
