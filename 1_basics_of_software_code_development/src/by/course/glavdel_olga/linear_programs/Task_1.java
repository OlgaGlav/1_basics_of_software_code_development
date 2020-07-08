package by.course.glavdel_olga.linear_programs;

//Найдите значение функции  z=(( a - 3 ) * b / 2) + c 

import java.util.Scanner;

public class Task_1 {
	
	public static void main(String[] args) {

		double a = enterDouble("Введите значение параметра a: ");

		double b = enterDouble("Введите значение параметра b: ");

		double c = enterDouble("Введите значение параметра c: ");

		double z = ((a - 3) * b / 2) + c;

		System.out.println("(( a - 3 ) * b / 2) + c =" + z);

	}

	private static double enterDouble(String message) {
		
		double result;

		Scanner scaner = new Scanner(System.in);

		System.out.println(message);

		while (!scaner.hasNextDouble()||!scaner.hasNextInt()) {
			scaner.next();
			System.out.println("Некорректный ввод. " + message);
		}
		
		result=scaner.nextDouble();
		
		return result;
		
	}
	

}
