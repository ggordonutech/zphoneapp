package com.zphone.zphoneapp;

/**
 * Generic Database Class
 * where T is a placeholder for intended type
 * */
public interface IDatabase<T> {
	
	boolean save(T item);
	T retrieveFirstItem();

}
