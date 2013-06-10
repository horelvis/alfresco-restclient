package uk.co.techblue.alfresco.dto.error;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.alfresco.dto.BaseDto;

public class ErrorResponse extends BaseDto {

	private static final long serialVersionUID = -5904389506284205882L;

	@JsonProperty
	private ErrorStatus status;

	@JsonProperty("message")
	private String errorMessage;

	@JsonProperty
	private String exception;

	@JsonProperty
	private List<String> callstack;

	@JsonProperty
	private String server;

	@JsonProperty
	private String time;

	public ErrorStatus getStatus() {
		return status;
	}

	public void setStatus(ErrorStatus status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public List<String> getCallstack() {
		return callstack;
	}

	public void setCallstack(List<String> callstack) {
		this.callstack = callstack;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}