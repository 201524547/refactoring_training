package factory_pattern_practice.factory;

import java.util.Calendar;

import factory_pattern_practice.scheduler.ElevatorScheduler;
import factory_pattern_practice.scheduler.ResponseTimeScheduler;
import factory_pattern_practice.scheduler.ThroughputScheduler;

public class SchedulerFactory {
	public static ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler;
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour < 12) scheduler = new ResponseTimeScheduler();
		else scheduler = new ThroughputScheduler();
		
		return scheduler;
	};
}
