package by.course.glavdel_olga.if_else_programs;

import java.util.Scanner;

// Найти max{min(a,b), min(c,d)}

public class Task_2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;

		double minimumOfFirstPair;
		double minimumOfSecondPair;

		double maximumOfPaif;

		a = enterDouble("Введите значение параметра а: ");
		b = enterDouble("Введите значение параметра b: ");
		c = enterDouble("Введите значение параметра c: ");
		d = enterDouble("Введите значение параметра d: ");

		minimumOfFirstPair = findMinimum(a, b);
		minimumOfSecondPair = findMinimum(c, d);

		maximumOfPaif = findMaximum(minimumOfFirstPair, minimumOfSecondPair);

		System.out.println("Ответ: " +maximumOfPaif);
	}

	private static double findMaximum(double first, double second) {
		double result = first;

		if (second > first) {
			result = second;
		}
		return result;
	}

	private static double findMinimum(double first, double second) {

		double result = first;

		if (second < first) {
			result = second;
		}
		return result;
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
