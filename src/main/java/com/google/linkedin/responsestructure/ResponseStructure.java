package com.google.linkedin.responsestructure;

import java.util.Objects;

import com.google.linkedin.entity.User;

public class ResponseStructure {

	
	private int status;
	private String message;
	private Object body;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	@Override
	public int hashCode() {
		return Objects.hash(body, message, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseStructure other = (ResponseStructure) obj;
		return Objects.equals(body, other.body) && Objects.equals(message, other.message) && status == other.status;
	}
	@Override
	public String toString() {
		return "ResponseStructure [status=" + status + ", message=" + message + ", body=" + body + "]";
	}
	public ResponseStructure(int status, String message, Object body) {
		super();
		this.status = status;
		this.message = message;
		this.body = body;
	}
	public ResponseStructure() {
	}
	public ResponseStructure(int status2, String message2, User savedUser) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
