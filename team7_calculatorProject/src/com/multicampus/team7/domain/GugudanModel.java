package com.multicampus.team7.domain;

import com.multicampus.team7.exception.DanValueOverflowException;

public class GugudanModel {

	private int dan;  //구구단 단
	private int[] gugudanResult = new int[9]; //결과 저장

	public GugudanModel(String dan) throws NumberFormatException { //구구단모델 생성자
		this.dan = Integer.parseInt(dan); 
		if (this.dan < 1 || this.dan > 999) { //String dan이 1보다 작거나 999보다 클때
			throw new DanValueOverflowException("구구단은 1~999까지 입력 가능"); //에러 메시지 출력
		}
		this.calculateGugudan();
	}
	
	public void calculateGugudan() { //구구단 계산
		for(int i = 0; i < gugudanResult.length; i++) {
			gugudanResult[i] = (i+1)*this.dan;
		}
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int[] getGugudanResult() {
		return gugudanResult;
	}

	public void setGugudanResult(int[] gugudanResult) {
		this.gugudanResult = gugudanResult;
	}
	
	
}