package com.multicampus.team7.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.multicampus.team7.controller.GugudanController;
import com.multicampus.team7.exception.DanValueOverflowException;

public class AppService {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
	private GugudanController gugudanController = new GugudanController(); // 컨트롤러
	private String input; // 입력 값

	// TODO 사용자 입력 받기 dan - BufferedReader;
	// TODO 메뉴만들기 1. 구구단 2. 종료
	// TODO 구구단은 controller를 통해 로직 처리
	// TODO 에러는 여기서 처리 try-catch
	// TODO 메뉴의 view는 이곳에 method를 만들어 처리
	// TODO while문으로 q를 입력받아야 종료

	public void start() {
		while (true) {
			input = null; // 입력 값 초기화
			menuView(); // 메뉴 보여주기
			try {
				
				input = br.readLine(); // 입력받은 내용 input에 저장

				if (input.toLowerCase().equals("q")) { // "q"를 입력 했을 때(대소문자 구분없이 소문자"q"로 바꿈)
					System.out.println("프로그램 종료");
					break;
					
				} else if (input.toLowerCase().equals("g")) { // "g"를 입력 했을 때(대소문자 구분없이 소문자"g"로 바꿈)
					this.doGugudan(); 
					
				} else if (input.toLowerCase().equals("c")) {// "c"를 입력 했을 때(대소문자 구분없이 소문자"c"로 바꿈)
					// 계산기
				} else if (input.toLowerCase().equals("s")) {// "s"를 입력 했을 때(대소문자 구분없이 소문자"s"로 바꿈)
					// 별찍기
				} else {
					System.out.println("잘못 된 입력입니다.");
					//throw new
				}
			}catch (DanValueOverflowException e) {
				
			}
			catch (IOException e) { // 예외처리
				System.out.println("잘못 된 입력입니다asd.");
			}
		}
	}

	// 메뉴 설명
	private void menuView() {
		System.out.println("구구단, 계산기, 별찍기 프로그램입니다.");
		System.out.println("======================================");
		System.out.println("\"G\" 입력시 구구단 - 원하는 단을 입력하면 구구단 출력 ");
		System.out.println("\"C\" 입력시 계산기 - 원하는 계산식을 입력하면 계산기 출력");
		System.out.println("\"S\" 입력시 별찍기 - 원하는 수를 입력하면 별찍기 출력");
		System.out.println("\"Q\" 입력시 프로그램을 종료합니다.");
		System.out.println("======================================");
		
	}

	private void doGugudan() throws IOException {
		gugudanController.viewMenu(); // 컨트롤러에 view 요청
		String dan = br.readLine(); // 단을 선택받음 - 에러는 메인으로 넘김
		gugudanController.inputDan(dan); // 구구단 모델에 데이터 입력
		gugudanController.viewResult(); // 컨트롤러에 결과값 view 요청
	}

}
