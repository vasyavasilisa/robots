package by.ormedia.robots.core;

import java.util.Date;

public interface Result {
	/**
	 * Method of getting task execution time in milliseconds
	 * 
	 * @param task - task to calculate time
	 * @return time in milliseconds
	 */
	long getTaskExecutionMilliseconds(Task task);

	/**
	 * Method of getting date when the task was started
	 * 
	 * @param task - task to find starting date
	 * @return starting date
	 */
	Date getTaskStartExecutionDate(Task task);

	/**
	 * Method of getting task description
	 * 
	 * @param task - task to find description
	 * @return task description
	 */
	String getTaskDescription(Task task);

	/**
	 * Method of getting task performed robot
	 * 
	 * @param task - task to search robot
	 * @return robot
	 */
	Robot getTaskPerformedRobot(Task task);
}