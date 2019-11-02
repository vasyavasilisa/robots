package by.ormedia.robots.core;

public interface ITask {
	/**
	 * Method performing robots task
	 * 
	 * @param robot- robot with task
	 * @return result
	 */
	IResult perform(IRobot robot);
}