package com.crdt.implement.analyzer;

import lombok.Getter;

@Getter
public class UrlNotAccessibleException extends RuntimeException{
	
	private String url;
	
	public UrlNotAccessibleException(String url, Throwable cause) {
		super("url is  not accesible",cause);
		this.url = url;
	}
	
	public UrlNotAccessibleException(String url) {
		this(url,null);
	}

}
