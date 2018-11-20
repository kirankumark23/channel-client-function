package channel.client.function;

public abstract class AbstractFunction {

	/**
	 * Execute business logic
	 */
	public abstract void execute(ResponseMessageEntity pResponse, CustomThreadLocal pCustomThreadLocal);	
	
	/**
	 * Implement tasks to be completed before business logic execution
	 * <li> Logging
	 * <li> Initialization
	 */
	public abstract void prolog(ResponseMessageEntity pResponse, CustomThreadLocal pCustomThreadLocal);

	/**
	 * Implement tasks to be completed after business logic execution
	 * <li> Logging
	 * <li> Resource deallocation
	 */	
	public abstract void epilog(ResponseMessageEntity pResponse, CustomThreadLocal pCustomThreadLocal);

	/**
	 * In the event of an exception, this function will be called to log all contextual data, to help with investigation
	 */
	public abstract void errorlog(ResponseMessageEntity pResponse, CustomThreadLocal pCustomThreadLocal);
}
