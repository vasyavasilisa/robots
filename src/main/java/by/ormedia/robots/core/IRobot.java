package by.ormedia.robots.core;

public interface IRobot {
	/**
	 * Method of adding new task to data base
	 * 
	 * @param task - task to add
	 */
	void addNewTask(ITask task);

	/**
	 * Reporting method
	 * 
	 * @param record - record to add to report
	 */
	void report(String record);
}