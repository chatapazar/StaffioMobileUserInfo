package userinfo.restclient.dto;

public class StaffioLoginResultDto {
	
	private String Message;
	private String Data;
	private String InnerException;
	private boolean Complete;
	private String Result;
	private String objData;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getInnerException() {
		return InnerException;
	}
	public void setInnerException(String innerException) {
		InnerException = innerException;
	}

	public boolean isComplete() {
		return Complete;
	}
	public void setComplete(boolean complete) {
		Complete = complete;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public String getObjData() {
		return objData;
	}
	public void setObjData(String objData) {
		this.objData = objData;
	}
	
	
	
}
