package by.course.glavdel_olga.if_else_programs;

import java.util.Scanner;

//Заданы размеры А,В прямоугольного отверстия и размеры x, y, z кирпича.
//Определить, пройдет ли кирпич через отверстие.

public class Task_4 {

	public static void main(String[] args) {
		double sideA = 10.0;
		double sideB = 8.0;

		double brickSideX;
		double brickSideY;
		double brickSideZ;

		boolean isPass;

		brickSideX = enterDouble("Введите сторону кирпича X ");
		brickSideY = enterDouble("Введите сторону кирпича Y ");
		brickSideZ = enterDouble("Введите сторону кирпича Z ");

		if (chekingSide(brickSideX, brickSideY, sideA, sideB) || chekingSide(brickSideY, brickSideZ, sideA, sideB)
				|| chekingSide(brickSideZ, brickSideX, sideA, sideB)) {
			isPass = true;
			System.out.println("Кирпич пройдет.");

		} else {
			System.out.println("Кирпич не пройдет.");
		}

	}

	private static boolean chekingSide(double brickSideFirst, double brickSideSecond, double sideA, double sideB) {

		if ((brickSideFirst <= sideA && brickSideSecond <= sideB)
				|| (brickSideFirst <= sideB && brickSideSecond <= sideA)) {

			return true;
		}
		return false;
	}

	private static double enterDouble(String message) {

		Scanner scanner = new Scanner(System.in);

		double result;

		System.out.println(message);

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Некорректный ввод " + message);

		}

		result = testSideIsPositive(scanner.nextDouble(), message);

		return result;
	}

	private static double testSideIsPositive(double temp, String message) {

		if (temp <= 0.0) {

			System.out.println("Вы ввели отрицательное значение стороны кирпича. ");
			enterDouble(message);
		}

		return temp;

	}

}
