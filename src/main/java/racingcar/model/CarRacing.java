package racingcar.model;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarRacing {
	private List<Car> carList;

	public void generateCarList(List<String> carNameList) {
		carList = carNameList.stream()
			.map(Car::new)
			.collect(Collectors.toList());
	}

	public void forwardCar() {
		carList.forEach(Car::forward);
	}

	public List<Car> getCarList() {
		return carList;
	}

	public List<Car> getWinnerList() throws NoSuchElementException{
		Car maxCar = Optional.ofNullable(carList.stream()
			.max(Comparator.comparingInt(Car::getPosition))
				.orElseThrow(NoSuchElementException::new))
			.get();
		return carList.stream()
			.filter(c -> c.getPosition() == maxCar.getPosition()).collect(Collectors.toList());
	}
}
