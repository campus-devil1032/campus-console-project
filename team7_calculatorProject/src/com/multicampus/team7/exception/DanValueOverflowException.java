package com.multicampus.team7.exception;

public class DanValueOverflowException extends RuntimeException { 
	//Runtime을 넣지않으면 model에서 GugudanModel 부분에 throws 추가해야함 DanValueOverflowException
	public DanValueOverflowException(String message){
		System.out.println(message);
	}
}
