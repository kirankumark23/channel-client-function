package channel.client.function.common;

import channel.client.function.Status;

public abstract class CommonUtils {

	/**
	 * Returns Data field value from intended Complex & Simple Step numbers
	 * 
	 * @param pComplexStep
	 * @param pSimpleStep
	 * @return Data (String)
	 */
	public abstract String getData(int pComplexStep, int pSimpleStep);
	public abstract Status getResultStatus(int pComplexStep, int pSimpleStep);
	public abstract Status getExecutionStatus(int pComplexStep, int pSimpleStep);
	
	public abstract String getData(int pComplexStep);
	public abstract Status getResultStatus(int pComplexStep);
	public abstract Status getExecutionStatus(int pComplexStep);
	
	public abstract boolean checkMandate();
}
