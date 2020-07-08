package by.course.glavdel_olga.cycles;

import java.util.Scanner;

//Вычислить значение функции на отрезке [a,b] с шагом h
//x, если х>2;  -x, если x<=2

public class Test_2 {

	public static void main(String[] args) {

		double begin;
		double end;

		double step;

		begin = enterDouble("Введите начало отрезка ");
		end = enterDouble("Введите конец отрезка ");

		step = enterDouble("Введите шаг h ");

		decision(begin, end, step);

	}

	private static void decision(double begin, double end, double step) {
		
		for (double i = begin; i <= end; i = i + step) {
			
			if (i <= 2) {
				
				System.out.println("При х = " + i + " значение функции равно " + (-i));
				
			} else {
				
				System.out.println("При х = " + i + " значение функции равно " + i);
			}
		}

	}

	private static double enterDouble(String message) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Вы ввели некорректное значение. " + message);

		}

		return scanner.nextDouble();
	}

}
