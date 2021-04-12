package factory_pattern_practice;

import java.util.Calendar;

import factory_pattern_practice.factory.MorningAfternoonDifferentScheduler;
import factory_pattern_practice.factory.ResponseTimeSchedulerFactory;
import factory_pattern_practice.factory.SchedulerFactory;
import factory_pattern_practice.factory.ThroughputSchedulerFactory;

public class ElevatorMain {
	public int main() {
		SchedulerFactory schedulerFactory = new MorningAfternoonDifferentScheduler();
		
		ElevatorManager elevatorManager = new ElevatorManager(10,schedulerFactory);
		elevatorManager.requestElevator(10, Direction.UP);
		return 0;
	}
}
