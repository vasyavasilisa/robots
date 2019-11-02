package by.ormedia.robots.core;

public interface Robot {
	/**
	 * Method of adding new task to data base
	 * 
	 * @param task - task to add
	 */
	void addFreshTask(Task task);

	/**
	 * Reporting method
	 * 
	 * @param record - record to add to report
	 */
	void report(String record);
}