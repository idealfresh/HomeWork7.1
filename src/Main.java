import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Напишете програма, която обхожда предварително създаден двумерен
		// масив от числа и извежда на екрана само четните

		int massive[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 1, 5, 7 } };
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				if (massive[i][j] % 2 == 0) {
					;
					{
						System.out.println(massive[i][j]);
					}

				}
			}
		}

	}
}
