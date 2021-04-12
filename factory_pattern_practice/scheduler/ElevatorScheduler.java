package factory_pattern_practice.scheduler;

import factory_pattern_practice.Direction;
import factory_pattern_practice.ElevatorManager;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
