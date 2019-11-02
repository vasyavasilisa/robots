package by.ormedia.robots.core;

import java.util.Date;

public interface IResult {
	/**
	 * Method of getting task execution time in milliseconds
	 * 
	 * @param task - task to calculate time
	 * @return time in milliseconds
	 */
	long getExecutionTime(ITask task);

	/**
	 * Method of getting date when the task was started
	 * 
	 * @param task - task to find starting date
	 * @return starting date
	 */
	Date getDate(ITask task);

	/**
	 * Method of getting task description
	 * 
	 * @param task - task to find description
	 * @return task description
	 */
	String getTaskDescription(ITask task);

	/**
	 * Method of getting robot performed this task
	 * 
	 * @param task - task to search robot
	 * @return robot
	 */
	IRobot getRobot(ITask task);
}