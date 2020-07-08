package by.course.glavdel_olga.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое положительное целое число,
//а программа суммирует все числа от 1 до введеного пользователем числа

public class Test_1 {

	public static void main(String[] args) {

		int number;

		long sum;

		number = enterInt("Введите целое число. ");

		sum = findSum(number);

		System.out.println("Сумма чисел равна " + sum);

	}

	private static long findSum(int number) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	private static int enterInt(String message) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			
			scanner.next();
			System.out.println("Вы ввели некорректное значение. " + message);
		}

		int temp = checkingIsPositive(scanner.nextInt());

		return temp;
	}

	private static int checkingIsPositive(int number) {
		
		if (number <= 0) {
			return 1;
		}
		
		return number;
	}

}
