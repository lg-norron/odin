package com.southwind.odin.helper.model;

import java.util.List;

public class ToutiaoMsg {
	
	private String message;
	private List<ToutiaoNews> data;
	private String next;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ToutiaoNews> getData() {
		return data;
	}
	public void setData(List<ToutiaoNews> data) {
		this.data = data;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	
	

}
