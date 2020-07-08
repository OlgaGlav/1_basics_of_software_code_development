package by.course.glavdel_olga.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа

public class Test_8 {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		firstNumber=enterInt("Введите первое число ");
		secondNumber = enterInt("Введите второе число ");
		
		System.out.println("Общие цифры: ");
		decision(firstNumber,secondNumber);

	}

private static void decision(int firstNumber, int secondNumber) {
		String first=String.valueOf(firstNumber);
		String second=String.valueOf(secondNumber);
		
		for(int i=0; i<=9; i++) {
			if(first.contains(String.valueOf(i))&&second.contains(String.valueOf(i))) {
				System.out.print(i+"  ");
			}
		}
		
	}

//	private static void decision(int firstNumber, int secondNumber) {
//		int degree=2;
//		int partBeforePoint=(int)firstNumber/10;
//		int partAfterPoint=firstNumber%10;
//		
//		while(partAfterPoint!=0) {
//			partBeforePoint=(int)firstNumber/10;
//		}
//		
//	}

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
