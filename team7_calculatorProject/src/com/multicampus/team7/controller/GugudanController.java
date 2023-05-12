package com.multicampus.team7.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.multicampus.team7.domain.GugudanModel;
import com.multicampus.team7.service.GugudanService;
import com.multicampus.team7.view.GugudanView;

public class GugudanController {
	private GugudanService guguService = new GugudanService(); //gugudanService 객체생성
	private GugudanView guguView = new GugudanView(); //guguView 객체생성
	
	public void viewMenu() {
		guguView.showMenu(); // view에 요청
	}
	
	public void inputDan(String dan) {
		guguService.inputDan(dan); //service에 요청
	}
	
	public void viewResult() { //구구단 결과값
		int dan = guguService.getDan(); 
		int[] gugudanResult = guguService.getGugudanResult(); //결과 gugudanResult에 배열로 저장
		guguView.showResult(dan, gugudanResult);
	}
}
