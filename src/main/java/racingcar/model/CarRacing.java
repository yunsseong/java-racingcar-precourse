package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {
	public List<Car> generateCarList(List<String> carNameList){
		return carNameList.stream()
			.map(Car::new)
			.collect(Collectors.toList());
	}
}
