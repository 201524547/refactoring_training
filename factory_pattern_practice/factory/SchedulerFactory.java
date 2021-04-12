package factory_pattern_practice.factory;

import factory_pattern_practice.scheduler.ElevatorScheduler;

public abstract class SchedulerFactory {
	public abstract ElevatorScheduler getScheduler();
}
