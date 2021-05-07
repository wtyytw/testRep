package com.bn.docmanager.util;

import javax.persistence.Transient;

/**
 * @author wty
 * @date 2020/11/29 14:53
 */
public class BaseModel {
	
	@Transient
	Integer index;
	@Transient
	Integer Size;
	
	public Integer getIndex( ) {
		return index;
	}
	
	public void setIndex( Integer index ) {
		this.index = index;
	}
	
	public Integer getSize( ) {
		return Size;
	}
	
	public void setSize( Integer size ) {
		Size = size;
	}
}
