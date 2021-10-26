package com.cg.oct12.batch3.day5.poly;

//user-defined exception / custom exception 

public class CanNotVoteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super();
	}

	CanNotVoteException(String message) {
		super(message);
	}
}