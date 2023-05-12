package com.multicampus.team7.service;

import com.multicampus.team7.domain.GugudanModel;

public class GugudanService {
	private GugudanModel guguModel;

	public void inputDan(String dan) {
		guguModel = new GugudanModel(dan); // dan을 넣어야함
	}

	public int getDan() {
		if (guguModel.getDan() == 0) {
			// getDan값이 없으면 에러
		}
		return guguModel.getDan();
	}

	public int[] getGugudanResult() {
		if (guguModel.getGugudanResult() == null) {
			// getGugudanResult값이 없으면 에러
		}
		return guguModel.getGugudanResult();
	}
}
