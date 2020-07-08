package by.course.glavdel_olga.linear_programs;

import java.util.Scanner;
import static java.lang.Math.*;


//Для данных областей составить линейную программу, которая печатает true, если точка
//с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

public class Task_6 {

	public static void main(String[] args) {

		double coordinateX, coordinateY;
		boolean result;

		coordinateX = enterDouble("Введите координату X ");

		coordinateY = enterDouble("Введите координату Y ");

		result = checking(coordinateX, coordinateY);

		System.out.println(result);
	}

	
	private static boolean checking(double coordinateX, double coordinateY) {
		boolean result;

		if (coordinateY > 0  &&  coordinateY <= 4  &&  abs(coordinateX) <= 2)
			result = true;
		
		else if (coordinateY <= 0  &&  coordinateY >= -3  &&  abs(coordinateX) <= 4)
			result = true;
		
		else
			result = false;
		
		return result;
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
