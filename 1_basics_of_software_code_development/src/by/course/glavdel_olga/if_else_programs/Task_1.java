package by.course.glavdel_olga.if_else_programs;

import java.util.Scanner;

// Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным

public class Task_1 {

	public static void main(String[] args) {

		double angleDegreeFirst;
		double angleDegreeSecond;

		boolean isExist;
		boolean isRightTriangle;

		angleDegreeFirst = enterDouble("Введите величину первого угла в градусах");
		angleDegreeSecond = enterDouble("Введите величину второго угла в градусах");

		isExist = checkingExist(angleDegreeFirst, angleDegreeSecond);

		if (isExist)
			isRightTriangle = checkingRightTriangle(angleDegreeFirst, angleDegreeSecond);

	}

	
	private static boolean checkingRightTriangle(double angleDegreeFirst, double angleDegreeSecond) {

		boolean isRightTriangle = false;

		if ((angleDegreeFirst + angleDegreeSecond) == 90) {

			isRightTriangle = true;
			System.out.println("Треугольник прямоугольный.");

		} else {
			System.out.println("Треугольник не прямоугольный.");
		}

		return isRightTriangle;
	}

	
	private static boolean checkingExist(double angleDegreeFirst, double angleDegreeSecond) {

		boolean isExist = false;

		if ((angleDegreeFirst + angleDegreeSecond) <= 180 && angleDegreeFirst!=0  &&  angleDegreeSecond!=0) {

			isExist = true;
			System.out.println("Такой треугольник существует.");

		} else {
			System.out.println("Такого треугольника не существует.");
		}

		return isExist;
	}

	
	private static double enterDouble(String message) {

		Scanner scaner = new Scanner(System.in);

		System.out.println(message);

		while (!scaner.hasNextDouble()) {
			scaner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		return scaner.nextDouble();
	}

}
