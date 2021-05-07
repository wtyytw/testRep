package com.bn.docmanager.model;

import javax.persistence.Transient;

/**
 * @author wty
 * @date 2020/11/30 20:10
 */
public class BaseModel {
	
	@Transient
	Integer index;
	
	@Transient
	Integer size;
	
	public Integer getIndex( ) {
		return index;
	}
	
	public void setIndex( Integer index ) {
		this.index = index;
	}
	
	public Integer getSize( ) {
		return size;
	}
	
	public void setSize( Integer size ) {
		this.size = size;
	}
}
