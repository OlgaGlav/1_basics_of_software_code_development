package by.course.glavdel_olga.linear_programs;

import java.util.Scanner;
import static java.lang.Math.*;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(x*y)

public class Task_3 {

	public static void main(String[] args) {

		double angleDegree_X, angleDegree_Y;
		double result;

		angleDegree_X = enterDouble("Введите угол Х");

		angleDegree_Y = enterDouble("Введите угол Y");

		result = ((sin(angleDegree_X) + cos(angleDegree_Y)) / (cos(angleDegree_X) - sin(angleDegree_Y))) * tan(angleDegree_X * angleDegree_Y);

		System.out.println("Значение выражения:  " + result);

	}

	static double enterDouble(String message) {

		Scanner scaner = new Scanner(System.in);

		System.out.println(message);

		while (!scaner.hasNextDouble()) {
			scaner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		return scaner.nextDouble();
	}

}
