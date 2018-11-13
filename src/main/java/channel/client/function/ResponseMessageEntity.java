package channel.client.function;

import java.util.UUID;

public class ResponseMessageEntity extends MessageEntity{
	private String mCode;
	private String mMessage;
	private Status mExecutionStatus = Status.IN_PROGRESS;
	private Status mResultStatus = Status.OPEN;
	
	
	public ResponseMessageEntity(UUID pIdKey){
		super(pIdKey);
	}
	
//	public ResponseMessageEntity(ComplexTransactionStepEntity pCTS){		
//		super(pCTS.getComplexTransaction().getIdKey());
//	}
	
	public String getCode() {
		return mCode;
	}
	public void setCode(String pCode) {
		mCode = pCode;
	}
	public String getMessage() {
		return mMessage;
	}
	public void setMessage(String pMessage) {
		mMessage = pMessage;
	}

	public Status getExecutionStatus() {
		return mExecutionStatus;
	}

	public void setExecutionStatus(Status pExecutionStatus) {
		mExecutionStatus = pExecutionStatus;
	}

	public Status getResultStatus() {
		return mResultStatus;
	}

	public void setResultStatus(Status pResultStatus) {
		mResultStatus = pResultStatus;
	}
}
