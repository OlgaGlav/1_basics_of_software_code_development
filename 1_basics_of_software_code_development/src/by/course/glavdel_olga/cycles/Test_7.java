package by.course.glavdel_olga.cycles;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры

public class Test_7 {

	public static void main(String[] args) {
		int startOfNumbers;
		int endOfNumbers;

		startOfNumbers = enterInt("Введите первое число ");
		endOfNumbers = enterInt("Введите последнее число ");

		endOfNumbers = checkNumberSeries(startOfNumbers, endOfNumbers);

		findDivider(startOfNumbers, endOfNumbers);

	}

	private static void findDivider(int startOfNumbers, int endOfNumbers) {
		
		for (int i = startOfNumbers; i <= endOfNumbers; i++) {
			
			System.out.println("Для числа "+i+" делители: ");
			
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					System.out.print(j+"  ");
				}
			}
			System.out.println();
		}

	}

	private static int checkNumberSeries(int startOfNumbers, int endOfNumbers) {

		while (endOfNumbers < startOfNumbers) {

			System.out.println("Последнее число должно быть больше или равно " + startOfNumbers);

			endOfNumbers = enterInt("Введите последнее число еще раз");
		}

		return endOfNumbers;
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
