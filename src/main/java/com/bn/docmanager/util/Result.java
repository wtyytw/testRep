package com.bn.docmanager.util;

/**
 * @author wty
 * @date 2020/11/29 14:42
 */
public class Result< T > {
	
	private T data;
	private Long total;
	private int code;
	private String msg;
	
	public Long getTotal( ) {
		return total;
	}
	
	public void setTotal( Long total ) {
		this.total = total;
	}
	
	public int getCode( ) {
		return code;
	}
	
	public void setCode( int code ) {
		this.code = code;
	}
	
	public String getMsg( ) {
		return msg;
	}
	
	public void setMsg( String msg ) {
		this.msg = msg;
	}
	
	public T getData( ) {
		return data;
	}
	
	public void setData( T data ) {
		this.data = data;
	}
}
