package by.course.glavdel_olga.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

// Дан числовой ряд и некоторое число е.
// Найти сумму тех чисел ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид  a(n)=1/2^n+1/3^n

public class Test_5 {

	public static void main(String[] args) {

		int beginningOfNumberSeries;
		int endOfNumberSeries;

		double e;

		beginningOfNumberSeries = enterInt("Введите начало числового ряда ");
		endOfNumberSeries = enterInt("Введите конец числового ряда ");

		endOfNumberSeries = checkNumberSeries(beginningOfNumberSeries, endOfNumberSeries);

		e = enterDouble("Введите число е ");

		double sum = findSum(beginningOfNumberSeries, endOfNumberSeries, e);

		System.out.println("Сумма равна " + sum);
	}

	private static double findSum(int beginningOfNumberSeries, int endOfNumberSeries, double e) {

		double sum = 0;

		for (int n = beginningOfNumberSeries; n <= endOfNumberSeries; n++) {

			if ((abs(1 / pow(2, n) + 1 / pow(3, n))) >= e) {

				sum = sum + abs(1 / pow(2, n) + 1 / pow(3, n));
			}
		}

		if (sum == 0) {
			System.out.println("В данном числовом ряду нет чисел, удовлетворяющих условию. ");
		}

		return sum;
	}

	private static int checkNumberSeries(int beginningOfNumberSeries, int endOfNumberSeries) {

		while (endOfNumberSeries < beginningOfNumberSeries) {

			System.out.println("Конец числового ряда должен быть больше или равен " + beginningOfNumberSeries);

			endOfNumberSeries = enterInt("Введите конец числового ряда еще раз");
		}

		return endOfNumberSeries;
	}

	private static double enterDouble(String message) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Вы ввели некорректные данные. " + message);
		}

		return scanner.nextDouble();
	}

	private static int enterInt(String message) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Вы ввели некорректные данные. " + message);
		}

		return scanner.nextInt();
	}
}
