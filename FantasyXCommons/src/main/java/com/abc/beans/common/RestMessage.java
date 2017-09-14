package com.abc.beans.common;

import org.springframework.http.HttpStatus;

public class RestMessage<T>
{
	private HttpStatus status;
	private T data;
	private String message;
	
	public static <O> RestMessage<O> create(O object)
	{
		return new RestMessage<O>();
	}
	
	public HttpStatus getStatus()
	{
		return status;
	}
	public RestMessage<T> setStatus(HttpStatus status)
	{
		this.status = status;
		return this;
	}
	public T getData()
	{
		return data;
	}
	public RestMessage<T> setData(T data)
	{
		this.data = data;
		return this;
	}
	public String getMessage()
	{
		return message;
	}
	public RestMessage<T> setMessage(String message)
	{
		this.message = message;
		return this;
	}
	@Override
	public String toString()
	{
		return "RestMessage [status=" + status + ", data=" + data + ", message=" + message + "]";
	}	
}