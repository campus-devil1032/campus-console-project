package com.multicampus.team7.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanController {

	public void gugudanRun() {
		
		Scanner scan = new Scanner(System.in);
		int dan;
		GugudanModel gugudanModel = new GugudanModel();
		GugudanView gugudanView = new GugudanView();
		
		System.out.println("������ ���α׷��Դϴ�.");
		while(true) {
			gugudanView.getInput();
			try {
				dan = scan.nextInt();
				
				if(dan == 0) { //�����ϱ� ����
					gugudanView.exitMassage();
					System.exit(0);
				}
				else if(dan <1 || dan >99) { //���� ����� throw
					throw new IllegalArgumentException();
				}else
				{
					gugudanModel.gugudanRun(dan); //�ùٸ� ������ model ������ ����
				}		
			}
			catch(InputMismatchException e){ //���ڸ��� �ٸ� �� error (String�̳� ����?)
				scan.next();
				gugudanView.errorMassageInputMismatchException();
			}
			catch(IllegalArgumentException e) { // ���� �Ѵ� ����error ??
				gugudanView.errorMassageIllegalArgumenException();
			}
		}
	}
}