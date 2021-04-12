package factory_pattern_practice;


import java.util.ArrayList;
import java.util.List;

import factory_pattern_practice.factory.SchedulerFactory;
import factory_pattern_practice.scheduler.ElevatorScheduler;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulerFactory schedulerFactory;
	
	public ElevatorManager(int controllerCount, SchedulerFactory schedulerFactory) {
		this.schedulerFactory = schedulerFactory;
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i + 1);
			controllers.add(controller);
		}
	}

	void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler = schedulerFactory.getScheduler();
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}