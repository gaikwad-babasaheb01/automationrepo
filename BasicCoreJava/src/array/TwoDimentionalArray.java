package array;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		String[][] str = new String[4][2];
		str[0][0] = "Username";
		str[0][1] = "password";

		str[1][0] = "user1";
		str[1][1] = "pass1";

		str[2][0] = "user2";
		str[2][1] = "pass2";

		str[3][0] = "user3";
		str[3][1] = "pass3";

//System.out.println(str[2][1]);

		for (int r = 0; r < str.length; r++) {
			for (int c = 0; c < str[r].length; c++) {
				System.out.print(" " + str[r][c]);
			}
		}
	}

}
