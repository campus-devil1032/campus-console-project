package com.multicampus.team7;

import com.multicampus.team7.service.AppService;

public class Main {
	public static void main(String[] args) {
		AppService appservice = new AppService(); //appservice 객체생성
		appservice.start();  //appservice 시작
	}
}
