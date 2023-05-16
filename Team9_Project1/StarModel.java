package Team9_Project1;
public class StarModel {
	private StringBuilder sb;

	public void square(int size) {
		sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public void upright(int size) {
		sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j >= i)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public void triangle(int size) {
		sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				sb.append("*");
			}
			for (int j = 0; j < size - i; j++) {
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public void diamond(int size) {
		sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			int temp = Math.abs(size / 2 - i);
			for (int j = 0; j < temp; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < size -(temp * 2); j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public void starstar(int size) {
		sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size * 3 - i; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < size * 6 - 3 - i * 2; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		for (int i = 0; i < size - 1; i++) {
			sb.append(" ");
		}
		for (int i = 0; i < size * 4 - 1; i++) {
			sb.append("*");
		}
		sb.append("\n");

		for (int i = 0; i < size; i++) {
			sb.append(" ");
		}
		for (int i = 0; i < size * 4 - 3; i++) {
			sb.append("*");
		}
		sb.append("\n");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < (size - i) * 2 - 1; j++) {
				sb.append("*");
			}
			for (int j = 0; j < i * 6 + 1; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < (size - i) * 2 - 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
