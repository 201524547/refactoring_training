package factory_pattern_practice.scheduler;

import factory_pattern_practice.Direction;
import factory_pattern_practice.ElevatorManager;

public class ThroughputScheduler implements ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0;
	}
}
