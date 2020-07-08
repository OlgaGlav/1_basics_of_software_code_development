package by.course.glavdel_olga.linear_programs;

import java.util.Scanner;
import static java.lang.Math.*;

//Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в форме:
//HHч ММмин SSсек

public class Task_5 {

	public static void main(String[] args) {
		long numberOfSeconds;

		int hour, minut, second;

		numberOfSeconds = enterLong("Введите количество секунд ");

		hour = (int) (numberOfSeconds / 3600);

		minut = (int) ((numberOfSeconds - hour * 3600) / 60);

		second = (int)(numberOfSeconds - hour * 60 * 60 - minut * 60);

		format(hour, "ч ");
		format(minut, "мин ");
		format(second, "сек.");

	}

	private static void format(long time, String name) {
		if (time == 0) {
			System.out.print("00" + name);
		} else if (0 < abs(time) & abs(time) < 10) {
			System.out.print(" 0" + abs(time) + name);
		} else {
			System.out.print(abs(time) + name);
		}

	}

	private static long enterLong(String message) {

		Scanner scaner = new Scanner(System.in);

		System.out.println(message);

		while (!scaner.hasNextLong()) {
			scaner.next();
			System.out.println("Некорректный ввод. ");
		}

		return scaner.nextLong();

	}

}
