package factory_pattern_practice.factory;

import factory_pattern_practice.scheduler.ElevatorScheduler;
import factory_pattern_practice.scheduler.ResponseTimeScheduler;

public class ResponseTimeSchedulerFactory extends SchedulerFactory  {

	@Override
	public ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = new ResponseTimeScheduler();
		return scheduler;
	}

}
