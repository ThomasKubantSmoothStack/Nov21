package com.ss.jb.assignment1;

public class SingletonDoubleCheckedLocking {
	private static volatile SingletonDoubleCheckedLocking instance;
	
	public static SingletonDoubleCheckedLocking getInstance() {
		if(instance == null) {
			synchronized (SingletonDoubleCheckedLocking .class) {
				instance = new SingletonDoubleCheckedLocking();
			}
		}
		return instance;
	}
}

