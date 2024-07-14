package racingcar;

import racingcar.controller.GameController;
import racingcar.model.Car;
import racingcar.model.CarManager;
import racingcar.view.Message;

public class Application {
    private static GameController gameController;
    public static void main(String[] args) {
        GameController gameController = new GameController(new CarManager(), new Message());
        gameController.init();
        gameController.run();
    }
}
