package com.multicampus.team7.view;

public class GugudanView {

	public void showMenu() {
		System.out.println("구구단 - 원하는 단을 입력하면 구구단 출력 ");
		System.out.println("단 수를 입력하세요");
	}

	public void showResult(int dan, int[] gugudanResult) {
		for (int i = 1; i < gugudanResult.length; i++) {
			System.out.println(dan + "x" + (i + 1) + "=" + gugudanResult[i]); // gugudanResult[i]를 넣어줘야함
		}
	}
}