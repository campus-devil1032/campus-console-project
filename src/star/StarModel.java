package star;

public class StarModel {

	public void setSquare(int rows) {
		// 사각형 별모양

		for (int i = 0; i < rows; i++) {
			System.out.println("**********");
		}

	}

	/////

	public void setHalfTriangle(int rows) {
		// 좌측 직각 삼각형
		System.out.println();

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	/////

	public void setLRHalfTriangle(int rows) {
		// 우측 직각 삼각형
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 2 * (rows - i); j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/////

	public void setPyramidTriangle(int rows) {
		// 좌측 피라미드형 삼각형
		System.out.println();

		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	/////

	public void setBasicTriangle(int rows) {
		// 일반 삼각형
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/////

	public void setDiamond(int rows) {
		// 다이아몬드형 별 찍기
		System.out.println();

		// 위쪽 부분
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = rows - 2; i >= 0; i--) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();

	}

	/////

	public void setHourGlass(int rows) {
		// 모래시계형 별 찍기
		System.out.println();

		// 위쪽 부분
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 아래쪽 부분
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = i; k < rows; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	/////

	public void setDiagonal(int rows) {
		// 대각선 별 찍기
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		System.out.println();
	}

	/////

	public void setVPattern(int rows) {
		// V자 별 찍기
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows * 2 - 1; j++) {
				if (j == i || j == rows * 2 - 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	/////

	public void setRealStar(int rows) {
		// 별로 별 만들기
		System.out.println();

		/* 상단 */
		// 맨위 정삼각형

		for (int i = 0; i < rows; i += 2) {
			// 입력한 수만큼 오른쪽으로 삼각형 땡겨줌
			for (int a = 0; a < rows; a++) {
				System.out.print("  ");
			}
			// 나머지는 마름모할때 윗부분삼각형과 동일함
			for (int j = rows; j >= i; j -= 2) {
				System.out.print("  ");
			}
			for (int star = 0; star <= i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		/* 중단 */
		int count = rows * 3; // 중단의 최대길이

		for (int i = 0; i < rows / 2 + 1; i++) { // 높이를 입력한 크기의 2분의1정도로 하여 균형을 맞춤
			System.out.print("  "); // 줄맞춤용
			for (int j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
				System.out.print("  ");
			}
			for (int k = 0; k < rows * 3; k++) { // 입력한 크기의 3배만큼 별을 찍어야함
				if (k < count) { // 단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
					System.out.print("* ");
				}

			}
			// 몸통 한줄 더 키울려고 추가함
			if (i == rows / 2) {
				System.out.println();
				System.out.print("  "); // 줄맞춤용
				for (int j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
					System.out.print("  ");
				}
				for (int k = 0; k < rows * 3; k++) { // 입력한 크기의 3배만큼 별을 찍어야함
					if (k < count) { // 단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
						System.out.print("* ");
					}

				}
			}

			count -= 2; // 다음에 찍힐 별을 2개줄임
			System.out.println();
		}

		/* 하단 */
		count = rows;// 왼쪽밑둥용(중단에서 사용한거 재활용)
		int count2 = 0;// 오른쪽밑둥용
		for (int i = 0; i < rows / 2 + 1; i++) { // 하단줄의 개수를 밑변개수의 절반만큼으로함
			System.out.print("  ");
			for (int j = i; j < rows / 2; j++) { // 절반만큼의 공백을 띄움
				System.out.print("  ");
			}
			// 별(왼쪽밑)
			for (int k = 0; k < rows; k++) { // 입력개수만큼 별찍기를하는데 k가 count보다 작을때만 별을 찍음
				if (k < count) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  "); // 정가운데 공백

			// count2를 이용해 오른쪽밑둥을 오른쪽을 떙겨줌
			for (int j = 0; j < count2; j++) {
				System.out.print("  ");
			}
			// 별(오른쪽밑)
			for (int k = 0; k < rows; k++) {
				if (k < count) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			count -= 2;
			count2 += 4;
			System.out.println();
		}

	}

}
