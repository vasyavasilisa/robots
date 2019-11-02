package by.ormedia.robots.core;

public interface Task {
	/**
	 * Method performing robots task
	 * 
	 * @param robot- robot with task
	 * @return result
	 */
	Result perform(Robot robot);
}