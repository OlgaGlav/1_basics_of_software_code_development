package by.course.glavdel_olga.if_else_programs;

import java.util.Scanner;

//Даны три точки А(х1, у1),  В(х2,у2) и С(х3,у3). 
//Определить, будут ли они расположены на одной прямой.

//точки на одной прямой, если (х3 - х1) / (х2 - х1 ) = (у3 - у1) / (у2 - у1)
//чтобы не проверять знаменатель на 0, перепишем (x3 - x1) * (y2 - y1) = (y3 - y1) * (x2 - x1)
//т.к.числа double, то при вычислении может быть незначительная погрешность, предположим она должна быть меньше 0,000001

public class Task_3 {

	public static void main(String[] args) {

		double x1;
		double x2;
		double x3;

		double y1;
		double y2;
		double y3;

		boolean isOneLine;

		x1 = enterDouble("Введите координату первой точки х1");
		y1 = enterDouble("Введите координату первой точки y1");

		x2 = enterDouble("Введите координату второй точки х2");
		y2 = enterDouble("Введите координату второй точки y2");

		x3 = enterDouble("Введите координату третьей точки х3");
		y3 = enterDouble("Введите координату третьей точки y3");

		isOneLine = checkingIsOneLine(x1, y1, x2, y2, x3, y3);

		System.out.println(isOneLine);

	}

	private static boolean checkingIsOneLine(double x1, double y1, double x2, double y2, double x3, double y3) {

		if (((x3 - x1) * (y2 - y1)) - ((x2 - x1) * (y3 - y1)) <= 0.000001)
			return true;

		return false;

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
