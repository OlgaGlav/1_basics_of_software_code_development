package by.course.glavdel_olga.linear_programs;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

import java.util.Scanner;
import static java.lang.Math.*;


public class Task_2 {

	public static void main(String[] args) {

		double a, b, c;
		double result;
		

		/* Проверка на неделимость на 0 */
		do {
			a = enterDouble("Введите значение параметра a, отличное от нуля");

		} while (a == 0);

		
		/* Ввод остальных параметров */
		b = enterDouble("Введите значение параметра b");
		c = enterDouble("Введите значение параметра c");

		
		/* Вычисление значения */

		result = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a - pow(a, 3) * c + pow(b, -2);

		
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
