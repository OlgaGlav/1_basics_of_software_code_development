package by.course.glavdel_olga.if_else_programs;

import java.util.Scanner;

//Найти значение функции при разных значениях х.

public class Task_5 {

	public static void main(String[] args) {

		double x;

		double function;

		x = enterDouble("Введите значение параметра Х ");

		function = decision(x);

		System.out.println("Значение функции равно " + function);

	}

	private static double decision(double x) {
		if (x >= 3) {
			return 1 / (Math.pow(x, 3) + 6);
		}
		return Math.pow(x, 2) - 3 * x + 9;
	}

	private static double enterDouble(String message) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		return scanner.nextDouble();
	}

}
